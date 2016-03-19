
/*Job of class:-
        logical add the two Chance values
        subtract chance values
        */

package probability;

import exception.IllegalArgumentException;

public class Probability {
    private double probability;

    private Probability(double probability) {
        this.probability = probability;
    }

    public static Probability createProbability(double probability) throws IllegalArgumentException {
        if(probability < 0 ||probability>1)
            throw new IllegalArgumentException("Probability can Not be Less than 0 and greater than 1");
        return new Probability(probability);
    }

    public Probability not() throws IllegalArgumentException {
        return createProbability(1- probability);
    }

    public Probability and(Probability p) throws IllegalArgumentException {
        return createProbability(p.probability * this.probability);
    }
    public Probability or(Probability p) throws IllegalArgumentException {
        Probability notOfA = this.not();
        Probability notOfB = p.not();
        Probability and = notOfA.and(notOfB);
        return and.not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;
        return Double.compare(that.probability, probability) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }

}
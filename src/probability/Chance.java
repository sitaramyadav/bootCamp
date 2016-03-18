
/*Job of class:-
        is to create chance object
        logical add the two Chance values
        subtract chance values
        */

        package probability;

import ExceptionHandler.InvalidProbabilityException;

public class Chance {
    private double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance createChance(double value) throws InvalidProbabilityException {
        if (value < 0 || value > 1)
            throw new InvalidProbabilityException(value);
        return new Chance(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chance chance = (Chance) o;
        return Double.compare(chance.value, value) == 0;

    }

    public Chance subtract(int value) throws InvalidProbabilityException {
        return createChance(value - this.value);
    }

    public Chance add(Chance otherChance) throws InvalidProbabilityException {
        return createChance(this.value * otherChance.value);
    }
}
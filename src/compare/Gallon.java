package compare;

public class Gallon implements StandardUnit{
    private final double volume;

    public Gallon(double volume) {
        this.volume = volume;
    }

    @Override
    public double convertIntoStandardUnit() {
        return this.volume*3780;
    }
}


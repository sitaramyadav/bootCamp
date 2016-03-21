package measurement;

public enum VolumeUnit implements Unit {
    LITRE (1),
    GALLON(3.78);

    private double baseFactor;

    VolumeUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }

    public double getBaseFactor() {
        return this.baseFactor;
    }

    @Override
    public Unit getBaseUnit() {
        return VolumeUnit.LITRE;
    }
}

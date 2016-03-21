package measurement;
public enum LengthUnit implements Unit {
    FEET(12),
    INCH(1),
    CM(0.4),
    MM(0.04);

    private double baseFactor;

    LengthUnit(double baseFactor) {
        this.baseFactor = baseFactor;
    }

    public double getBaseFactor() {
        return baseFactor;
    }

    @Override
    public Unit getBaseUnit() {
        return LengthUnit.INCH;
    }

}

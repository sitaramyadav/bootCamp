package compare;

public class Millimeter implements StandardUnit  {

   private final double length;

    public Millimeter(double length) {

        this.length = length;
    }

    @Override
    public double convertIntoStandardUnit() {
        return this.length;
    }
}

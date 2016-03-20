package compare;

public class Liter implements StandardUnit{
    private  final double volume;

    public Liter(double volume) {
        this.volume = volume;
    }

    @Override
    public double convertIntoStandardUnit() {
        return this.volume*1000;
    }
}


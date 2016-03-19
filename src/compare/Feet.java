package compare;

public class Feet implements StandardUnit{
    double value;
    public Feet(double value){
        this.value = value;
    }

    @Override
    public double convertIntoStandardUnit() {
        return this.value*25.4*12;
    }
}

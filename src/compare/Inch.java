package compare;

public class Inch implements StandardUnit {
    double value;

    public Inch(double unit) {
        this.value = unit;
    }
    @Override
    public double convertIntoStandardUnit(){
        return this.value*25.4;
    }
}

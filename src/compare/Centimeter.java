package compare;

public class Centimeter implements StandardUnit{
    double unit;
    public Centimeter(double unit){
        this.unit = unit;
    }
    @Override
    public double convertIntoStandardUnit() {
        return this.unit*10;
    }
}

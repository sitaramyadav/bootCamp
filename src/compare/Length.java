package compare;

public class Length {
    StandardUnit unit1;
    StandardUnit unit2;
    public Length(StandardUnit unit1, StandardUnit unit2){
        this.unit1 = unit1;
        this.unit2 = unit2;
    }
    public boolean compare(){
        return unit1.convertIntoStandardUnit()==unit2.convertIntoStandardUnit();
    }

    public double addTwoLength(){
        return unit1.convertIntoStandardUnit()+unit2.convertIntoStandardUnit();
    }
}

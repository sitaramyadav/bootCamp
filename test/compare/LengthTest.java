package compare;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void compareLengthShouldCompareFeetWithInches() throws Exception {
        Feet feet=new Feet(1);
        Inch inch=new Inch(12);
        Length cmp=new Length(feet,inch);
        Assert.assertTrue(cmp.compare());
    }
    @Test
    public void comparisonShouldCompareFeetWithFeet() throws Exception {
        Feet feet1=new Feet(1);
        Feet feet2=new Feet(1);

        Length cmp=new Length(feet1,feet2);

        Assert.assertTrue(cmp.compare());
    }

    @Test
    public void comparisonShouldCompareInchWithInch() throws Exception {
        Inch inch1=new Inch(1);
        Inch inch2=new Inch(1);

        Length cmp=new Length(inch1,inch2);

        Assert.assertTrue(cmp.compare());
    }
    @Test
    public void comparisonShouldCompareInchWithCentimeter() throws Exception {
        Inch inch1=new Inch(1);
        Centimeter centimeter=new Centimeter(2.54);

        Length cmp=new Length(inch1,centimeter);

        Assert.assertTrue(cmp.compare());
    }
    @Test
    public void comparisonShouldCompareCentimeterWithCentimeter() throws Exception {
        Centimeter centimeter1=new Centimeter(1);

        Centimeter centimeter2=new Centimeter(1);

        Length cmp=new Length(centimeter1,centimeter2);

        Assert.assertTrue(cmp.compare());
    }
    @Test
    public void comparisonShouldCompareCentimeterWithMillimeter() throws Exception {
        Centimeter centimeter=new Centimeter(1);

        Millimeter millimeter =new Millimeter(10);

        Length cmp=new Length(centimeter, millimeter);

        Assert.assertTrue(cmp.compare());
    }

    @Test
    public void comparisonShouldCompareGallonWithLiter() throws Exception {
        Gallon gallon=new Gallon(1);

        Liter liter =new Liter(3.78);

        Length cmp=new Length(gallon, liter);

        Assert.assertTrue(cmp.compare());
    }
}

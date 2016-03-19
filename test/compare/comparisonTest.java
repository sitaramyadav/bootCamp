package compare;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class comparisonTest {
    @Test
    public void compareLengthShouldCompareFeetWithInches() throws Exception {
        Feet feet=new Feet(1);
        Inch inch=new Inch(12);
        Comparison cmp=new Comparison(feet,inch);
        Assert.assertTrue(cmp.compare());
    }
    @Test
    public void comparisonShouldCompareFeetWithFeet() throws Exception {
        Feet feet1=new Feet(1);
        Feet feet2=new Feet(1);

        Comparison cmp=new Comparison(feet1,feet2);

        Assert.assertTrue(cmp.compare());
    }

    @Test
    public void comparisonShouldCompareInchWithInch() throws Exception {
        Inch inch1=new Inch(1);
        Inch inch2=new Inch(1);

        Comparison cmp=new Comparison(inch1,inch2);

        Assert.assertTrue(cmp.compare());
    }
}

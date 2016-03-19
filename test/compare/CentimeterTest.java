package compare;

import org.junit.Test;

import static org.junit.Assert.*;

public class CentimeterTest {
    @Test
    public void convertIntoStandardUnit() throws Exception {
        Centimeter centimeter = new Centimeter(1);
        assertEquals(10,centimeter.convertIntoStandardUnit(),0.001);
    }
}
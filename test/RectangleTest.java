import org.junit.Test;

import static org.junit.Assert.assertEquals;
/*
job of the RectangleTest is to test all the behaviour of Rectangle.
 */
public class RectangleTest {
    @Test
    public void calculateArea_should_calculate_area_of_rectangle(){
        double length = 3.4d;
        double breadth = 4.5d;
        Rectangle rectangle= new Rectangle(length, breadth);
        double expectedArea = 15.3d;
        assertEquals(expectedArea,rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void calculatePerimeter_should_calculate_perimeter_of_the_rectangle(){
        double length = 3.4d;
        double breadth = 4.5d;
        Rectangle rectangle= new Rectangle(length, breadth);
        double expectedPerimeter = 15.8d;
        assertEquals(expectedPerimeter, rectangle.calculatePerimeter(), 0.000);
    }


}
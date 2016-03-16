import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle;
    @Before
    public void setUp() throws Exception {
        Double length = 5d;
        Double breadth = 5d;
        rectangle = new Rectangle(length,breadth);
    }

    @Test
    public void testGetArea_should_provide_area_of_rectangle() throws Exception {
        double expectedArea = 25;
        assertEquals( rectangle.getArea(), expectedArea ,0.001);
    }

    @Test
    public void testGetPerimeter_should_provide_perimeter_of_the_rectangle() throws Exception {
        double expectedPerimeter = 20;
        assertEquals(expectedPerimeter,rectangle.getPerimeter(),0.001);
    }
}
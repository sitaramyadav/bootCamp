import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle;
    @Before
    public void setUp() throws Exception {
        Numbers length = new Numbers(5);
        Numbers breadth = new Numbers(5);
        rectangle = new Rectangle(length,breadth);
    }

    @Test
    public void testGetArea_should_provide_area_of_rectangle() throws Exception {
        int expectedArea = 25;
        assertEquals(expectedArea,rectangle.getArea());
    }

    @Test
    public void testGetPerimeter_should_provide_perimeter_of_the_rectangle() throws Exception {
        int expectedPerimeter = 20;
        assertEquals(expectedPerimeter,rectangle.getPerimeter());
    }
}
package wizard;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BagTest {
    @Test
    public void bagCanHoldMaximum12Balls()  {

        Ball ball = new Ball(1);
        assertTrue(ball.canStore());
    }

    @Test
    public void bagCannotStoreMoreThan12NumbersofBalls() throws Exception {
        Ball ball = new Ball(13);
        assertFalse(ball.canStore());
    }
}

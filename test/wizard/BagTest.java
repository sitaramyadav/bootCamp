package wizard;

import exception.BagFullException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BagTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void pushBallCanPushAnyNumberOfBlueBallAsBagCanContain() throws Exception {
        Bag bag = new Bag();
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));

        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));

        int expectedSize = bag.pushBall(new Ball(Color.BLUE));
        assertEquals(12, expectedSize);

        thrown.expect(BagFullException.class);
        bag.pushBall(new Ball(Color.BLUE));

    }

    @Test
    public void itShouldThrowAnErrorWhileAddingMoreThan3GreenBall() throws Exception {
        Bag bag = new Bag();
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));

        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag doesn't allow more than 3 green balls");
        bag.pushBall(new Ball(Color.GREEN));


    }

    @Test
    public void pushBallShouldNotPushTheRedBallMoreThanOrEqualToDoubleOfGreenBall() throws Exception {

        Bag bag = new Bag();

        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.RED));
        bag.pushBall(new Ball(Color.RED));
        int expectedSize = bag.pushBall(new Ball(Color.RED));

        assertEquals(5, expectedSize);
        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag rule doesn't allow more or equal to double of green");
        bag.pushBall(new Ball(Color.RED));

    }

    @Test
    public void pushBallShouldNotPushRedBallInTheBeginning() throws Exception {
        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag rule doesn't allow more or equal to double of green");
        Bag bag = new Bag();

        bag.pushBall(new Ball(Color.RED));
    }

    @Test
    public void pushBallShouldNotPushDoubleNumberOfRedThanGreen() throws Exception {
        Bag bag = new Bag();
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.RED));

        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag rule doesn't allow more or equal to double of green");

        bag.pushBall(new Ball(Color.RED));
    }

    @Test
    public void pushBallShouldAllowToAddYellowBallsIfNotMoreThan40PercentOfTheBagSize() throws Exception {
        Bag bag = new Bag();
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.RED));
        bag.pushBall(new Ball(Color.RED));
        bag.pushBall(new Ball(Color.RED));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.BLUE));

        int expectedSize = bag.pushBall(new Ball(Color.YELLOW));

        assertEquals(8, expectedSize);

    }

    @Test
    public void pushBallShouldNotPushYellowBallsMoreThan40PercentOfBagSize() throws Exception {
        thrown.expect(BagFullException.class);
        thrown.expectMessage("Bag rule doesn't allow yellow balls more than 40% of bag size");
        Bag bag = new Bag();
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.GREEN));
        bag.pushBall(new Ball(Color.BLUE));
        bag.pushBall(new Ball(Color.RED));
        bag.pushBall(new Ball(Color.YELLOW));
        bag.pushBall(new Ball(Color.YELLOW));
        bag.pushBall(new Ball(Color.YELLOW));
        bag.pushBall(new Ball(Color.YELLOW));
    }



}

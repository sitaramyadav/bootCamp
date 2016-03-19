package probability;
import exception.IllegalArgumentException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ProbabilityTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void createProbabilityShouldThrowAnExceptionWhenSuppliedProbabilityIsThan0() throws IllegalArgumentException {
        thrown.expect(IllegalArgumentException.class);
        Probability.createProbability(-2);
    }
    @Test
    public void createProbabilityShouldThrowExceptionWhenSuppliedProbabilityIsGreaterThan1() throws IllegalArgumentException {
        thrown.expect(IllegalArgumentException.class);
        Probability.createProbability(2);
    }

    @Test
    public void createProbabilityShouldBeAbleToCompareTwoProbability() throws IllegalArgumentException {
        Probability probabilityOfOccurringAnEvent = Probability.createProbability(0.5);
        Probability probabilityOfOccurringAnotherEvent = Probability.createProbability(0.5);
        assertEquals(probabilityOfOccurringAnotherEvent,probabilityOfOccurringAnEvent);
    }
    @Test
    public void createProbabilityShouldBeAbleToGiveNotOfProbability() throws IllegalArgumentException {
        Probability probabilityOfOccurringAnEvent = Probability.createProbability(0.5);
        Probability probabilityOfNotOccurringAnEvent = probabilityOfOccurringAnEvent.not();
        assertEquals(probabilityOfNotOccurringAnEvent,probabilityOfOccurringAnEvent);
    }

    @Test
    public void createProbabilityShouldBeAbleToPerformAndOperation() throws IllegalArgumentException {
        Probability probabilityOfOccurringAnEvent = Probability.createProbability(0.4);
        Probability probabilityOfOccurringAnotherEvent = Probability.createProbability(0.5);
        Probability probabilityOfOccurringBothEvents = probabilityOfOccurringAnEvent.and(probabilityOfOccurringAnotherEvent);
        Probability expectedProbability = Probability.createProbability(0.20);
        assertEquals(expectedProbability,probabilityOfOccurringBothEvents);
    }
    @Test
    public void createProbabilityShouldBeAbleToPerformOrOperation() throws IllegalArgumentException {
        Probability probabilityOfOccurringAnEvent = Probability.createProbability(0.4);
        Probability probabilityOfOccurringAnotherEvent = Probability.createProbability(0.5);
        Probability probabilityOfOccurringBothEvents = probabilityOfOccurringAnEvent.or(probabilityOfOccurringAnotherEvent);
        Probability expectedProbability = Probability.createProbability(0.7);
        assertEquals(expectedProbability,probabilityOfOccurringBothEvents);
    }
}
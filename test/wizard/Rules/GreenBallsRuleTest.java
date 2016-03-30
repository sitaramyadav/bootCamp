package wizard.Rules;

import org.junit.Test;
import wizard.Ball;
import wizard.Balls;

public class GreenBallsRuleTest {
    @Test
    public void itShouldVerifiedWhetherGreenBallCanAddedOrNot() throws Exception {

        Ball ball = new Ball(color);
        Balls balls = new Balls();
        GreenBallsRule  greenBallsRule = new GreenBallsRule(balls,ball);

    }
}
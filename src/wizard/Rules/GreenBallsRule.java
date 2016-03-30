package wizard.Rules;

import wizard.Ball;
import wizard.Balls;

public class GreenBallsRule {
    private Ball ball;
    private Balls balls;
    public  GreenBallsRule(Balls balls, Ball ball){
        this.balls = balls;
        this.ball = ball;

    }
    public boolean validateRule(){
        return false;

    }

}

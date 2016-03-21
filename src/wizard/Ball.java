package wizard;

public class Ball {
    private int noOfBalls;

    public Ball(int noOfBalls) {
        this.noOfBalls = noOfBalls;
    }

    public boolean canStore(){
        if(noOfBalls>12)
            return false;
        return true;
    }
}

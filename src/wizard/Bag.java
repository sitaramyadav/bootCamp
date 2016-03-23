package wizard;

import exception.BagFullException;

import java.util.*;

public class Bag {

    private HashMap<Color, ArrayList<Ball>> balls;
    public Bag() {
        balls = new HashMap<>();
    }

    public int pushBall(Ball ball) throws BagFullException{
        if ( getBagSize() == 12)
            throw  new BagFullException("Bag is full");
        if(ball.isColorOf(Color.GREEN))
            pushGreenBall(ball);
        if(ball.isColorOf(Color.RED))
            pushRedBall(ball);
        if (ball.isColorOf(Color.BLUE))
            pushBlueBall(ball);
        if (ball.isColorOf(Color.YELLOW))
            pushYellowBall(ball);
        return getBagSize();
    }

    private void pushBlueBall(Ball ball) {
        ArrayList<Ball> blueBalls = getListOf(Color.BLUE);
        blueBalls.add(ball);
    }

    private void pushGreenBall(Ball ball) {
        if (getNumberOfBalls(Color.GREEN) == 3)
            throw new BagFullException("Bag doesn't allow more than 3 green balls");
        ArrayList<Ball> greenBalls = getListOf(Color.GREEN);
        greenBalls.add(ball);
    }

    private ArrayList<Ball> getListOf(Color colour) {
        ArrayList<Ball> a = balls.get(colour);
        if (a == null){
            a = new ArrayList<>();
            balls.put(colour, a);
        }
        return a;
    }
    private void pushRedBall(Ball ball) {
        if (((getNumberOfBalls(Color.GREEN) * 2)-1) <= getNumberOfBalls(Color.RED))
            throw new BagFullException("Bag rule doesn't allow more or equal to double of green");
        ArrayList<Ball> redBalls = getListOf(Color.RED);
        redBalls.add(ball);
    }

    private void pushYellowBall(Ball ball) {
        if ( getNumberOfBalls(Color.YELLOW) >= ((40 * getBagSize()) / 100))
            throw new BagFullException("Bag rule doesn't allow yellow balls more than 40% of bag size");
        ArrayList<Ball> yellowBalls = getListOf(Color.YELLOW);
        yellowBalls.add(ball);
    }
    private int getBagSize(){
        int size=0;
        Set set = balls.entrySet();

        for (Object aSet : set) {
            Map.Entry me = (Map.Entry) aSet;
            ArrayList list = (ArrayList) me.getValue();
            size += list.size();
        }
        return size;
    }

    private int getNumberOfBalls(Color color){
        ArrayList<Ball> a = balls.get(color);
        if(a == null)
            return 0;
        return a.size();
    }


}

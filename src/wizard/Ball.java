package wizard;

public class Ball {
    private final Color color;

    public Ball(Color color) {
        this.color = color;
    }
    public boolean isColorOf(Color color){
        return this.color.equals(color);
    }
}

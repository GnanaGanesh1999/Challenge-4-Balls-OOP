import processing.core.PApplet;

public class ChallengeProcessingOOP extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 720;
    public static final int DIAMETER = 20;
    Ball ball1, ball2, ball3, ball4;

    public static void main(String[] args) {
        PApplet.main("ChallengeProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        ball1 = new Ball(0, HEIGHT/5, DIAMETER, 1);

        ball2 = new Ball(0, HEIGHT/5 * 2, DIAMETER, 2);

        ball3 = new Ball(0, HEIGHT/5 * 3, DIAMETER, 3);

        ball4 = new Ball(0, HEIGHT/5 * 4, DIAMETER, 4);

    }

    @Override
    public void draw() {
        moveAllBalls();
    }

    private void moveAllBalls() {
        ball1.moveBall();
        ball2.moveBall();
        ball3.moveBall();
        ball4.moveBall();
    }

    public class Ball {
        int xPosition;
        int yPosition;
        int diameter;
        int speed;

        public Ball(int xPosition, int yPosition, int diameter, int speed) {
            this.xPosition = xPosition;
            this.yPosition = yPosition;
            this.diameter = diameter;
            this.speed = speed;
            drawBall(xPosition, yPosition);
        }

        private void drawBall(int xPosition, int yPosition) {
            ellipse(xPosition, yPosition, this.diameter, this.diameter);
        }

        public void moveBall() {
            this.xPosition += this.speed;
            drawBall(this.xPosition, this.yPosition);
        }
    }
}


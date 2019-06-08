public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint() {
        super.x = 1.0f;
        super.y = 1.0f;
        this.xSpeed = 1.0f;
        this.ySpeed = 1.0f;
    }

    float getXSpeed() {
        return this.xSpeed;
    }

    void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    float getYSpeed() {
        return this.ySpeed;
    }

    void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    float[] getSpeed() {
        float[] array = {getX(), getY()};
        return array;
    }

    @Override
    public String toString() {
        return "- This is a movable point which is a subclass of "
                + super.toString()
                + "\n Speed = "
                + "("
                + getXSpeed()
                + ", "
                + getYSpeed()
                + ")"
                + " \n => standard information of this movable point is: "
                + "("
                + super.x + ", "
                + super.y + ", "
                + getXSpeed() + ", "
                + getYSpeed()
                + ") \n";
    }

    public MovablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }


}

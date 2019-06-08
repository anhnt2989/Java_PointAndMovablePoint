public class Point {
    float x;
    float y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this.x = 1.0f;
        this.y = 1.0f;
    }

    float getX() {
        return this.x;
    }

    float getY() {
        return this.y;
    }

    void setX(float x) {
        this.x = x;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] getXY() {
        float[] array = {getX(), getY()};
        return array;
    }

    @Override
    public String toString() {
        return "Point 2D with X,Y coordinates: "
                + "("
                + getX()
                + ", "
                + getY()
                + ")";
    }
}

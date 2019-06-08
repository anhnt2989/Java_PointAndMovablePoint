import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Point point = new Point();
        System.out.println(point);

        point = new Point(60.0f,40.0f);
        System.out.println(point);

        System.out.println("Now let's set a point, shall we?");
        System.out.println("Enter Coordinate X: ");
        float x = input.nextFloat();
        System.out.println("Enter Coordinate Y: ");
        float y = input.nextFloat();

        Point cPoint = new Point(x,y);
        System.out.println(cPoint);
    }
}

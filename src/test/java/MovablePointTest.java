import java.util.Scanner;

public class MovablePointTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(40.5f,60.9f,4.5f,4.5f);
        System.out.println(movablePoint);

        System.out.println("Now let's make a movable point, shall we?");
        System.out.println("Enter coordinate X: ");
        float x = input.nextFloat();
        System.out.println("Enter coordinate Y: ");
        float y = input.nextFloat();
        System.out.println("Enter X Speed: ");
        float xSpeed = input.nextFloat();
        System.out.println("Enter Y Speed: ");
        float ySpeed = input.nextFloat();

        MovablePoint movablePoint1 = new MovablePoint(x,y,xSpeed,ySpeed);
        System.out.println(movablePoint1);
    }
}

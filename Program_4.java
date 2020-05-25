import java.awt.*;

public class Program4 {
    public static void main(String[] args) {
        // primitive types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // reference types
        Point p1 = new Point(1, 2);
        Point p2 = p1;

        p1.x = 2;
        System.out.println(p2);
    }
}
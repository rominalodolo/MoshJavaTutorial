import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
//        age.for will give you the following code
//        for (byte i = 0; i < age; i++) {}
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = new String("Hello World!"); // made redundant
        String message1 = "Hello Romina...";

        System.out.println(message);
        System.out.println(message1);

        //concatenate the string variables
        String message2 = "Hi" + "Student";
        System.out.println(message2.length());
        System.out.println(message2.endsWith("k"));
        System.out.println(message2.startsWith("h"));


    }
}

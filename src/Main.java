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
        String message1 = "  Hello Romina...  ";

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message1.trim());

        //concatenate the string variables
        String message2 = "Hi" + "Student";
        System.out.println(message2.length());
        System.out.println(message2.endsWith("k"));
        System.out.println(message2.startsWith("h"));
        System.out.println(message2.indexOf("i"));
        System.out.println(message2.replace("Hi", "Bye")); //Strings are immutable so it will return new string object


// escape sequences
        // quotes
        String message3 = "Hello \"Romina\"";
        System.out.println(message3);

        // backslash ( c:\Windows\... ) use an extra backslash
        String message4 = "c:\\Windows\\... ";
        System.out.println(message4);

        //using \n it will make a new line or \t will add a tab

// Array in Java - specify the length of the array with the (new int [];)
        int[] numbers = new int [5];
        // access by using an index
        // first item is 0
        numbers[0] = 1;
        numbers[2] = 2;
        System.out.println(numbers); // address of the object in memory

    }
}

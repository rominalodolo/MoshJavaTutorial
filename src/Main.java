import java.awt.*;
import java.util.Arrays;
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

        // use the class arrays in the util package
        System.out.println(Arrays.toString(numbers));

        // newer array sintax
        int[] numbers1 = { 2, 3, 4, 5, 1, 4 };
        System.out.println(numbers1.length);
        System.out.println(Arrays.toString(numbers1));
        // Arrays have a fixed length
        // Use sort method of arrays class
        Arrays.sort(Arrays.toString(numbers1));


        // single dimensional array
        int[] numbers2 = new int[5];
        // multi-dimensional array - 2 by 3 matrix so two rows and three columns
        // specify the dimension by using the [] as many times as needed
        int[] [] numbers3 = new int[2][3];
        numbers3 [0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));

        // list of items { { }, { } };
        int[][] numbers4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers4));
    }
}

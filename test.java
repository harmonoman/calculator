import java.util.Scanner;

public class Test {

    private static final Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] exampleArray = null;
        String example = getString("enter a String");
        exampleArray = example.split(" ");
        
        System.out.println("Input string: " + example);
        System.out.println("Array length: " + exampleArray.length);
        System.out.println("First element in array: " + exampleArray[0]);
        System.out.println("Second element in array: " + exampleArray[1]);

    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        String someString = inputScanner.nextLine();      
        return someString;
    }
}



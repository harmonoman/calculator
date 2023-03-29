import java.util.Scanner;

public class Test {

    private static final Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] exampleArray = null;
        String example = getString("enter a String");
        exampleArray = example.split(" ");
        
        System.out.println(example);
        System.out.println(exampleArray.length);
        System.out.println(exampleArray[0]);
        System.out.println(exampleArray[1]);

    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        String someString = inputScanner.nextLine();      
        return someString;
    }
}



import java.util.Scanner;

public class App {

    private static final Scanner inputScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        //boolean keepGoing = true;        
        // double num1 = 0.0; //getDouble("Enter a Double");
        // double num2 = 0.0; //getDouble("Enter another Double");
        // double result = 0.0;
        //String dosDoubles = "";
        String[] dosDoublesArray = null;

        //Calculator calculator = new Calculator();

        int choice = whichOne("Would you like to (1) choose how to operate on two doubles, or (2) input an equation?");
        if (choice == 1) {
            //String[] dosDoublesArray = null;
            String dosDoubles = twoDoubles("Enter two doubles separated by a space.");
            //System.out.println(dosDoubles);
            inputScanner.nextLine();
            dosDoublesArray = dosDoubles.split(" ");
            System.out.println("array length: " + dosDoublesArray.length);
            //num1 = Double.parseDouble(dosDoublesArray[0]);
            //num2 = Double.parseDouble(dosDoublesArray[1]);
            //String menu = whichOperation("Which operation would you like to use?");
            
            // if (menu.equals("add")) {
            //     result = calculator.add(num1,num2);
            //     System.out.println(num1 + " + " + num2 + " = " + result);
            // }
            // if (menu.equals("subtract")) {    
            //     result = calculator.subtract(num1,num2);
            //     System.out.println(num1 + " - " + num2 + " = " + result);
            // }
            // if (menu.equals("multiply")) {
            //     result = calculator.multiply(num1,num2);
            //     System.out.println(num1 + " * " + num2 + " = " + result);
            // }
            // if (menu.equals("divide")) {
            //     if (num1 == 0 || num2 == 0) {
            //         System.out.println("Not a number");
            //         //System.out.println(num1 + " / " + num2 + " = " + result);
            //     } else {
            //     result = calculator.divide(num1,num2);
            //     System.out.println(num1 + " / " + num2 + " = " + result);
            //     }
            // }
            // String answer = getAnswer("Would you like to continue?");

            // if (answer.equals("yes")) {
            // keepGoing = true;
            //}

            //-------------
            // while (keepGoing == true) {
            //     //num1 = getDouble("Enter a Double");
            //     //num2 = getDouble("Enter another Double");
            //     //System.out.println(String.format("You want to add %1f and %2f",num1,num2));
            //     //String something = getString("Enter two doubles");
            //     //String [] strArray = something.split();
            //     if (menu.equals("add")) {
            //         result = calculator.add(num1,num2);
            //         System.out.println(num1 + " + " + num2 + " = " + result);
            //     }
            //     if (menu.equals("subtract")) {    
            //         result = calculator.subtract(num1,num2);
            //         System.out.println(num1 + " - " + num2 + " = " + result);
            //     }
            //     if (menu.equals("multiply")) {
            //         result = calculator.multiply(num1,num2);
            //         System.out.println(num1 + " * " + num2 + " = " + result);
            //     }
            //     if (menu.equals("divide")) {
            //         if (num1 == 0 || num2 == 0) {
            //             System.out.println("Not a number");
            //         } else {
            //         result = calculator.divide(num1,num2);
            //         System.out.println(num1 + " / " + num2 + " = " + result);
            //         }
            //     }
            //     String answer = getAnswer("Would you like to continue?");

            //     if (answer.equals("yes")) {
            //         keepGoing = true;
            //     } else {
            //         keepGoing = false;
            //     }

            // } 
        }
        System.out.println("Goodbye!");
    }


    

    public static String getString(String prompt) {
        System.out.println(prompt);
        String someString = inputScanner.nextLine();
        return someString;
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        double someDouble = inputScanner.nextDouble();
        return someDouble;
    }

    public static String getAnswer(String prompt) {
        System.out.println(prompt);
        String response = inputScanner.next();
        return response;
    }

    public static String whichOperation(String prompt) {
        System.out.println(prompt);
        String operation = inputScanner.next();
        return operation;
    }

    public static int whichOne(String prompt) {
        System.out.println(prompt);
        int choice = inputScanner.nextInt();
        return choice;
    }

    public static String twoDoubles(String prompt) {
        System.out.println(prompt);
        String twoNums = inputScanner.nextLine();
        //System.out.println(twoNums);
        return twoNums;
    }
    
}
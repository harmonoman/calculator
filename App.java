import java.util.Scanner;

public class App {

    private static final Scanner inputScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean keepGoing = true;        
        double num1 = 0.0; //getDouble("Enter a Double");
        double num2 = 0.0; //getDouble("Enter another Double");
        double result = 0.0;
        String dosDoubles = "";
        String[] dosDoublesArray = null;
        String operation = "";

        Calculator calculator = new Calculator();

        int choice = whichOne("Would you like to (1) choose how to operate on two doubles, or (2) input an equation?");
        //--------CHOICE 1-------
        if (choice == 1) {           
            while (keepGoing == true) {
                System.out.println("Enter two doubles separated by a space.");
                dosDoubles = inputScanner.nextLine();
                dosDoublesArray = dosDoubles.split(" ");
                num1 = Double.parseDouble(dosDoublesArray[0]);
                num2 = Double.parseDouble(dosDoublesArray[1]);
            
                String menu = whichOperation("Which operation would you like to use?" + "\n" + "add" + "\n" + "subtract" + "\n" + "multiply" + "\n" + "divide");         
                
                // Operators
                if (menu.equals("add")) {
                result = calculator.add(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                }
                if (menu.equals("subtract")) {    
                result = calculator.subtract(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                }
                if (menu.equals("multiply")) {
                result = calculator.multiply(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                }
                if (menu.equals("divide")) {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Not a number");
                        //System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                    result = calculator.divide(num1,num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                }

                // Keep going???
                String answer = getAnswer("Would you like to continue?");
                inputScanner.nextLine();

                if (answer.equals("yes")) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            }    
        }
        //--------CHOICE 2-------
        if (choice == 2) {
            while (keepGoing == true) {
                System.out.println("Enter an equation with each element separated by a space.");
                dosDoubles = inputScanner.nextLine();
                dosDoublesArray = dosDoubles.split(" ");
                num1 = Double.parseDouble(dosDoublesArray[0]);
                operation = dosDoublesArray[1];
                num2 = Double.parseDouble(dosDoublesArray[2]);
                
                // Operators
                if (operation.equals("+") | operation.equals("plus")) {
                result = calculator.add(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                }
                if (operation.equals("-") | operation.equals("minus")) {    
                result = calculator.subtract(num1,num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                }
                if (operation.equals("*") | operation.equals("x") | operation.equals("X") | operation.equals("times")) {
                result = calculator.multiply(num1,num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                }
                if (operation.equals("/") | operation.equals("divided_by")) {
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Not a number");
                    } else {
                    result = calculator.divide(num1,num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                }

                // Keep going???
                String answer = getAnswer("Would you like to continue?");
                inputScanner.nextLine();

                if (answer.equals("yes")) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            }    
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
        inputScanner.nextLine();
        return choice;
    }

    public static String twoDoubles(String prompt) {
        System.out.println(prompt);
        String twoNums = inputScanner.nextLine();
        //System.out.println(twoNums);
        return twoNums;
    }
    
}
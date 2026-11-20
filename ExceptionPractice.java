//I am Taydem Hansen
//Instructor: Mr. Gross
//Class: Software Development
//This program demonstrates exception handling in Java. It includes examples of handling ArrayIndexOutOfBoundsException and ArithmeticException.
//It will attempt to access an invalid index in an array and perform division by zero, both of which will be caught and handled gracefully without crashing the program.


public class ExceptionPractice {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an array index that does not exist.");
        }

        int x = 10;
        int y = 0;
        System.out.println("5 + 5 = " + (5 + 5));

        try {
            int answer = x / y;
            System.out.println(answer);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide a number by zero.");
        }

        System.out.println("The program caught the errors and closed without crashing.");
    }
}

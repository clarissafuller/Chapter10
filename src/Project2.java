import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for first integer and create first MyInteger object
        System.out.print("Enter an integer: ");
        MyInteger n1 = new MyInteger(input.nextInt());

        // Test instance methods on n1
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());

        // Test static isPrime method with an int
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        // Create a char array and test parseInt(char[])
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        // Prompt user for a string and test parseInt(String)
        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.println(MyInteger.parseInt(s));

        // Prompt user for second integer and create second MyInteger object
        System.out.print("Enter an integer: ");
        MyInteger n2 = new MyInteger(input.nextInt());

        // Test instance and static odd methods
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));

        // Test equals methods
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));

        input.close();
    }
}

class MyInteger {

    // Data field to store the integer value for this object
    private int value;

    // Constructor that creates a MyInteger object with the given int value
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method that returns the stored value
    public int getValue() {
        return value;
    }

    // Instance method that checks if this object's value is even
    public boolean isEven() {
        return value % 2 == 0;
    }

    // Instance method that checks if this object's value is odd
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // Instance method that checks if this object's value is prime
    public boolean isPrime() {
        return isPrime(value);
    }

    // Static method that checks if an int is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // Static method that checks if an int is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    // Static method that checks if an int is prime
    public static boolean isPrime(int value) {
        // Numbers less than or equal to 1 are not prime
        if (value <= 1) {
            return false;
        }

        // Check for factors from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        // If no factors were found, the number is prime
        return true;
    }

    // Static method that checks if a MyInteger object's value is even
    public static boolean isEven(MyInteger num) {
        return num.value % 2 == 0;
    }

    // Static method that checks if a MyInteger object's value is odd
    public static boolean isOdd(MyInteger num) {
        return num.value % 2 != 0;
    }

    // Static method that checks if a MyInteger object's value is prime
    public static boolean isPrime(MyInteger num) {
        return isPrime(num.value);
    }

    // Method that compares this object's value with an int
    public boolean equals(int value) {
        return this.value == value;
    }

    // Method that compares this object's value with another MyInteger object's value
    public boolean equals(MyInteger num) {
        return this.value == num.value;
    }

    // Static method that converts a char array into an int
    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    // Static method that converts a String into an int
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}
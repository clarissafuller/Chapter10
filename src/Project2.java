

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        MyInteger n1 = new MyInteger(input.nextInt());
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.println(MyInteger.parseInt(s));

        System.out.print("Enter an integer: ");
        MyInteger n2 = new MyInteger(input.nextInt());
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {

    // 1. DATA FIELD
    // int value


    // 2. CONSTRUCTOR
    // takes an int and stores it in value


    // 3. GETTER METHOD
    // returns value


    // 4. INSTANCE METHODS
    // isEven() -> true if value is even
    // isOdd() -> true if value is odd
    // isPrime() -> true if value is prime


    // 5. STATIC METHODS (int parameter)
    // isEven(int)
    // isOdd(int)
    // isPrime(int)


    // 6. STATIC METHODS (MyInteger parameter)
    // isEven(MyInteger)
    // isOdd(MyInteger)
    // isPrime(MyInteger)


    // 7. EQUALS METHODS
    // equals(int)
    // equals(MyInteger)


    // 8. PARSE METHODS
    // parseInt(char[])
    // parseInt(String)

}
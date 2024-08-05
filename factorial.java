// Java Program to Find Factorial of a Number
// where N>=0 is currently N>1

// Importing input output classes
import java.io.*;
// importing utility classes
import java.util.*;

// Main class
class factorial
{

    // Method 1
    // To calculate factorial
    static int factorial(int n)
    {

        // Handling base case
        // If value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;

        // Generic case
        // Otherwise we do n*(n-1)!
        return n * factorial(n - 1);
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {

        // Calling method 1 to compute factorial and
        // storing the result into a variable
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);

        // Print and display the factorial of number
        // customly passed as an argument
        System.out.println(ans);
    }
}

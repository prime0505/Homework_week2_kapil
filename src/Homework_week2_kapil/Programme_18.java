/*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers. */
package Homework_week2_kapil;
import java.util.Scanner;

public class Programme_18
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = sc.nextInt();
        System.out.print("Input second number: ");
        b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
    }
}

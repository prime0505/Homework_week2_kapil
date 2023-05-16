/* . Write a Java program to convert a decimal number to binary number. */
package Homework_week2_kapil;
import java.util.Scanner;

public class Programme_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String result = Integer.toBinaryString(decimal);
        System.out.println("Binary value of the given decimal number is ::" + result);


    }
}

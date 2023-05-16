/* Write a Java program that takes a number as input and prints its
        multiplication table up to 10.*/
package Homework_week2_kapil;
import java.util.Scanner;
public class Programme_10
{
    public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the table number:");
            int n=s.nextInt();
            for(int i=1; i <= 10; i++)
            {
                System.out.println(n+" * "+i+" = "+n*i);
            }
        }
}

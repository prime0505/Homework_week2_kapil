/* Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
package Homework_week2_kapil;
import java.util.Scanner;

public class Programme_13
{
    public static void main(String[] args)
    {
        int a,b,c,avg;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first value:");
        a= sc.nextInt();
        System.out.println("Enter the second value:");
        b= sc.nextInt();
        System.out.println("Enter the third value:");
        c= sc.nextInt();
        avg= (a+b+c)/2;
        System.out.println("This is avarage of three values:"+avg);

    }
}

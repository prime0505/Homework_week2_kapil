package Homework_week2_kapil;
import java.util.Scanner;
/*Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Programme_7
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        float f;
        double cel;
        System.out.println("Enter the temperature in fahrenheit : ");
        f= sc.nextFloat();
        cel=(f-32)/1.8;         // maths formula

        System.out.println("Fahrenheit is : "+f);
        System.out.println("Celcius is : "+cel);
    }
}

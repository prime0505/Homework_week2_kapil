package Homework_week2_kapil;

import java.util.Scanner;

//Write a program to calculate the area of a triangle.
public class Programme_8
{
    public static void main(String[] args) {
        int height = 0, base = 0, area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of base of triangle: ");
        base = sc.nextInt();
        System.out.println("Enter the height of base of triangle: ");
        height = sc.nextInt();
        area = (base * height) / 2;     // math formula
        System.out.println("The area of triangle is : " + area);
    }
}

package Homework_week2_kapil;
/*Write a program for a calculator with addition, subtraction, multiplication
        and division methods all with parameters and use string concatenation
        methods.(Note: Two static and Two instance methods).*/
public class Programme_5
{
    int a,b,c;

    public static void main(String[] args)
    {
        Programme_5 p5 =new Programme_5();
        p5.add(10,20);      // call by object
        p5.sub(50,30);
        Programme_5.multi(20,20);   // call by class
        Programme_5.divi(50,5);
    }
    public void add(int a,int b)    //instance method
    {
        c=a+b;
        System.out.println("Addition of two numbers is : "+c);
    }
    public void sub(int a,int b)    // instance method
    {
        c=a-b;
        System.out.println("Substraction of two numbers is : "+c);
    }
    public static void multi(int a, int b)  // static method
    {
         int ans = a*b;
        System.out.println("Multiplication of two numbers is : "+ans);
    }
    public static void divi(int a, int b)  // static method
    {
        int ans = a/b;
        System.out.println("Division of two numbers is : "+ans);
    }
}


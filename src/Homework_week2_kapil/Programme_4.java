package Homework_week2_kapil;

public class Programme_4
{
    int a =10,b=20;                // instance variable;
    static int x= 50,y=100;;           // static variable;

    public static void main(String[] args)
    {
        Programme_4 p3 =new Programme_4();
        p3.display(); // call by object
        Programme_4.disp(); // call by class
    }
    void display()          // instance method;
    {
        System.out.println("this is a value for instance  variable : "+a);
        System.out.println("this is a value for instance variable : "+b);

    }
    static void disp()  // static method
    {
        System.out.println("this is a value for instance variable: " + x);
        System.out.println("this is a value for instance variable: " + y);
    }
}



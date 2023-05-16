package Homework_week2_kapil;
        /*3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme*/

public class Programme_3
{
    int a = 10;                // instance variable or global;
    static int b = 50;          // static variable;

    public static void main(String[] args)
    {
        Programme_3 p3 = new Programme_3();
        p3.display(); // call by object
        Programme_3.disp(); // call by class
    }
    void display()          // instance method;
    {
        System.out.println("this is a value for instance  variable : " + a);

    }
    static void disp()  // static method
    {
        System.out.println("this is a value for static  variable: " + b);
    }
}
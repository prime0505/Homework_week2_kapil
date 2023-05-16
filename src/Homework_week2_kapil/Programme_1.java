/*1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/
package Homework_week2_kapil;

class Programme_1 {
    int a = 10;     // instance  or global variable;
    String name = "Prime";
    public static void main(String[] args)
    {
        Programme_1 p1 = new Programme_1();
        p1.demo();          // call by object
    }
    public void demo()          // instance method
    {
        System.out.println("Enter the first input: " + a);
        System.out.println("Enter the Second input: " + name);
    }
}

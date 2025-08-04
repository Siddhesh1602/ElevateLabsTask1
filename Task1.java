import java.util.*;

public class Task1{
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static double sub(double a, double b)
    {
        return a-b;
    }
    public static double mul(double a, double b)
    {
        return a*b;
    }
    public static double div(double a, double b)
    {
        if(b==0)
        {
            System.out.println("Cannot divide by 0");
            return 0;
        }
        return a/b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean continueToNext=true;
        System.out.println("Welcome to the console calculator!");
        while(continueToNext)
        {
            System.out.println("Choose operation:");
            System.out.println("1. Addition(+)");
            System.out.println("2. Substraction(-)");
            System.out.println("3. Multiplication(*)");
            System.out.println("4. Division(/)");
            System.out.println("5. Exit");

            System.out.println("Enter your choice between (1-5)");
            int choice=sc.nextInt();

            if(choice==5)
            {
                continueToNext=false;
                System.out.println("Exited from console calcuator! Good Bye! ");
                break;
            }
            System.out.println("Enter first value:");
            double num1=sc.nextDouble();
            System.out.println("Enter second value:");
            double num2=sc.nextDouble();
            double result=0;
            switch(choice)
            {
                case 1:
                    result=add(num1, num2);
                    break;

                case 2:
                    result=sub(num1, num2);
                    break;

                case 3:
                    result=mul(num1, num2);
                    break;

                case 4:
                    result=div(num1,num2);
                    break;

                default:
                    System.out.println("Invalid choice! Please enter the choice from 1-5");
            }
            System.out.println("Result:"+ result);


        }

    }
}

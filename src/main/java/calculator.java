import java.lang.Math;
import java.util.Scanner;
public class calculator {
    public static double sqrt(double x){
        return Math.sqrt(x);
    }
    public static int factorial(int x){
        int fact;
        fact=1;
        for(int i=1;i<=x;i++)
        {
            fact = fact*i;

        }
        return fact;
    }
    public static double log(double x)
    {
        return Math.log(x);
    }

    public static double power(double x,double y)
    {
        return Math.pow(x,y);
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the function to be computed\n1:squareroot\n2:factorial\n3:log\n4:power(x,y)");
        choice = sc.nextInt();
        if(choice==1)
        {
            System.out.print("enter the number :");
            double a1;
            a1 = sc.nextDouble();
            System.out.println(sqrt(a1));
        }
        if(choice==2)
        {
            int a2;
            System.out.print("enter the number :");
            a2 = sc.nextInt();
            System.out.println(factorial(a2));
        }
        if(choice==3)
        {
            System.out.print("enter the number :");
            double a3;
            a3 = sc.nextDouble();
            System.out.println(log(a3));
        }
        if(choice==4)
        {
            int a4,a5;
            System.out.print("enter the number :");
            a4 = sc.nextInt();
            System.out.print("enter the number :");
            a5 = sc.nextInt();
            System.out.println(power(a4,a5));
        }




    }

}

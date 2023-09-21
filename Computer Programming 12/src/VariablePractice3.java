import java.util.Scanner;

public class VariablePractice3
{
    public static void main( String[] args ){

        int subtotal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("how many hot dogs"); subtotal += scan.nextInt() * 5.5;
        System.out.println("how many drinks"); subtotal += scan.nextInt() * 2;
        System.out.println("your total is $" + (Math.round((subtotal * 1.12)*100))/100.0);
    }
}
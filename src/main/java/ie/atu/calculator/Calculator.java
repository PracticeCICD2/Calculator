package ie.atu.calculator;
import java.util.Scanner;

public class Calculator {

    public static void delete(){

        Scanner inputs = new Scanner(System.in);

        System.out.println("Enter your first numbers");
        int firstNumber = inputs.nextInt();

        System.out.println("Enter your second numbers");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is: "+total);

    }
}
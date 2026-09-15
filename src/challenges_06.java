import java.util.Scanner;

public class challenges_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = input.nextFloat();
        System.out.print("Enter the second number: ");
        float b = input.nextFloat();

        float result = a * b;
        System.out.println("The Product of two number is " + result);
    }
}

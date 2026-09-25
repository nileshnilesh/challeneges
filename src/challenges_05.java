import java.util.Scanner;

public class challenges_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Modules: " + (a%b));
    }
}


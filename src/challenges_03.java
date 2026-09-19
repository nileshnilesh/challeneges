import java.util.Scanner;
public class challenges_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        int result = a+b;
        System.out.println("The sum of two number is "+ result);

    }
}

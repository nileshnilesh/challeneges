import java.util.Scanner;

public class challenges_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = input.nextInt();
        System.out.print("Enter the breadth: ");
        int b = input.nextInt();

        //int result = 2*(l+b);

        System.out.println("The perimeter of rectangle is : "+ 2*(l+b));

    }
}
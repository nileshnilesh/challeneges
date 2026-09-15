import java.util.Scanner;

public class challenges_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i<=num;i++){
            sum = sum+i;

        }
        System.out.println("Sum of the integers is: "+sum);

    }
}

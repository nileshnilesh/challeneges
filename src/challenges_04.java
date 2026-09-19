import java.util.Scanner;

public class challenges_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = input.nextInt();
        System.out.print(" Enter the number b: ");
        int b = input.nextInt();

        int temp = 0;

        temp = a;
        a = b;
        b=temp;

        System.out.println("\n==============After swapping===========\n");
        System.out.println("After swapping a = "+a);
        System.out.println("After swapping b = "+b);

    }

}

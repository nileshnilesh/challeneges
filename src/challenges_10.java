import java.util.Scanner;

public class challenges_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num <0) {
            System.out.println("The given number is negative.");
        }else if (num == 0) {
            System.out.println("The number is Zero.");
        }else{
            System.out.println("The number is positive.");
        }
    }
}

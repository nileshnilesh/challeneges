import java.util.Scanner;

public class challenges_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean prime = prime(num);
        if(prime){
            System.out.println("It is a prime");
        }else{
            System.out.print("It is not a prime");
        }

    }

    public static boolean prime( int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }return true;
    }
}




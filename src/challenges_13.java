import java.util.Scanner;


public class challenges_13 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println();
        for (int i =0 ; i<11;i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}

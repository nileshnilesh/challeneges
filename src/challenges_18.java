import java.util.Scanner;

public class challenges_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number:");
        int num2 = input.nextInt();
        int LCM = lcm(num1,num2);
        System.out.println("The LCM of a number is :"+LCM);

    }
    public static int lcm(int num1 ,int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }

            i++;
        }
    }
}

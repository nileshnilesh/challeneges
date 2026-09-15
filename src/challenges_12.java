import java.util.Scanner;

public class challenges_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Bitwise AND is :"+ (a&b));
        System.out.println("Bitwise OR is :"+ (a|b));
        System.out.println("Bitwise XOR is :"+ (a^b));
        System.out.println("Bitwise RIGHT SHIFT is :"+ (a>>b));
        System.out.println("Bitwise LEFT SHIFT is :"+ (a<<b));
        System.out.println("Bitwise NEGATION is :"+ (~b));
    }
}

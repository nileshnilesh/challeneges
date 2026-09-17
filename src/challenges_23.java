import java.util.Scanner;

public class challenges_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("===========Armstrong number==========");
        System.out.print("\n Enter the number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.print("It is a Armstrong number!");
        }else{
            System.out.print("It is not a Armstrong number!");
        }
    }


    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while(num>0){
            int lastDigit = num%10;
            num /= 10;
            finalNumber += power(lastDigit,noOfDigits);
        }return finalNumber == numCopy;
    }


    public static int noOfDigits(int num){
        int digit = 0;
        while(num>0){
            digit++;
            num /= 10;
        }return digit;
    }
    public static int power(int num1,int num2){
        int result = 1;
        int i= 0;
        while (i<num2){
            result *= num1;
            i++;
        }return result;
    }
}

import java.util.Scanner;

class challenges_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.print("It is a Palindrome");
        }else{
            System.out.print("It is not a palindrome ");
        }
    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num>0) {
            int digit =  num %10;
            newNum = newNum *10+digit;
            num /=10;

        }
        return newNum;
    }
}


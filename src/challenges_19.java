import java.util.Scanner;

class challenges_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("The Gcd of two number is : "+ gcd);

    }


    public static int gcd(int first,int second){
        int gcd = 1;
        int i = 2;
        int least = least(first,second);
        while(i<=least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }return gcd;
    }


    public static int least(int num1, int num2){
        if(num1<num2) {
            return num1;
        }else{
            return num2;
        }
    }
}

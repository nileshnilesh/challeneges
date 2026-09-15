import java.util.Scanner;

public class challenges_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        int Sum = 0;
        for(int i = num; i>0;i--){
            Sum += num*num-1;
        }
        System.out.println("The factorical of a number is : "+Sum);

    }
}













/*1! = 1
2! = 2*1
3! = 3*2*1
4! = 4*3*2*1
5! = 5*4*3*2*1*/


import java.util.Scanner;

class challenges_22 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number up to which u want to find :");
        int num = input.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if(num<0) return ;
        System.out.print("0 ");
        if(num == 0) return ;
        System.out.print("1 ");

        int first = 0,second = 1;
        while(first+second<=num){
            int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }
}

import java.util.Scanner;

public class challenges_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
//        pattern1(num);
//        pattern2(num);
//          pattern3(num);
//        pattern4(num);
//        pattern5(num);
        pattern6(num);
    }
    public static void pattern1(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int num){
        for (int row = 1; row <= 2 * num; row++) {
            int totalCols = row>num ? 2*num-row :row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int num){
        for (int row = 1; row <= 2*num ; row++) {
            int totalCols = row>num ? 2*num-row :row;
            int totalSpaces = num-totalCols;
            for (int s = 0; s <totalSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

 
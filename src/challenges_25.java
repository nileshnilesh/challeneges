import java.util.Scanner;

class challenges_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        firstPattern(rows);
        secondPattern(rows);
    }

    public static void firstPattern(int maxRows){
        int rows= 0;
        while (rows < maxRows){
            System.out.print(" * ");
            int i=0;
            while(i<rows){
                System.out.print(" * ");
                i++;
            } System.out.println();
            rows++;
        }
    }

    public static void secondPattern(int maxRows){
        int rows = maxRows;
        while(rows>0){
            int i=0;
            while(i<rows){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}









//* * * * *
//* * * *
//* * *
//* *
//*
















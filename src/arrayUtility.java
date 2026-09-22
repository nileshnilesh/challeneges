import java.util.Scanner;

public class arrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Enter the elements "+(i+1)+" : " );
            nums[i]= input.nextInt();
            i++;
        }return nums;

    }
}

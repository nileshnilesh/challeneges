import java.util.Scanner;

public class challenges_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] numArr = arrayUtility.inputArray();
        System.out.print("Enter the target element: ");
        int target = input.nextInt();
        int linear = linear(numArr,target);
        System.out.println(linear);
    }

    private static int linear(int[] numArr, int target) {
        if (numArr.length == 0) {
            return -1;
        }
        for (int index = 0; index<numArr.length ; index++){
            int element = numArr[index];
            if(element == target){
                return index;
            }
            }return -1;
        }
}





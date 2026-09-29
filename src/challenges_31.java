import java.util.Scanner;

class challenges_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = arrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Array after reversing.");
        arrayUtility.display(numArr);
    }


    public static void reverse(int[] numArr){
        int i = 0;
        while ((i<numArr.length / 2)){
            int swap = numArr[i];
            numArr[i] = numArr[(numArr.length- 1)-i];
            numArr[(numArr.length- 1)-i] = swap;
            i++;
        }
    }
}

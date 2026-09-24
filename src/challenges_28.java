import java.util.Scanner;

public class challenges_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = arrayUtility.inputArray();
        int max =  max(numArr);
        int min = min(numArr);
        System.out.println("The maximum value is: "+max);
        System.out.println("The minimum value is: "+min);
    }

    public static int max(int[] numArr ){
       if(numArr.length == 0){
           return Integer.MIN_VALUE;
       }
       int maxvalue = numArr[0];
       int i = 1;
       while(i<numArr.length){
           if(maxvalue < numArr[i]) {
               maxvalue = numArr[i];

           }i++;
       }return maxvalue;

    }



    public static int min(int[] numArr){

        int minValue = Integer.MAX_VALUE;
        int i = 0;
        while (i<numArr.length){
            if (numArr[i] < minValue){
                minValue = numArr[i];

            }i++;
        }return minValue;
    }
}
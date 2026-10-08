package DSA_Questions;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args){
        int[] arr= {4,3,5,7,6,5,};
        Search(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Search(int[] arr){
        boolean swapped ;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                     swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}

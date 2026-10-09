package DSA_Questions;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args){
        int[] nums = {2,34,3,2,4,1};
        Selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i-1;
            int maxIndex = maxIndex(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;

        }
    }

    private static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <=end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }return max;
    }
}

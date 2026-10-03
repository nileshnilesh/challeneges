package DSA_Questions;
// floor  is to return the greatest number >= target

public class floor_binary {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 2, 4, 6, 8, 9, 67, 577};
        int target = 2;
        int ans = binaryFloor(arr,target);
        System.out.println(ans);
    }

    public static int binaryFloor(int[] arr , int target){
        int start = 0;

        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if (target>arr[mid]){
                    start = mid +1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if (target<arr[mid]){
                    start = mid +1;
                }
            }
        }return end;
    }
}

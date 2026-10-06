package DSA_Questions;

public class mountain_array_1095 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;

    }

    static int search(int[] nums,int target){
        int peak = peak(nums);
        int first = binary(nums,target,0,peak);
        if(first != -1){
            return first;
        }
            int last = binary(nums, target, peak + 1, nums.length - 1);

            return last;
    }

    public static int peak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }return start;
    }


    public static int binary(int[] arr , int target,int start,int end){
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
        }return -1;
    }
}

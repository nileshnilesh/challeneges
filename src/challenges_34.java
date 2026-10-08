import java.util.Arrays;

public class challenges_34 {
    public static void main(String[] args){
        int[][] nums = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {34,34,38,50}
        };
        System.out.println(Arrays.toString(Search(nums,29)));

    }

    public static int[] Search(int[][] nums,int target){
        int r = 0;
        int c = nums.length-1;
        while(r < nums.length && c>=0){
            if(nums[r][c] == target){
                return new int[]{r,c};
            } else if (nums[r][c]< target) {
                r++;
            }else{
                c--;
            }
        }return new int[]{-1,-1};
    }
}

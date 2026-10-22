public class challenges_42 {
    static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int num){
        int sum = 0;
        if(num == 1){
            return 1;
        }
        sum = num + sum(num-1);
        return sum;
    }
}

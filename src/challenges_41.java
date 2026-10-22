public class challenges_41 {
    static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int num){
        int fact = 0;
        if(num == 1){
            return 1;
        }
        fact = num *fact(num-1);
        return fact;
    }
}

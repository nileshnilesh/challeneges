public class challenges_44 {
    static void main(String[] args) {
        int num = 123456;
        Reverse(num);
    }

    public static void Reverse(int num){
        if(num == 0){
            return ;
        }
        int last = num %10;
        System.out.print(last);
        num /= 10;
        Reverse(num);
    }
}

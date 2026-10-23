public class challenges_43 {
    static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if (n== 0){
            return;

        }
        System.out.println(n);

        fun(--n);
//        fun(n--);  Stack overflow the number 5 itself calls again and again !!
    }
}

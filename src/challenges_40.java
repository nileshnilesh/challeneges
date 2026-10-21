public class challenges_40 {
    static void main(String[] args) {
        funRev(5);
    }
    public static void funRev(int n){
        if(n == 0){
            return;

        }
        funRev(n-1);
        System.out.println(n);
    }
    public static void fun(int n){
        if(n == 0){
            return;

        }
        System.out.println(n);
        funRev(n-1);

    }
    public static void funBoth(int n){
        if(n == 0){
            return;

        }
        System.out.println(n);
        funRev(n-1);
        System.out.println(n);
    }
}

import java.util.Scanner;

public class challenges_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = input.nextInt();
        if (marks > 90 && marks <100) {
            System.out.println("Your grade is A.");
        }else if (marks>75 && marks<90){
            System.out.println("Your grade is B.");
        }else if (marks>60&& marks<75){
            System.out.println("Your grade is C.");
        }else if (marks>30 && marks<60) {
            System.out.println("Your grade is D.");
        }else {
            System.out.println("Fail...");

        }

    }
}

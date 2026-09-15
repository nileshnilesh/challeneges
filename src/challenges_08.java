import java.util.Scanner;

public class challenges_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        Double B = input.nextDouble();
        System.out.print("Enter the height: ");
        Double H = input.nextDouble();

        //Double result = 0.5*B*H;
        System.out.println("Area of triangle is: "+ (0.5*B*H));


    }
}

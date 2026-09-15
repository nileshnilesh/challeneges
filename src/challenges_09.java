import java.util.Scanner;

public class challenges_09 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in °F: ");
        double F = input.nextDouble();

        double C = (F-32)*5/9;

        System.out.println("Temperature in °c is: " + C);
    }
}

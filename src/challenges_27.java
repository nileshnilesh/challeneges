import java.util.Scanner;

class challenges_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = arrayUtility.inputArray();
        System.out.println("Enter the element to be searched.");
        int num = input.nextInt();
        int count = count(numArray, num);
        System.out.println("The number is repeated " + count + " times.");
    }

    public static int count(int[] numArray, int num) {
        int count = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                count++;

            }i++;

        }return count;
    }
}


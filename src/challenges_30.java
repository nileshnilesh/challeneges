import java.util.Scanner;

public class challenges_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] numArr = arrayUtility.inputArray();
        System.out.print("Enter the number u want to delete: ");
        int numTodelete = input.nextInt();
        int[] finalArray = deleteNum(numArr,numTodelete);
        arrayUtility.display(finalArray);
    }


    public static int[] deleteNum(int[] numArr ,int numTodelete){
        int occ = challenges_27.count(numArr,numTodelete);
        if (occ == 0){
            return numArr;

        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0 , j = 0;
        while(i<numArr.length){
            if(numArr[i] != numTodelete){
                newArr[j] = numArr[i];
                j++;
            }i++;
        }return newArr;
    }
}

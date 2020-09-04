package Arrays;
// Create an Array of size 10 of integers. Take input from the user for these
import java.util.Arrays;
import  java.util.Scanner;
public class FristProgram {
    private static Scanner scanner=new Scanner(System.in);
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void userInput(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" number: ");
            arr[i]=scanner.nextInt();

        }

    }

    public static void main(String[] args) {
        System.out.print("Enter a size of array: ");
        int[] arr=new int[scanner.nextInt()];
        userInput(arr);
        printArray(arr);

    }
}

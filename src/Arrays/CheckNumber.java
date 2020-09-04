package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Check whether n is present in an array of size m or not.
public class CheckNumber {
    private static Scanner scanner=new Scanner(System.in);
    public static boolean checkIf(int num,int arraySize){
        int arr[]=new int[arraySize];
        userInput(arr);
        for(int i=0;i<arr.length;i++){
            if(num==arr[i])
                return true;
        }
       return false;

    }
    private  static void userInput(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print("Enter "+i+" number: ");
            arr[i]=scanner.nextInt();

        } }


    public static void main(String[] args) {
        System.out.println("Enter the number which you want check ");
        int numToCheck=scanner.nextInt();
        System.out.println("Enter a size of array ");
        int arraySize=scanner.nextInt();
        System.out.println(checkIf(numToCheck,arraySize));
    }

}

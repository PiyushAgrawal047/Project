package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {


    public static boolean isReverse(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i])
                    return false;
            }
        }
        return true;
    }
    public static void reverseArrat(int[] arr){

        int n=arr.length;
        int start=0,end=n-1;
        while(start<end)
        {
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
            start++;
            end--;
        }

      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println();
//        }
        System.out.print("before reverse");
        System.out.println( Arrays.toString(arr));
        System.out.println("after reverse");
        reverseArrat(arr);
        System.out.println(Arrays.toString(arr));


    }
}

package Arrays;

import java.util.*;

public class ArrayReverse1{
    public static void reverse(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        calculation(arr,start,end);


    }
    public static void calculation(int[] arr, int start,int end){


        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        printArray(arr);
    }
    public static void printArray(int[]arr){


        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
    public static void  main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrlen=sc.nextInt();
        int[] arr=new int[arrlen];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
    }
}

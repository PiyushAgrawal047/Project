package Arrays;

import java.util.Scanner;
//Naive method



public class LargestNumber {
    //Niave solution for second largest
    public static int largest(int[] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            boolean flag=true;
            for(int j=0;j<length;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }return -1;
    }
    //efficient Method for largest element
//    public static int largest(int[] array){
//        int result=0;
//
//        for(int i=1;i<array.length;i++)
//        {
//            if(array[i]>array[result]){
//                result=i;
//            }
//
//
//        }
//        return result+1;
//    }

//Naive Solution for second largest
//    public static int secondLargest(int[]array){
//        int largest=largest(array);
//        int result=-1;
//        for(int i=0;i<array.length;i++){
//            if(array[i]!=array[largest]){
//            if(result==-1)
//                result=i;
//
//            else if(array[i]>array[result])
//                result=i;
//        }}
//        return result;
//    }

    //Efficent Solutionfor second largest-because this function will no need of largest function which is
    //use in previous method.it will calculate  both largest than second largest.

    public static int secondLargest(int[]array){
        int result=-1;
        int largest=0;
        for(int i=1;i<array.length;i++){
            if(array[i]>array[largest]){

                result=largest;
                largest=i;
            }
            else if(array[i]!=array[largest]){

                if(result==-1||array[i]>array[result]){
                    result=i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("largest element at postion  ,"+largest(array));
        System.out.println("Second Largest element position ,"+secondLargest(array));

    }
}

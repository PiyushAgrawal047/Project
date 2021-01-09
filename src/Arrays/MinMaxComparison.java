package Arrays;

import java.util.Scanner;

public class MinMaxComparison {

    //There are 3 method to solve this problem
    //1. Linear Search(GFG)
    //2. Tournament Method(GFG)
    //3. Pairs Method(GFG)

    // first method


    public static class Pair{
        int min;
        int max;
    }

    public static Pair getMinMax1(int []arr){

        Pair minmax=new Pair();
        int i;
        int n=arr.length;

        if(n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }
        for(i=2;i<n;i++){
            if(arr[i]> minmax.max){
                minmax.max=arr[i];
            }
            else if(arr[i]< minmax.min){
                minmax.min=arr[i];
            }
        }
        return minmax;
    }
//_________________________________________________________________________________________

   /* METHOD 3 (Compare in Pairs)[GFG]
    If n is odd then initialize min and max as first element.
    If n is even then initialize min and max as minimum and maximum of the first two elements respectively.
    For rest of the elements, pick them in pairs and compare their
    maximum and minimum with max and min respectively.*/


    public static Pair getMinMax2(int []arr){
        Pair minmax1=new Pair();
        int i;
        int n=arr.length;
        if(n%2==0){
            if(arr[0]>arr[1]){
                minmax1.max=arr[0];
                minmax1.min=arr[1];
            }

            else{
                minmax1.max=arr[1];
                minmax1.min=arr[0];
            }
            i=2; /* set the starting index for loop */
        }
        /* If array has odd number of elements then
           initialize the first element as minimum and
           maximum */
        else{

            minmax1.max=arr[0];
            minmax1.min=arr[0];
            i=1; /* set the starting index for loop */
        }

        /* In the while loop, pick elements in pair and
     compare the pair with max and min so far */

        while(i<n-1){

            if(arr[i]>arr[i+1]) {
                if (arr[i] > minmax1.max) {
                    minmax1.max = arr[i];
                }
                if (arr[i + 1] < minmax1.min) {
                    minmax1.min = arr[i + 1];
                }
            }else {
                    if(arr[i+1]> minmax1.max){
                        minmax1.max=arr[i+1];
                    }
                    if(arr[i]< minmax1.min){
                        minmax1.min=arr[i];
                    }
                }

            i+=2;
                /*Increment the index by 2 as two
            elements are processed in loop*/
        }

        return minmax1;
    }

    //Tournament Method
    public static Pair getMinMax3(int arr[],int low,int high){
        Pair minmax3=new Pair();
        Pair mml=new Pair();
        Pair mmr=new Pair();
        int mid;

        //if there is one element
        if(low==high){
            minmax3.min=arr[low];
            minmax3.max=arr[low];
            return minmax3;
        }

        //if there is 2 element
        if(high==low+1){
            if(arr[low]>arr[high]){
                minmax3.max =arr[low];
                minmax3.min=arr[high];
            }
            else{
                minmax3.max=arr[high];
                minmax3.min=arr[low];
            }
            return minmax3;
        }
        //if there is more then 2 element
        mid=(low+high)/2;
        mml=getMinMax3(arr,low,mid);
        mmr=getMinMax3(arr,mid+1,high);
        if(mml.min<mmr.min){
            minmax3.min=mml.min;
        }else {
            minmax3.min=mmr.min;
        }
        if(mml.max>mmr.max){
            minmax3.max=mml.max;
        }else{
            minmax3.max=mmr.max;
        }

        return minmax3;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }

        Pair minmax= getMinMax1(arr);
        Pair minmax1=getMinMax2(arr);
        Pair minmax2=getMinMax3(arr,0,arr.length-1);
        System.out.printf("\n minimum element is %d",minmax.min);
        System.out.printf("\n maximum element is %d",minmax.max);
        System.out.printf("\n minimum element is %d",minmax1.min);
        System.out.printf("\n maximum element is %d",minmax1.max);
        System.out.println();
        System.out.printf("\n maximum element is %d",minmax2.max);
        System.out.printf("\n maximum element is %d",minmax2.min);
    }
}

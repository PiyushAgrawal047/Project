package Arrays;

import java.util.Scanner;

public class MoveNegative
{
    //Naive  solution ,quick sort approach
    public static void rearrange(int a[])
    {
        int n=a.length;
        int j=0 , temp;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                if(i!=j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }

    }

    //Two-Pointer algorithnm approach(From GFG).

    // Function to shift all the negative elements on left side
    public static void shiftAll(int arr[],int left, int right){
        // Loop to iterate over the array from left to the right
            while(left<=right)
            {
                // Condition to check if the left and the right elements are negative
                if(arr[left]<0&&arr[right]<0){
                    left++;
                }
                // Condition to check if the left pointer element is positive andthe right pointer element is negative

                else if(arr[left]>0&& arr[right]<0){
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }

                // Condition to check if both the elements are positive

                else if(arr[left]>0&&arr[right]>0){
                    right++;
                }
                else{
                    left++;
                    right--;
                }



            }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int arrlength=scanner.nextInt();
        int array[] =new int[arrlength];
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        int i=0;
        shiftAll(array,i,arrlength-1);
        printArray(array);

    }
}

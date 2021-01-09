package Arrays;

import java.util.Scanner;

public class Sort012 {
    public static void sort012(int []a,int n){
        int low=0;
        int mid=0;
        int  high=n-1;
        int temp=0;
        while(mid<=high){
            switch (a[mid]){
                case 0:
                    temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;

                    high--;
                    break;
            }
        }
    }
    public static void printArray(int []a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    //second Method
    public static void sort(int []a,int n){
        int i,cnt0=0,cnt1=0,cnt2=0;
        for(i=0;i<n;i++){
            switch (a[i]){
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i=0;
        while (cnt0>0){
            a[i++]=0;
            cnt0--;
        }
        while (cnt1>0){
            a[i++]=1;
            cnt1--;
        }
        while (cnt2>0){
            a[i++]=2;
            cnt2--;
        }
        printArray(a,n);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

//        sort012(arr,size);
//        printArray(arr,size);

        sort(arr,size);
    }
}

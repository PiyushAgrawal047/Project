//package Arrays;
//
//public class MoveZeros {
//    //Niave Solution
//    public static void swap(int[] a,int[] b)
//    {
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+""+b);
//
//
//    }
//    public static void moveToEnd(int[]arr){
//
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                for(int j=i+1;j<n;j++){
//                    if(arr[j]!=0){
//                        swap(int[i],int[j]);
//                    }
//                }
//            }
//        }
//    }
//}

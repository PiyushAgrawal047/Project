package Arrays;
//this program is for sorted array means array wil be sorted then we will be removing duplicates element 
public class DuplicateArray {
    //Naive Solution
//    public static int removeDuplicates(int arr[]){
//        int n=arr.length;
//        int temp[]=new int[n];
//        temp[0]=arr[0];
//        int res=1;
//        for(int i=1;i<arr.length;i++){
//            if(temp[res-1]!=arr[i]){
//                temp[res]=arr[i];
//                res++;
//            }
//        }
//        for(int i=0;i<res;i++){
//            arr[i]=temp[i];
//        }
//        return res;
//    }
    //Efficient Method
    public static int removeDup(int[] arr){

        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{10,20,20,30,30,30};
       int n=removeDup(arr);
        System.out.print("[");
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.print("]");
    }

}

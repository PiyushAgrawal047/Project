package Arrays;

public class MinMax {
    public static int min(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.min(res,arr[i]);
        }
        return res;
    }
    public static int max(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }
//    public static void minMaxElemnent(int[]arr){
//        int temp=0;
//        for(int i=0;i<arr.length;i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("minimun element"+arr[0]);
//        System.out.println("maximum element"+arr[arr.length-1]);
//    }

    public static void main(String[] args) {
        int[] arr={3,4,2,4,1};
//        minMaxElemnent(arr);
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
}

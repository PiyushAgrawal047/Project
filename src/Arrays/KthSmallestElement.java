package Arrays;
import java.util.*;
public class KthSmallestElement {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int k=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[k-1]);

        }

    }
 
}

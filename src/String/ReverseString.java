package String;

import java.util.Scanner;

public class ReverseString {
    public static void stringReverse(char[] s){
//        int left=0,right=s.length-1;
//        while(left<right){
//            char temp=s[left];
//            s[left++]=s[right];
//            s[right--]=temp;
//
//        }

        //novice method
        for (int i=s.length-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }
        System.out.println();
//        return String.valueOf(s);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
//        System.out.println(stringReverse(s.toCharArray()));
        stringReverse(s.toCharArray());
    }
}

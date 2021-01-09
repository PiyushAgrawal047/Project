package String;

import java.util.Scanner;

public class ReverseVowel {
    public static boolean checkVowel(char ch){

        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U');
    }
//    public static String reverse(String str){
//        int j=0;
//        char[]c=str.toCharArray();
//        String vowel="";
//        for(int i=0;i<c.length;i++){
//            if(checkVowel(c[i])){
//                j++;
//            vowel+=c[i];
//        }
//
//        }
//
//        for(int i=0;i<c.length;i++){
//            if(checkVowel(c[i])){
//                c[i]=vowel.charAt(--j);
//            }
//        }
//        return String.valueOf(c);
//    }
    public static String reverse1(String str){
        int i=0,j=str.length()-1;
        char[] str1=str.toCharArray();
        while(i<j){
            if(!checkVowel(str1[i])){
                i++;
                continue;
            }
            if(!checkVowel(str1[j])){
                j--;
                continue;
            }
            //swaping
            char temp=str1[i];
            str1[i]=str1[j];
            str1[j]=temp;
            i++;
            j--;
        }
        String str2=String.copyValueOf(str1);
        return str2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
//        System.out.println(reverse(str));
        System.out.println(reverse1(str));
    }
}

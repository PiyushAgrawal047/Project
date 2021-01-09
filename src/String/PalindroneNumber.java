package String;

import java.util.Scanner;

public class PalindroneNumber {

    public static void palindrone(String s){
        String reverse="";
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)) System.out.println("Yes! it is palindrome.");

        else System.out.println("No! it is not a palindrome.");
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        palindrone(s);


    }
}

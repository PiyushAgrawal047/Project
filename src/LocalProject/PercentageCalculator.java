package LocalProject;

import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter total number of subject: ");
         int totalSubject=scanner.nextInt();
        System.out.println("Enter a marks");
         int[] marks=new int[totalSubject];
         int[] outOf=new int[totalSubject];
         int n=outOf.length;
         int m=marks.length;
         for(int i=0;i<outOf.length;i++){
             System.out.print("Enter "+i+1+" subject mark");
             marks[i]=scanner.nextInt();
             System.out.print("out of");
             outOf[i]=scanner.nextInt();
         }
         int outofStore=0;
         int marksStore=0;

         for(int i=0;i<n;i++){
             outofStore+=outOf[i];
             marksStore+=marks[i];

         }
         int percentage=(marksStore/outofStore)*100;

        System.out.println("you got "+percentage+"% in your exam");
    }

}

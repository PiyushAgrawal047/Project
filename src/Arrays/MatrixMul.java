package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMul {
    private static Scanner scaaner=new Scanner(System.in);
    public static void multiplcation(int row1,int col1,int a[][],
                          int row2,int col2,int b[][]){
        if(row2!=col1){
            System.out.println("INVALID MATRIX ,Please try again");
            return;
        }
        System.out.println("Enter 1st Matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("please enter-"+i+"row "+j+"-col");
                a[i][j]=scaaner.nextInt();
            }
        }
        System.out.println("Enter 2nd Matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("please enter-"+i+"row "+j+"-col");
                b[i][j]=scaaner.nextInt();
            }
        }
        System.out.println("Matrix  A:");
        printMatrix(a,row1,col1);
        System.out.println("Matrix B: ");
        printMatrix(b,row2,col2);

        int c[][]= new int[row1][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Final Matrix");
        printMatrix(c,row1,col2);
    }
    public static void printMatrix(int finalMatrix[][],int rowSize,int colSize)
    {
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                System.out.print(finalMatrix[i][j] + " ");

            }System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter row1 element:");
        int row1=scaaner.nextInt();
        System.out.println("Enter col1 element:");
        int col1=scaaner.nextInt();
        System.out.println("Enter row2 element:");
        int  row2=scaaner.nextInt();
        System.out.println("Enter col2 element:");
        int col2=scaaner.nextInt();

        int a[][]=new int[row1][col1];
        int b[][]=new int[row2][col2];
        multiplcation(row1,col1,a,row2,col2,b);

    }
}

package ArrayList;
import netscape.security.UserTarget;

import java.util.*;
public class GroceriesApplication {
    private static Scanner scanner=new Scanner(System.in);
    private static GroceriesList groceriesList=new GroceriesList();

    public static void main(String[] args) {
        boolean finish=false;
        int choice=0;
        printInstruction();
        while(!finish){
            System.out.println("Please,Enter  Your choice");
            choice=scanner.nextInt();
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceriesList.totalItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    finish=true;
                    break;
            }
        }
    }
    public static void printInstruction() {
        System.out.println("\n press");
        System.out.println("\t 0: To Know instruction. ");
        System.out.println("\t 1: To check your cart's item. ");
        System.out.println("\t 2: To add item to your cart. ");
        System.out.println("\t 3: To replace item from cart. ");
        System.out.println("\t 4: To remove item from cart.  ");
        System.out.println("\t 6: To finish list. ");
    }
    public static void addItem(){
        System.out.println("Please, Enter groceris item ");
        groceriesList.addGroceryItem(scanner.nextLine());
        scanner.nextLine();
    }
    public static void modifyItem(){
        System.out.println("please,enter postion ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item name");
        String name=scanner.nextLine();
        groceriesList.modifyItem(itemNo-1,name);

    }
    public static void removeItem(){
        System.out.println("Enter item number to reomve");
        int numb=scanner.nextInt();
        scanner.nextLine();
        groceriesList.removItem(numb-1);
    }
    public static void searchItem(){
        System.out.println("Enter the item name to search");
        String s=scanner.nextLine();
        if(groceriesList.findItem(s)!=null){
            System.out.println("found "+s+" in your groceris list");
        }else{
            System.out.println("item "+s+" is not found in  groceris list");
        }

    }
}
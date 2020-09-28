package ArrayList;

import java.util.*;

public class GroceriesList {
    ArrayList<String> groceryList = new ArrayList();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void totalItem() {
        System.out.println("You have " + groceryList.size() + " item in your personal cart " + "\n Items are: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "->" + groceryList.get(i));
        }
    }

    public void modifyItem(int postion, String newItem) {
        groceryList.set(postion, newItem);
        System.out.println("Your cart " + (postion + 1) + "has been updated ");

    }
    public String findItem(String searchItem){
int postion=groceryList.indexOf(searchItem);
        if(postion>=0){
            return groceryList.get(postion);
        }
        return null;
    }

public void removItem(int postion){
        groceryList.remove(postion);
    System.out.println("Item has been deleted");
}

    }




















//    public static void main(String[] args){
//GroceriesList groceriesList=new GroceriesList();
//groceriesList.addGroceryItem("patato");
//groceriesList.addGroceryItem("tomato");
//groceriesList.addGroceryItem("rice");
//groceriesList.addGroceryItem("lentils");
//groceriesList.addGroceryItem("milk");
//groceriesList.totalItem();
//groceriesList.modifyItem(3,"Mobile");
//        groceriesList.totalItem();
//        System.out.println(groceriesList.findItem("Tomato"));
//    }
package exc10_arrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryList(String item) {
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("Grocery list have: " + groceryList.size() + " element(s)");
        for (int i = 0; i < this.groceryList.size(); i++)
            System.out.println("List item " + i + " " + this.groceryList.get(i));
    }


    public Boolean onFile(String item) {
        int position = findItem(item);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public void modifyGroceryItem(String currentItem,String newItem) {
        int position = findItem(currentItem);
        if (position >= 0)
            modifyGroceryItem(position, newItem);
        else
            System.out.println("Don't have item to modify");
    }
        //a method to use only in class !!!
    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + position + " has been modified");
    }

    private int findItem(String item) {
        return this.groceryList.indexOf(item);  // return >= 0  exist
    }                                           // return < 0  does not exist


    public void removeGroceryList(String item){
        int position = findItem(item);
        if ( position >= 0)
            removeGroceryList(position);
        else
            System.out.println("Don ' have this item already!");
    }
    private void removeGroceryList(int position)
    {
        this.groceryList.remove(position);
    }

}

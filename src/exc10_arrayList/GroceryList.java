package exc10_arrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryList(String item) {
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        for (int i = 0; i < this.groceryList.size(); i++)
            System.out.println("List item " + i + this.groceryList.get(i));
    }

    public void changeGroceryList(int position, String item) {
        this.groceryList.set(position, item);
    }

    public void removeGroceryList(int position) {
        this.groceryList.remove(position);
    }
    public String find(String item){
        int position = groceryList.indexOf(item);
        if (position >=0)
        {
            return groceryList.get(position);
        }
        return null;
    }



}

package exc15_abstract_classes_challenge;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //empty list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                //new item  is greater move right
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is not next item
                    currentItem.setNext(newItem).setPrevious(currentItem); //simplify
                    return true;
                }
            } else if (comparison > 0) {
                //new item is less , insert before
                if (currentItem.previous() != null) {
                    //    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    // because set(nextItem) returns newItem and we set immediately its previous node !!!!! very important
                    //   newItem.setNext(currentItem).setPrevious(newItem);
                    // same situation to this upper
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);

                } else {
                    //the previous node
                    newItem.setNext(this.root);// could be newItem.setNext(this.root).setPrevious(newItem) cause of upper !!!
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " is already pressent in linked list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                //the item is not on the list
                return false;
            }
        }

        //end of list
        return false;
    }

    @Override
    public void tranverse(ListItem root) {
        if (root == null) {
            System.out.println("the list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}

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
            //empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                //new item  is greater
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
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    //there is not a valid previous node
//                   this.root currentItem.setPrevious(newItem);
//                    newItem.setNext(currentItem);
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
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
            System.out.println("bad argument");
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
                System.out.println("xdd");
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}

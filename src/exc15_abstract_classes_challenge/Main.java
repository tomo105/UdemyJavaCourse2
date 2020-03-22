package exc15_abstract_classes_challenge;

public class Main {
    public static void main(String[] args) {


        String datau = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String data = "5 7 3 9 8 2 1 0 4 6";
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("________");
        String[] singleString = data.split(" ");
        for (String s : singleString) {
            myLinkedList.addItem(new Node(s));
        }

        myLinkedList.traverse(myLinkedList.getRoot());

            SearchTree tree = new SearchTree(null);

        for (String s : singleString) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("5"));
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

    }
}

package exc15_abstract_classes_challenge;

public class Main {
    public static void main(String[] args) {


        String data = "3 6 4 8 0 1";
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.tranverse(myLinkedList.getRoot());

        String[] singleString = data.split(" ");
        for (String s : singleString) {
            myLinkedList.addItem(new Node(s));
        }

        myLinkedList.tranverse(myLinkedList.getRoot());
    }
}

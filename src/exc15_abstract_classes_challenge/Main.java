package exc15_abstract_classes_challenge;

public class Main {
    public static void main(String[] args) {


        String data = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String data6 = "5 7 3 9 8 2 1 0 4 6";
        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.tranverse(myLinkedList.getRoot());
        System.out.println("________");
        String[] singleString = data.split(" ");
        for (String s : singleString) {
            myLinkedList.addItem(new Node(s));
        }

        myLinkedList.tranverse(myLinkedList.getRoot());
    }
}

package exc15_abstract_classes_challenge;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
         //   System.out.println(((String) super.getValue()).compareTo(((String) item.getValue())));
            return ((String) super.getValue()).compareTo(((String) item.getValue()));
        } else {
            return -1;
        }
    }
}

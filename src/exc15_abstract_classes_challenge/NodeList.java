package exc15_abstract_classes_challenge;


public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem  item);
    boolean removeItem(ListItem item);
    void tranverse(ListItem root);
    
}

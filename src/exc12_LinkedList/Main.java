package exc12_LinkedList;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tom", 34.2);
        Customer customerNumberTwo;
        customerNumberTwo = customer;
        customerNumberTwo.setBalance(98.2);

        System.out.println(customer.getName() + " " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(4);
        intList.add(6);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1, 1);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        // insert in the middle of array is very slow !!!
        // in linked list it is faster


        LinkedList<String> linkedList = new LinkedList<>();
        addInOrder(linkedList, "Brisbane");
        addInOrder(linkedList, "Melbourne");
        addInOrder(linkedList, "London");
        addInOrder(linkedList, "Tokio");
        addInOrder(linkedList, "Rio");
        addInOrder(linkedList, "California");

        printListByUsingIterator(linkedList);
        addInOrder(linkedList, "Laszczow");
        printListByUsingIterator(linkedList);

        linkedList.remove("Tokio");
        linkedList.remove(4);
        printListByUsingIterator(linkedList);

        addInOrder(linkedList, "Dallas");
        printListByUsingIterator(linkedList);


        visit(linkedList);


    }

    private static void printListByUsingIterator(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("element " + i.next());
        }
        System.out.println("___________");
    }

    private static Boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> listIterator = list.listIterator();  // it do not set to first element 1! need to use .next()

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println("you have this city already");
                return false;
            } else if (comparison > 0) {
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }
        }
        list.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> list) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = list.listIterator();
        if (list.isEmpty()) {
            System.out.println("do not have elements");
        } else {
            System.out.println("now visit " + listIterator.next());
            while (!quit) {
                int action = sc.nextInt();
                sc.nextLine();
                switch (action) {
                    case 0:
                        System.out.println("over");
                        quit = true;
                        break;
                    case 1:
                        if(!goingForward){
                            if(listIterator.hasNext())
                                listIterator.next();
                        }
                        goingForward = true;
                        if (listIterator.hasNext()) {
                            System.out.println("Now visiting:  " + listIterator.next());
                        } else {
                            System.out.println("End of cities.");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        if(goingForward){
                            if(listIterator.hasPrevious())
                                listIterator.previous();
                        }
                        goingForward = false;
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now visiting: " + listIterator.previous());
                        } else {
                            System.out.println("You are in the start.");
                        }
                        break;
                    case 3:
                        printMenu();
                }
            }
        }


    }

    private static void printMenu() {
        System.out.println("Available action press 0");
        System.out.println("Go to next city press 1");
        System.out.println("Go to previous city  press 2");
        System.out.println("see menu press 3");

    }

    private static void printList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element " + (i + 1) + " " + list.get(i));
        }
    }
}

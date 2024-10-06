import java.util.Random;

// encapsulates internal structure of linked list
public class ThingList {

    // inner class, private encapsulated class holding refrence to Thing object and next node
    private class Node {
        // association each node has refrence to a thing
        Thing data;
        Node next;

        // constructor initalizes and sets next node to null
        Node(Thing t) {
            this.data = t;
        }
    }

    private Node head;

    // constructor inalizing the list as empty
    public ThingList() {
        head = null;
    }

    public void addThing(Thing t) {
        Node newNode = new Node(t);
        newNode.next = head;
        head = newNode;
    }

    // moves every Thing in the list by calling maybeTurn and step methods
    // polymorphism every type might move diffrently 
    public void moveAll(Random rand) {  
        Node current = head;
        while (current != null) {
            current.data.maybeTurn(rand);
            current.data.step();
            current = current.next;
        }
    }

    // prints state row column label 
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            // move to next node
            current = current.next;
        }
        // woohoo done 
        System.out.println("done");
    }
}

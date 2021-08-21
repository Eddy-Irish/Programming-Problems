/* Putting the SinglyLinkedList Implementation through it's paces,
   testing all of the methods to make sure they are doing what I
   mean them to */
package LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.printList();
        boolean empty = list.isEmpty();
            if (empty) { System.out.println("Oh no! The List is empty!"); }
            else { System.out.println("All is well, the list is not empty."); }
        list.delete();
        list.printList();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printList();
        list.deleteAfterIndex(1);
        list.printList();
        list.insertNodeAtEnd(10);
        list.printList();

    }
    
}

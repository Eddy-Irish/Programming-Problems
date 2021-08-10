class Node {
    public int data;
    public Node next;

    public void showNodeData() {
        System.out.print(" [" + data + "] ");
    }
}

public class SinglyLinkedList {
    private Node head;

    public boolean isEmpty() {
        return(head == null);
    }
    
    public void insert(int data) {
        Node insertNode = new Node();
        insertNode.data = data;
        insertNode.next = head;
        head = insertNode;
    }

    public Node delete() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void deleteAfterValue(int value) {
        Node temp = head;
        while (temp.next != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void deleteAfterIndex(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void insertNodeAtEnd(int value) {
        Node traverse = head;
        while (traverse.next != null) {
            traverse = traverse.next;
        }
        Node insertNode = new Node();
        insertNode.data = value;
        traverse.next = insertNode;
    }

    public void printList() {
        System.out.print("Current values of linked list: HEAD => ");
        Node traverse = head;
        while (traverse != null) {
            traverse.showNodeData();
            traverse = traverse.next;
        }
        System.out.println();
    }

}

package LinkedList;

public class linkedList {
    private Node head;
    private Node tail;
    private int size;

    public linkedList() {
        this.size = 0;
    }
    // finding the node if the given value
    public Node find(int val){
        Node node = head;
        while (node!=null){
            if (node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // deleting the node at a particular index
    public int deleteAtIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }
    //deleting the last node of the link list
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    //geeting the the node from head to the index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }
    // deleting the first element
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    // inserting node at a particular index
    public void insertAtIndex(int val,int index){
        if (index == 0){
            insertAtFirstIndex(val);
            return;
        }
        if (index == size){
            insertAtLast(val);
            return;
        }
        Node temp  = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
    }
    // inserting at the last of the link list
    public void insertAtLast(int val){
        if (tail == null){
            insertAtFirstIndex(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    // function to display the linked list
    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value +"->");
            temp  = temp.next;
        }
        System.out.println("end");
    }
    // inserting the first element at the starting
    public void insertAtFirstIndex(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
// this is the starting of the linkedList
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value; //here we initialized  the value
        }

        public Node(int value, Node next) {
            this.value = value;      // here we initialized  the next node values .
            this.next = next;
        }
    }
}

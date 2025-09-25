package DataStruc;

public class SingleLinkedList <T> {
    Node head;
    class Node{
        T data;
        Node next;

        public Node(T data){
            this.data = data;
            next = null;
        }
    }

    public void addFirst(T data){
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public Object[] toArray(){
        Object[] myObj = new Object[size()];
        Node currentNode = head;
        int i = 0;
        while(currentNode != null) {
            myObj[i++] = currentNode.data;
            currentNode = currentNode.next;
        }
        return myObj;
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void add(int index, T data){
        Node newNode = new Node(data);
        Node currentNode = head;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        Node temp = currentNode.next;
        currentNode.next = newNode;
        newNode.next = temp;
    }

    public T getFirst(){
        return head.data;
    }

    public T getLast(){
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public T get(int index){
        Node currentNode = head;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        return currentNode.next.data;
    }

    public int indexOf(Object o){
        Node currentNode = head;
        int index = 0;
        while(currentNode.next != null){
            if(currentNode.data.equals(o)){
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public void remove(){
        head = head.next;
    }

    public void remove(int index){
        Node currentNode = head;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    public boolean removes(Object o){
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data.equals(o)){
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size(){
        Node currentNode = head;
        int counter = 0;
        while(currentNode != null){
            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }

    public boolean contains(Object o){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data.equals(o)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void display(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

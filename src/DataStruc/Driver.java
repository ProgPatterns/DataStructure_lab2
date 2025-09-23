package DataStruc;

public class Driver {

    public static void main(String[] args) {

        SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.addFirst(4);
        numbers.addFirst(5);

        print(numbers);

        System.out.println();
        numbers.add(2,20);
        numbers.add(5,30);

        numbers.addLast(55);
        numbers.addLast(67);

        System.out.println("after adding more elements: ");
        print(numbers);

        int firstElement = numbers.getFirst();
        System.out.println("\nthe first element of the linkedlist is " + firstElement);

        int lastElement = numbers.getLast();
        System.out.println("the last element of the linkedlist is " + lastElement);

        int element = numbers.get(3);
        System.out.println("the element at index 3 is " + element);

        int index = numbers.indexOf(30);
        System.out.println("the index of element 30 is " + index);

        System.out.println("the initial size of the linkedlist is " + numbers.size());

        numbers.remove();

        System.out.println("after removing first element, new size of the linkedlist is " + numbers.size());

        numbers.remove(4);
        System.out.println("after removing element at index 4, new size is " + numbers.size());

        boolean c = numbers.removes(1);
        System.out.println("the removing the element 1 returns " + c);

        System.out.println("the new size of the linkedlist after removing element 1 is " + numbers.size());

        boolean m = numbers.contains(4);
        System.out.println("the element contains node 4 returns " + m);

        System.out.println("After everything, the final linkedlist is ");
        print(numbers);
    }

    public static void print(SingleLinkedList<Integer> numbers){
        Object [] o = numbers.toArray();
        for(Object p : o){
            System.out.print(p + " ");
        }
    }
}

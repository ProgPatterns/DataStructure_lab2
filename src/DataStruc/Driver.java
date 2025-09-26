package DataStruc;

public class Driver {

    public static void main(String[] args) {
        SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.addFirst(4);
        numbers.addFirst(5);
        System.out.println("initial list");
        print(numbers);

        numbers.addLast(55);
        System.out.println("after adding a new element at the end, new list is");
        print(numbers);

        numbers.add(3,20);
        System.out.println("after adding a new element at index 3, new list is");
        print(numbers);

        System.out.println("the first element of the list is " + numbers.getFirst());

        System.out.println("the last element of the list is " + numbers.getLast());

        System.out.println("the element at index 3 is " + numbers.get(3));

        System.out.println("the index of element 55 is " + numbers.indexOf(55));

        System.out.println("the first element to remove is " + numbers.remove());
        System.out.println("after removing the first element, new list ");
        print(numbers);

        System.out.println("the element to remove at index 2 is " + numbers.remove(2));
        System.out.println("after removing the element at index 2, new list ");
        print(numbers);

        System.out.println("does element 3 exist and removable: " + numbers.removes(3));
        System.out.println("after removing the element, new list ");
        print(numbers);

        System.out.println("the size of the list is " + numbers.size());

        System.out.println("does the list contain element 5: " + numbers.contains(5));
    }

    public static void print(SingleLinkedList<Integer> numbers){
        Object[] o = numbers.toArray();
        for(Object p : o){
            System.out.print(p + " ");
        }
        System.out.println();
    }
}

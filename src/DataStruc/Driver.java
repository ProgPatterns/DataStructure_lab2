package DataStruc;

public class Driver {

    public static void main(String[] args) {

        SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
        numbers.addFirst(1);
        numbers.addFirst(2);
        numbers.addFirst(3);
        numbers.addFirst(4);
        numbers.addFirst(5);
        //numbers.display();


        numbers.add(2,20);
        //numbers.display();


//        int s = numbers.size();
//        System.out.println(s);
        //numbers.toArray();

        //numbers.display();
        numbers.remove();
//        numbers.display();
//
//        int s = numbers.getFirst();
//        System.out.println("the first element of the linkedlist is " + s);
//
//        int p = numbers.getLast();
//        System.out.println("the last element of the linkedlist is " + p);
//
//        int f = numbers.get(3);
//        System.out.println("the element at index " + f);
//
//        numbers.remove(4);
//        numbers.display();
//
//        numbers.remove(1);
//        numbers.display();
//
//        int index = numbers.getIndexOf(30);
//        System.out.println(index);

//        boolean c = numbers.removes(2);
//        System.out.println(c);
//        numbers.display();
//
//        boolean m = numbers.contains(4);
//        System.out.println(m);

        Object [] o = numbers.toArray();
        for(Object p : o){
            System.out.print(p + " ");
        }
    }
}

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        PhoneNumber myPhoneNum = new PhoneNumber("home", "514-402-7590");
//        LinkedList<String> some = new LinkedList<>();
//        System.out.println(myPerson.getPersonPhoneNum());

        //person has-a manager
        Person john = new Person("john", "jones", myPhoneNum);
        Person julie = new Person("julie", "b", new PhoneNumber("office", "123456789"));
        Person bob = new Person("bob", "r", new PhoneNumber("home", "987654321"));
        Person steve = new Person("steve", "p", new PhoneNumber("office", "1122334455"));

        john.setManager(julie);
        julie.setManager(bob);
        bob.setManager(steve);

        //print
        //System.out.println("john's manager: " + john.getManager());

        //starting with the john object print the name of each manager up the hierarchy
        //System.out.println("john's manager: " + john.getManager().getFirstName());

        //the manager of the manager of john
        //System.out.println("john's manager's manager: " + john.getManager().getManager().getFirstName());

        //the manager of the manager of the manager of john
        //System.out.println("john's manager's manager's manager: " + john.getManager().getManager().getManager().getFirstName());


        Person ceo = steve;
        steve.setEmployee(bob);
        bob.setEmployee(julie);
        julie.setEmployee(john);

        //what if we have new ceo, jordan, and we want to make them above steve
        Person jordan = new Person("jordan", "j",new PhoneNumber("office", "1122334455"));

//        ceo = jordan;
//        jordan.setEmployee(steve);

        //print
        Person newCEO = setCEO(ceo, jordan);
        //System.out.println(newCEO.getFirstName());
//        System.out.println("jordan's employee: " + setCEO(ceo, jordan).getEmployee().getFirstName());
//        System.out.println("steve's employee: " + setCEO(ceo, jordan).getEmployee().getEmployee().getFirstName());


        while(newCEO != null){
            System.out.println(newCEO.getFirstName());
            newCEO = newCEO.getEmployee();
        }
    }

    public static Person setCEO(Person ceo, Person newCEO){

        newCEO.setEmployee(ceo);
        ceo = newCEO;
        return ceo;
    }
}
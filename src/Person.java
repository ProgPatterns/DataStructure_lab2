import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private PhoneNumber personPhoneNum;
    private Person manager;
    private Person employee;

    public Person (String firstName, String lastName, PhoneNumber personPhoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personPhoneNum = personPhoneNum;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getPersonPhoneNum() {
        return personPhoneNum;
    }

    public void setPersonPhoneNum(PhoneNumber personPhoneNum) {
        this.personPhoneNum = personPhoneNum;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(personPhoneNum, person.personPhoneNum) && Objects.equals(manager, person.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, personPhoneNum, manager);
    }

    @Override
    public String toString() {
        return "\nfirstName: " + getFirstName() + "\n" +
                "lastName: " + getLastName() + "\n" +
                "Phone Number: " + getPersonPhoneNum();
    }
}

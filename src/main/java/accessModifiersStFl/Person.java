package accessModifiersStFl;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo(){
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName + " SSN: " + ssn);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alex", "Familiya", "123-45-6789");
        Person p2 = new Person("Sasha", "Familiya2", "321-54-9876");
        Person p3 = new Person("Oleksandr", "Familiya3", "987-65-4321");

        p3.setFirstName("Aleksandr");

        p1.printPersonInfo();
        p2.printPersonInfo();
        p3.printPersonInfo();
    }

}

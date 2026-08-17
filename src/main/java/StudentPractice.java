public class StudentPractice {
    public static void main (String[] args){

        Student s1 = new Student (18, "Sasha");

        Student s2 = new Student (29, " Aleksandr");

        System.out.println("Student info before changes");

        s1.printInfo();
        s2.printInfo();

        s1.setAge(25);
        s2.setName("Oleksandr");

        System.out.println("Student info after changes");

        s1.printInfo();
        s2.printInfo();
    }
}

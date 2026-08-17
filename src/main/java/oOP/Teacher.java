package oOP;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Teacher: " + name);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher("John", "Math");

        teacher.printInfo();

        teacher.setSubject("Physics");

        teacher.printInfo();
    }
}

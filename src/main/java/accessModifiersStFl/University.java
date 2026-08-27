package accessModifiersStFl;

public class University {
    static String universityName = "NBMK";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void setUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo(){
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("University name: " + universityName);
    }

    public static void main(String[] args) {
        University s1 = new University(1, "Alex");
        University s2 = new University(2, "Sasha");
        University s3 = new University(3, "Oleksandr");

        s1.printStudentInfo();
        System.out.println();
        s2.printStudentInfo();
        System.out.println();
        s3.printStudentInfo();

        University.setUniversityName("MIT");

        System.out.println();
        System.out.println("University name after change");
        s1.printStudentInfo();
    }
}

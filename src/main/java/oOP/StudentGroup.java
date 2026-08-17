package oOP;

public class StudentGroup {
 private String groupName;
 private int studentCount;

 public StudentGroup(String groupName, int studentCount){
     this.groupName = groupName;
     this.studentCount = studentCount;
 }

    public int getStudentCount() {
        return studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo(){
        System.out.println("Group name is: " + this.groupName + " and group count is: " + this.studentCount);
    }

    public static void main(String[] args) {
        StudentGroup sG = new StudentGroup("3-B", 15);
        sG.setStudentCount(20);
        sG.printInfo();
    }
}

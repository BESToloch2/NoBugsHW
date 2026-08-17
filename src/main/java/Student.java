public class Student {
    private int age;
    private String name;

    Student (int age, String name){
        this.age = age;
        this.name = name;
    }

    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void printInfo(){
        System.out.println("Student information: " + this.age + ", " + this.name);
    }
}

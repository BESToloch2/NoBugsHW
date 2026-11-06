package complexTasks.task2;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email){
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

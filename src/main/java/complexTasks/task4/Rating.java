package complexTasks.task4;

public class Rating <T extends Number>{
    private final T grade;
    public Rating(T grade){
        this.grade = grade;
    }
    public T getGrade(){
        return grade;
    }
}

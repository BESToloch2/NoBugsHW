package complexTasks.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> elements;
    public GradeService(){
        elements = new ArrayList<>();
    }

    public synchronized void addGrade(StudentGrade<T> studentGrade){
        if (studentGrade.getGrade().doubleValue() < 0){
            throw new InvalidGradeException("Garde can`t be negative");
        }
        elements.add(studentGrade);
    }

    public synchronized double avgGradeBySubject(String subject){
        return elements.stream().filter(e -> e.getSubject().equals(subject))
                .mapToDouble(e -> e.getGrade()
                        .doubleValue())
                .average().orElse(0.0);
    }

    public synchronized List<StudentGrade<T>> getElements() {
        return  List.copyOf(elements);
    }
}

package complexTasks.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    GradeService<Integer> integerGradeService;
    GradeService<Double> doubleGradeService;

    @BeforeEach
    public void setup(){
        integerGradeService = new GradeService<>();
        doubleGradeService = new GradeService<>();
    }

    @Test
    public void weAbleToAddGradeToList(){
        integerGradeService.addGrade(new StudentGrade<>("Alex", "Math", 7));
        assertEquals(1, integerGradeService.getElements().size());
    }

    @Test
    public void weCannotAddNegativeGrade(){
        InvalidGradeException exception = assertThrows(InvalidGradeException.class,
                () -> integerGradeService.addGrade(new StudentGrade<>("Sasha", "Biology", -9)));

        assertEquals("Garde can`t be negative", exception.getMessage());
    }

    @Test
    public void weCanCalculateAverageIntegerGradeBySubject(){
        integerGradeService.addGrade(new StudentGrade<>("Alex", "Geography", 10));
        integerGradeService.addGrade(new StudentGrade<>("Emma", "Geography", 8));
        integerGradeService.addGrade(new StudentGrade<>("Daniel", "English", 12));

        assertEquals(9, integerGradeService.avgGradeBySubject("Geography"));
    }

    @Test
    public void weCanCalculateAverageDoubleGradeBySubject(){
        doubleGradeService.addGrade(new StudentGrade<>("Michael", "Mathematics", 11.5));
        doubleGradeService.addGrade(new StudentGrade<>("Sophia", "Mathematics", 7.3));
        doubleGradeService.addGrade(new StudentGrade<>("Oliver", "Physics", 9.9));
        assertEquals(9.4, doubleGradeService.avgGradeBySubject("Mathematics"), 0.0001);
    }
}

package complexTasks.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    TaskService<String> stringTaskService;
    Task<String> string_task1;
    Task<String> string_task2;
    Task<String> string_task3;

    @BeforeEach
    public void setup(){
        stringTaskService = new TaskService<>();
        string_task1 = new Task<>("1", TaskStatus.TODO, TaskPriority.HIGH, LocalDate.of(2026, 11, 10));
        string_task2 = new Task<>("2", TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM, LocalDate.of(2026, 11, 15));
        string_task3 = new Task<>("3", TaskStatus.DONE, TaskPriority.LOW, LocalDate.of(2026, 11, 5));
    }

    @Test
    public void userCanAddNewTask(){
        stringTaskService.addTask(string_task1);
        assertTrue(stringTaskService.getTasks().contains(string_task1));
    }

    @Test
    public void userCannotAddExistedIDTwice(){
        stringTaskService.addTask(string_task1);
        Task<String> taskWithSameID = new Task<>("1", TaskStatus.IN_PROGRESS, TaskPriority.LOW, LocalDate.of(2000, 1, 2));
        InvalidIDException exception = assertThrows(InvalidIDException.class, () -> stringTaskService.addTask(taskWithSameID));
        assertEquals("Task with the same ID already exists", exception.getMessage());
    }

    @Test
    public void userCanDeleteTask(){
        stringTaskService.addTask(string_task1);
        stringTaskService.addTask(string_task2);
        assertTrue(stringTaskService.getTasks().contains(string_task1) && stringTaskService.getTasks().contains(string_task2) );
        stringTaskService.removeTaskByID("1");
        assertFalse(stringTaskService.getTasks().contains(string_task1));
    }


}

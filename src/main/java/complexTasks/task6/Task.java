package complexTasks.task6;

import java.time.LocalDate;
import java.util.Objects;

public class Task <T> {
    private T id;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDate date;

    public Task(T id, TaskStatus status, TaskPriority priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

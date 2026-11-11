package complexTasks.task6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService <T>{
    private final List<Task<T>> tasks;

    public TaskService(){
        tasks = new ArrayList<>();
    }

    public List<Task<T>> getTasks(){
        return List.copyOf(tasks);
    }

    public synchronized void addTask(Task<T> task){
        if (tasks.contains(task)){
            throw new InvalidIDException("Task with the same ID already exists");
        }
        tasks.add(task);
    }

    public synchronized void removeTaskByID(T id){
        tasks.removeIf(t -> t.getId().equals(id));
    }

    public List<Task<T>> filterByStatus(TaskStatus status){
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .toList();
    }

    public List<Task<T>> filterByPriority(TaskPriority priority){
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }

    public List<Task<T>> sortByDate(boolean isAscending){
        if (isAscending) {
            return tasks.stream().sorted(Comparator.comparing(Task::getDate)).toList();
        }else {
            return tasks.stream().sorted(Comparator.<Task<T>, LocalDate> comparing(Task::getDate).reversed()).toList();
        }
    }
}

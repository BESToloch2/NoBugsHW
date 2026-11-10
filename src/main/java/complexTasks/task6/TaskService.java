package complexTasks.task6;

import java.util.ArrayList;
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




}

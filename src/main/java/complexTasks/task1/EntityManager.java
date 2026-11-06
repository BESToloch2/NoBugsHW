package complexTasks.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private final List<T> elements;

    public EntityManager(){
        elements = new CopyOnWriteArrayList();
    }

    public void add(T element){
        elements.add(element);
    }

    public boolean delete(String name){
        return elements.removeIf(e -> e.getName().equalsIgnoreCase(name));
    }

    public boolean isActive(String name){
        boolean status = true;
        for (T element : elements){
            if (element.getName().equalsIgnoreCase(name)){
                status = element.getIsActive();
            }
        }
        return status;
    }

    public List<T> getAll(){
        return List.copyOf(elements);
    }

    public List<T> filterByAge(int min, int max){
        return elements.stream().filter(e -> e.getAge() >= min && e.getAge() <= max).collect(Collectors.toList());
    }

    public List<T> filterByName(String name){
        return elements.stream().filter(e -> e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public List<T> filterByIsActive(boolean isActive){
        return elements.stream().filter(Entity::getIsActive).collect(Collectors.toList());
    }

}

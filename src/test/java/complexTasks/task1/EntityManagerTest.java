package complexTasks.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {

    private EntityManager<Student> manager;
    private Student s1;
    private Student s2;
    private Student s3;

    @BeforeEach
    public void setup(){
        manager = new EntityManager<>();
        s1 = new Student(18, "Alex", true);
        s2 = new Student(22, "Masha", true);
        s3 = new Student(50, "Sasha", false);
    }

    //*Добавление элементов:
    @Test
    public void managerCanAddStudent(){
        manager.add(s1);

        assertEquals(1, manager.getAll().size());

        assertTrue(manager.getAll().contains(s1));

        assertEquals(s1.getName(), manager.getAll().get(0).getName());
        assertEquals(s1.getAge(), manager.getAll().get(0).getAge());
        assertEquals(s1.getIsActive(), manager.getAll().get(0).getIsActive());
    }

    //Удаление элементов:
    @ParameterizedTest
    @ValueSource(strings = "Alex")
    public void managerCanDeleteStudentByName(String name){

        manager.add(s1);

        assertTrue(manager.delete(name));

        assertFalse(manager.delete(name));
    }

    //Получение всех элементов:
    @Test
    public void userCanGetCopyOfAList(){
        manager.add(s1);

        List<Student> copy = manager.getAll();

        assertTrue(manager.getAll().containsAll(copy));
    }

    //Специализированные методы фильтрации: Фильтрация по возрасту
    @Test
    public void managerCanFilterStudentsByAge(){
        manager.add(s1);
        manager.add(s2);
        manager.add(s3);

        List<Student> controlResult = manager.getAll();

        List<Student> result = manager.filterByAge(17, 49);

        assertFalse(result.contains(s3));

        assertEquals(2, result.size());
    }

    /* Специализированные методы фильтрации: Фильтрация по имени */
    @Test
    public void managerCanFilterStudentsByName(){
        manager.add(s1);
        manager.add(s2);
        manager.add(s3);
        List<Student> result = manager.filterByName("Sasha");
        assertTrue(!result.contains(s1) && !result.contains(s2) && result.contains(s3));
    }

    /* Специализированные методы фильтрации: Фильтрация по активности */
    @Test
    public void managerCanFilterStudentsByActivityStatus(){
        manager.add(s1);
        manager.add(s2);
        manager.add(s3);
        List<Student> result = manager.filterByIsActive(true);
        assertFalse(result.contains(s3));
    }
}

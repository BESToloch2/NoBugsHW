package problemsSolvingHW.debugTask5;

public class DebugTask5_Main {
    /*Решал уже поздно ночью, поэтому сначала немного запутался, какой класс лучше исправлять. В итоге решил изменить только DebugTask5:
    сделал так, чтобы updateAge() возвращал новый объект Person с увеличенным возрастом.

Понимаю, что можно было сделать иначе: добавить setAge() в класс Person и изменять возраст существующего объекта без создания нового.
Но в процессе решения почему-то пошёл первым путём :)*/

    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        Person person2 = updateAge(person);
        System.out.println("Updated age: " + person2.getAge());
    }
    public static Person updateAge(Person person) {
       return new Person(person.getName(), person.getAge() + 1);
    }
}

package exceptionsAndGenerics.generics;

public class Pair<T, U> {
    //3. Задача на дженерик с двумя типами данных:
    //Определите класс Pair с использованием двух дженерик типов <T, U>.
    //В классе Pair создайте две переменные экземпляра разных типов: T first и U second.
    //Реализуйте методы setFirst(T item), getFirst(), setSecond(U item) и getSecond() для работы с этими объектами.
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.setFirst("Alex");
        pair.setSecond(25);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

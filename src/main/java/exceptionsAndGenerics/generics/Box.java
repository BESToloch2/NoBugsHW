package exceptionsAndGenerics.generics;

import practice_8.Book;

public class Box<T> {
    //1. Задача на дженерик класс:
    //Определите класс с использованием дженерик типа <T>.
    //В классе Box реализуйте методы set(T item) и get(), которые позволяют устанавливать и получать объект типа T.
    //Для хранения объекта используйте переменную экземпляра типа T.

    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("sdafaf");

        Box<Integer> box2 = new Box<>();
        box2.setItem(4);

    }
}

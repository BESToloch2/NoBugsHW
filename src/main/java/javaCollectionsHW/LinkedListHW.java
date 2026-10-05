package javaCollectionsHW;

import java.util.LinkedList;

public class LinkedListHW {

    private LinkedList<String> lList;

    public LinkedListHW(){
        this.lList = new LinkedList<>();
    }

    //Задача 2:
    //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

    public void addTask(String task){
        lList.addLast(task);
    }

    public void processQueue(){
        System.out.println("Done: " + lList.poll());
    }

    public void showQueue(){
        System.out.println("Total Tasks: " + lList.size());
        lList.forEach(System.out::println);
        System.out.println();
    }

    //Задача 3:
    //Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

    public void addString(String string){
        lList.addLast(string);
    }

    public void printFirstAndLastElement(){
        System.out.println("First element is: " + lList.getFirst());
        System.out.println("Last element: " + lList.getLast());
    }

    public static void main(String[] args) {
        //Задача 2:
        //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

        LinkedListHW tasks = new LinkedListHW();

        tasks.addTask("Watch Lecture");
        tasks.addTask("Coding Practice");
        tasks.addTask("HW Test");

        tasks.showQueue();

        tasks.processQueue();
        tasks.processQueue();
        tasks.processQueue();

        System.out.println();

        tasks.showQueue();

        //Задача 3:
        //Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

        LinkedListHW strings = new LinkedListHW();
        strings.addString("Hello");
        strings.addString("My");
        strings.addString("Name");

        strings.printFirstAndLastElement();
    }
}

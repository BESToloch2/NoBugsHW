package javaCollectionsHW;

import java.util.TreeMap;

public class TreeMapHW {
    //Задача 3:
    //Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.

    private TreeMap<Integer, String> employees;

    private int nextId;

    public TreeMapHW(){
        this.employees = new TreeMap<>();
        nextId = 1;
    }

    public void addEmployee(String name) {
        employees.put(nextId, name);
        nextId++;
    }

    public void findNextHigherId(int number){
        System.out.println(employees.higherKey(number));
    }


    public static void main(String[] args) {
        TreeMapHW employees = new TreeMapHW();
        employees.addEmployee("Sasha");
        employees.addEmployee("Dasha");
        employees.addEmployee("Masha");
        employees.addEmployee("Misha");
        employees.addEmployee("Grisha");

        employees.findNextHigherId(4);
    }

}
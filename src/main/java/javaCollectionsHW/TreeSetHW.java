package javaCollectionsHW;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetHW {
    //Задача 3:
    //Найдите ближайшее большее и меньшее число к заданному в TreeSet.


    public static void main(String[] args) {
        TreeSet <Integer> tree = new TreeSet<>();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            tree.add(r.nextInt(21));
        }

        System.out.println(tree);

        System.out.println(tree.lower(10));
        System.out.println(tree.higher(10));
    }
}

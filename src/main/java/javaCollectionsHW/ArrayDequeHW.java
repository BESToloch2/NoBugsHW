package javaCollectionsHW;
import java.util.ArrayDeque;

public class ArrayDequeHW {
    //Задача 2:
    //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
    private ArrayDeque<String> elements;
    public ArrayDequeHW() {
        this.elements = new ArrayDeque<>();
    }
    public void addElement(String element) {
        elements.addLast(element);
    }
    public void retrieveElement() {
        while (!elements.isEmpty()) {
            System.out.println("Processing :" + elements.getLast());
            elements.pollLast();
        }
    }
    public void printAllElements() {
        if (elements.isEmpty()) {
            System.out.println("All elements processed");}

            for (String e : elements){
                System.out.println(e);
            }
    }
        public static void main (String[]args){
            ArrayDequeHW elements = new ArrayDequeHW();
            elements.addElement("sdsad1");
            elements.addElement("sdsad2");
            elements.addElement("sdsad3");
            elements.addElement("sdsad4");
            elements.addElement("sdsad5");

            elements.printAllElements();

            System.out.println();

            elements.retrieveElement();

            elements.printAllElements();
        }
}

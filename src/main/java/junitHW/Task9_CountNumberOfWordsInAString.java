package junitHW;

public class Task9_CountNumberOfWordsInAString {
    //how it counts without any dividing chars
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
package oOP;

public class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void printInfo (){
        System.out.println("The book title is : " + this.title + " and the author is : " + this.author);
    }

    public static void main(String[] args) {
        Book b = new Book(" How To Rise People", "Goomom");

        b.setAuthor("Marthon");
        b.printInfo();
    }
}

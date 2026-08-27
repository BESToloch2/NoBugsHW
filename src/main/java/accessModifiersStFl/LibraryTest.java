package accessModifiersStFl;

public class LibraryTest {
    public static void main(String[] args) {

        Library b1 = new Library();

        // b1.bookTitle = "AAAAAAA";
        b1.author = "bbbbbbbb";
        b1.year = 1111;
        b1.category = "cccccc";

        System.out.println("Book title: " + b1.getBookTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());
        System.out.println("Category: " + b1.getCategory());

        b1.setBookTitle("1984");
        b1.setAuthor("George Orwell");
        b1.setYear(1949);
        b1.setCategory("Novel");

        System.out.println();

        System.out.println("Book title: " + b1.getBookTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());
        System.out.println("Category: " + b1.getCategory());



    }


}

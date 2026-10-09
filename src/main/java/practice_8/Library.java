package practice_8;

import practice_8.exceptions.BookNotFoundException;
import practice_8.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library (){
        books = new ArrayList<>();
    }

    //method add a book to library. If library already has a book - throw an exception;
    public void addBook(Book book){
        if (books.contains(book)){
            throw new InvalidBookException("Book already existed");
        }else {
            books.add(book);
        }
    }

    //method find a book. Method required to be processed with exception by programmer
    public Book findBook(String name) throws BookNotFoundException {

        for (Book book : books){
            if (book.getName().equalsIgnoreCase(name)){
                return book;
            }
        }
            throw new BookNotFoundException("No such book in library");
    }


    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("1994", "Оруелл"));
        library.addBook(new Book("Мартин Иден", "Лондон"));
        library.addBook(new Book("Онегин", "Пушкин"));
        //library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("Онин");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
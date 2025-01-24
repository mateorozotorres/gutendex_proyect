package com.example.gutendex;

import com.model.Book;
import com.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GutendexApplication {

    public static void main(String[] args) {
        // Crear un nuevo libro
        Book book = new Book("1984", "George Orwell", "English", "Dystopian");

        // Crear un servicio de libros y guardar el libro en la base de datos
        BookService bookService = new BookService();
        bookService.saveBook(book);
    }
}

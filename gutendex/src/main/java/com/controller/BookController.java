package com.controller;

import com.model.Book;
import com.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Endpoint para insertar un libro (POST)
    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    // Endpoint para listar los libros (GET)
    @GetMapping
    public List<Book> getBooks() {
        return bookService.listBooks();
    }
}

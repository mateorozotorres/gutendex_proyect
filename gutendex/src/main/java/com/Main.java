package com;

import com.model.Book;
import com.service.BookService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        while (true) {
            System.out.println("1. Buscar libros en la base de datos");
            System.out.println("2. Guardar un libro en la base de datos");
            System.out.println("3. Mostrar libros guardados");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1 -> {
                    System.out.print("Introduce un término de búsqueda: ");
                    String query = scanner.nextLine();
                    List<Book> books = bookService.searchBooks(query);
                    books.forEach(System.out::println);
                }
                case 2 -> {
                    System.out.print("Título del libro: ");
                    String title = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String author = scanner.nextLine();
                    System.out.print("Género del libro: ");
                    String genre = scanner.nextLine();
                    System.out.print("Editorial del libro: ");
                    String publisher = scanner.nextLine();

                    Book book = new Book(title, author, genre, publisher);
                    bookService.saveBook(book);
                    System.out.println("¡Libro guardado!");
                }
                case 3 -> {
                    List<Book> books = bookService.listBooks();
                    books.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }
}

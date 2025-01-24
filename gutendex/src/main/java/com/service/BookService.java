package com.service;

import com.model.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    // Método para guardar un libro en la base de datos
    public void saveBook(Book book) {
        String sql = "INSERT INTO books (title, author, genre, publisher) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseHelper.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setString(3, book.getGenre());
            statement.setString(4, book.getPublisher());
            statement.executeUpdate();

            System.out.println("Libro guardado en base de datos: " + book.getTitle());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para listar todos los libros en la base de datos
    public List<Book> listBooks() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try (Connection connection = DatabaseHelper.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String publisher = resultSet.getString("publisher");

                books.add(new Book(title, author, genre, publisher));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    // Método para buscar libros por un término
    public List<Book> searchBooks(String query) {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR genre LIKE ? OR publisher LIKE ?";
        try (Connection connection = DatabaseHelper.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            String searchQuery = "%" + query + "%"; // Para hacer búsqueda parcial
            statement.setString(1, searchQuery);
            statement.setString(2, searchQuery);
            statement.setString(3, searchQuery);
            statement.setString(4, searchQuery);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String publisher = resultSet.getString("publisher");

                books.add(new Book(title, author, genre, publisher));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}

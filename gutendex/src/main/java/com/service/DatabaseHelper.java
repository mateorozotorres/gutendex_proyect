package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    // Cambia los valores según tu configuración de base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/liter_alura";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        try {
            // Registra el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el controlador JDBC", e);
        }
    }
}

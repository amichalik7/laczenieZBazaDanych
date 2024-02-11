package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "admin";

        Connection conn = null;
        System.out.println(conn);
        try {
            conn = DriverManager.getConnection(dbURL, username, password);


            if (conn != null) {
                System.out.println("Connected");
            }
            /// dodawanie
//            String sql = "INSERT INTO users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, "Ania");
//            statement.setString(2, "223df3");
//            statement.setString(3, "Ania Kowalska");
//            statement.setString(4, "ania@microsoft.comm");
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0){
//                System.out.println("new user inserted");
//            }

            // odczytywanie
//            String sql = "SELECT * FROM users";
//            Statement statement = conn.createStatement();
//            ResultSet result = statement.executeQuery(sql);
//            int count = 0;
//            while (result.next()) {
//                String name = result.getString(2);
//                String pass = result.getString(3);
//                String fullname = result.getString("fullname");
//                String email = result.getString("email");
//                String output = "User #%d: %s - %s - %s - %s";
//                System.out.println(String.format(output, ++count, name, pass, fullname, email));
//            }
            // update
//            String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1,"123422");
//            statement.setString(2, "Kowalski Jan");
//            statement.setString(3, "janko@microsoft.com");
//            statement.setString(4,"Jan");
//            int rowsUpdated = statement.executeUpdate();
//            if (rowsUpdated > 0 ){
//                System.out.println("user updated");
//            }

            // usuwanie
            String sql = "DELETE FROM users WHERE username=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "bill");
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0){
                System.out.println("deleted");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}
package com.jdbctask;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTask {
    private static void insertEmployees(Connection con, String[] insertParameters) throws SQLException {
        String insertQuery = "INSERT INTO Employee "
                + "(Id, F_Name, L_Name, Sex, Age, Address, Phone_Number, Vacation_Balance)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement stmt = con.prepareStatement(insertQuery);

        stmt.setInt(1, Integer.parseInt(insertParameters[0]));
        stmt.setString(2, insertParameters[1]);
        stmt.setString(3, insertParameters[2]);
        stmt.setString(4, insertParameters[3]);
        stmt.setInt(5, Integer.parseInt(insertParameters[4]));
        stmt.setString(6, insertParameters[5]);
        stmt.setString(7, insertParameters[6]);
        stmt.setInt(8, Integer.parseInt(insertParameters[7]));

        if (!stmt.execute())
            System.out.println("INSERTED (" + String.join(", ", insertParameters) + ")");
    }

    public static void insertTask(Connection con) throws SQLException {
        String[][] insertParametersArray = {
                { "1", "John", "Doe", "Male", "29", "123 Maple St, Springfield", "123-456-7890", "30" },
                { "2", "Jane", "Smith", "Female", "34", "456 Oak St, Metropolis", "987-654-3210", "30" },
                { "3", "Alice", "Johnson", "Female", "27", "789 Pine St, Gotham", "555-123-4567", "20" },
                { "4", "Bob", "Brown", "Male", "45", "101 Elm St, Star City", "555-987-6543", "15" },
                { "5", "Charlie", "Davis", "Male", "32", "202 Cedar St, Central City", "555-555-5555", "30" },
                { "6", "Oldman", "Wong", "Male", "55", "123 Elm St, Star City", "555-123-0000", "25" },
                { "7", "Elder", "Lee", "Female", "65", "456 Pine St, Metropolis", "555-456-1111", "40" } };

        for (String[] insertParameters : insertParametersArray)
            insertEmployees(con, insertParameters);
    }

    public static void updateTask(Connection con) {
        try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM Employee;")) {
            stmt.addBatch("UPDATE Employee SET Vacation_Balance=45 WHERE Age > 45;");
            stmt.addBatch("UPDATE Employee SET F_Name=CONCAT('Mr.', F_Name) WHERE Age > 45 AND Sex = 'Male';");
            stmt.addBatch("UPDATE Employee SET F_Name=CONCAT('Mrs.', F_Name) WHERE Age > 45 AND Sex = 'Female';");

            stmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String user = System.getenv("MYSQL_USER");
        String password = System.getenv("MYSQL_PASSWORD");
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctask", user, password)) {
            insertTask(con);
            updateTask(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connn {

    Connection connection;
    Statement statement;

    public Connn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "root",
                    "admin"
            );

            statement = connection.createStatement();

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
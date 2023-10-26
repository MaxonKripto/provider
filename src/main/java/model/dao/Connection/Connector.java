package model.dao.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/provider";
        String user = "maksim";
        String password = "9112";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM users_t";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                System.out.println(statement.getS);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package homework24.service;

import homework24.Database;
import homework24.entity.Client;
import homework24.entity.Status;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private String QUERY_GET_ALL = "SELECT * FROM statuses";

    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);

            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }
}

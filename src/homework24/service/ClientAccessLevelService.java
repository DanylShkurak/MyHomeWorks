package homework24.service;

import homework24.Database;
import homework24.entity.ClientAccessLevel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientAccessLevelService {
    private String QUERY_BY_AGE = "SELECT c.name,c.email ,s.alias FROM clients c\n" +
            "INNER JOIN client_status cs ON c.id = cs.client_id\n" +
            "INNER JOIN statuses s on cs.status_id = s.id\n" +
            "WHERE c.age > ?";

    public List<ClientAccessLevel> getByAge(int age) {

        List<ClientAccessLevel> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_BY_AGE)) {
            preparedStatement.setInt(1, age);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                ClientAccessLevel client = new ClientAccessLevel();
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAlias(resultSet.getString("alias"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}

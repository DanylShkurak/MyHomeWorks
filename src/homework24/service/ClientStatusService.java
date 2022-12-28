package homework24.service;

import homework24.Database;
import homework24.entity.Client;
import homework24.entity.ClientStatus;
import homework24.entity.Status;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientStatusService {
    private String QUERY_GET_ALL = "SELECT * FROM client_status";

    public List<ClientStatus> getAll() {
        List<ClientStatus> clientStatuses = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);

            while (resultSet.next()) {
                connection.setAutoCommit(false);
                ClientStatus clientStatus = new ClientStatus();
                clientStatus.setClientId(resultSet.getInt("client_id"));
                clientStatus.setStatusId(resultSet.getInt("status_id"));
                clientStatuses.add(clientStatus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientStatuses;
    }
}

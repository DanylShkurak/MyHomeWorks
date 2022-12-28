package homework24.service;


import homework24.Database;
import homework24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private String QUERY_SAVE = "INSERT INTO clients (name,email,phone,about,age) VALUES (?,?,?,?,?)";
    private String QUERY_DELETE_BY_ID = "DELETE FROM clients WHERE id = ?";
    private String QUERY_UPDATE_AGE_BY_ID = "UPDATE clients SET age = ? WHERE id = ?";
    private String QUERY_GET_ALL = "SELECT * FROM clients";
    private String QUERY_GET_BY_PHONE = "SELECT * FROM clients WHERE phone = ?";
    private String QUERY_GET_BY_ID = "SELECT * FROM clients WHERE id = ?";





    public List<Client> getByPhone(int phone) {

        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_BY_PHONE)) {
            preparedStatement.setInt(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);

            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void save(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setInt(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5, client.getAge());

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteById(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE_BY_ID)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateAgeById(int id, int age) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE_AGE_BY_ID)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, age);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Client> getById(int id) {

        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

}


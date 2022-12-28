package homework24.service;

import homework24.Database;
import homework24.entity.Account;
import homework24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private String QUERY_GET_ALL = "SELECT * FROM accounts";
    private String QUERY_GET_BY_VALUE = "SELECT * FROM accounts WHERE value > ?";


    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(QUERY_GET_ALL);

            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClientID(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public List<Account> getByValue(double value) {

        List<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_BY_VALUE)) {
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClientID(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}

package homework24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "gte1282t";

    public static Connection getConnection(){
        Connection connection = null ;
        try {
            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
}

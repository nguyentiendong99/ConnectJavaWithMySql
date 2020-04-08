package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mconnection {
    private final String DBNAM = "student";
    private final String USER= "root";
    private final String PASS = "dongnguyen19069999";
    private final String MURL = "jdbc:mysql://localhost:3306;";
    private static Mconnection instance = new Mconnection();
    private Mconnection(){

    }
    public static Mconnection getInstance(){
        return instance;
    }
    public Connection getConnection(){
        Connection connection = null;
        var url = MURL + "databasename = " + DBNAM + ";user = " + USER+
                ";password = " +PASS + ";";
        try {
            connection= DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

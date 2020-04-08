package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private final String DBNAM = "student";
    private final String USER = "root";
    private final String PASS = "dongnguyen19069999";
    private static DBconnection instance = new DBconnection();
    private DBconnection(){

    }
    public static DBconnection getInstance(){
        return instance;
    }
    public Connection getConnection(){
        var url ="jdbc:mysql://localhost:3306;databasename=" + DBNAM +
                ";user=" + USER +";password=" + PASS;
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(url);
            Class.forName("jdbc.mysql.jdbc.Driver");

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return conn;
    }
}

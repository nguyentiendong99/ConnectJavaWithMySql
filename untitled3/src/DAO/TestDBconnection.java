package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBconnection {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/student";// your db name
                String user="root"; // your db username
                String password="dongnguyen19069999"; // your db password
                Connection conn = DriverManager.getConnection(url, user, password);
                if(conn != null){
                    System.out.println("Connect success!");
                }

                var sql = "select * from major";
                var statement = conn.prepareStatement(sql);
                var resultSet = statement.executeQuery();
                showResutl(resultSet);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        private static void showResutl(ResultSet resultSet) throws SQLException {
            System.out.printf("%-10s%-20s%-20s%-30s\n", "ID", "name", "address");
            while (resultSet.next()){
                var id = resultSet.getInt("id");
                var name = resultSet.getString("name");
                var address = resultSet.getString("address");

                System.out.printf("%-10d%-20s%-20s%-30s\n", id, name,address);
            }
        }
    }

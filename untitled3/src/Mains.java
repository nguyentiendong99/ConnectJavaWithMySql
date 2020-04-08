import DAO.BookDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap tai lieu can xoa : ");
        var code = scanner.nextLine();
        var book = new BookDAO();
        var result = book.remove(code);
        if (result){
            System.out.println("xoa thanh cong");
        }
        else {
            System.out.println("xoa that bai .. ");
        }
    }
}

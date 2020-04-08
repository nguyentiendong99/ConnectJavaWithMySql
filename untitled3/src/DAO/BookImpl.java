package DAO;

import java.sql.SQLException;
import java.util.Scanner;

public class BookImpl extends Book {
    @Override
    public model.Book addfromkeyboard() throws SQLException, ClassNotFoundException {
        model.Book book = super.addfromkeyboard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban chon ma sach : ");
        String code = scanner.nextLine();
        var bookdao = new BookDAO();
        var isvalid = bookdao.isdocumentIsValid(code,"bookimp");
        while (! isvalid){
            System.out.println("da ton tai moi ban nhap lai ...");
            System.out.println("Moi ban nhap ma sach : ");
            code= scanner.nextLine();
            isvalid=bookdao.isdocumentIsValid(code,"bookimp");
        }
        System.out.println("Moi ban nhap kieu sach : ");
        String typebook = scanner.nextLine();
        model.BookImpl books = new model.BookImpl(book.getCodebook(),book.getName()
        ,book.getAuthority(),book.getQuantity(),code,typebook);
        return books;
    }
}

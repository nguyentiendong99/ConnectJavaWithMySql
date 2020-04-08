package DAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Book implements DAOCtrl<model.Book> {

    @Override
    public model.Book addfromkeyboard() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap code book : ");
        String codebook = scanner.nextLine();
        var documentimp = new DocumentDAO();
        var isvalid = documentimp.isdocumentIsValid(codebook,"book");
        while(! isvalid){
            System.out.println("da ton tai moi ban nhap ten khac ... ");
            System.out.println("moi ban nhap code book : ");
            codebook= scanner.nextLine();
            isvalid = documentimp.isdocumentIsValid(codebook,"book");
        }
        System.out.println("Moi ban nhap ten sach : ");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap ten tac gia : ");
        String authority = scanner.nextLine();
        System.out.println("So luong sach : ");
        int quantity = scanner.nextInt();
        model.Book book = new model.Book(codebook,name,authority,quantity);

        return book;
    }
}

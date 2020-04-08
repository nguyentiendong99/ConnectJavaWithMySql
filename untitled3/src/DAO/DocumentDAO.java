package DAO;

import model.Book;

import java.sql.SQLException;
import java.util.Scanner;

public class DocumentDAO implements DAO<Book> {
    public boolean isdocumentIsValid(String codebook , String tablename) throws SQLException, ClassNotFoundException {
        var sql =   "select codebook from " + tablename + " where codebook = ? ";
        var conn = Util.getMySQLConnection();
        var prepare  = conn.prepareStatement(sql);
        prepare.setString(1,codebook);
        var result = prepare.executeQuery();
        if (result.next()){
            return false;
        }
        return true;
    }
    @Override
    public void add(Book book) throws SQLException, ClassNotFoundException {
    var conn = Util.getMySQLConnection();
    var sql = " insert into book values(?,?,?,?)";
    var prepare = conn.prepareStatement(sql);
    prepare.setString(1,book.getCodebook());
    prepare.setString(2,book.getName());
    prepare.setString(3,book.getAuthority());
    prepare.setInt(4,book.getQuantity());
    prepare.executeUpdate();
    }

    @Override
    public boolean edit(Book book) {
        return false;
    }

    @Override
    public boolean remove(String codebook) throws SQLException, ClassNotFoundException {
        var sql = "delete from book where codebook = ? ";
        var conn = Util.getMySQLConnection();
        try{
            var prepare = conn.prepareStatement(sql);
            prepare.setString(1,codebook);
            var result = prepare.executeUpdate();
            if (result > 0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }
}

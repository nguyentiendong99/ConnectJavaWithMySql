package DAO;

import model.Book;
import model.BookImpl;

import java.sql.SQLException;

public class BookDAO extends DocumentDAO {
    public boolean isdocumentIsValid(String code , String tablename) throws SQLException, ClassNotFoundException {
        var sql =   "select code from " + tablename + " where code = ? ";
        var conn = Util.getMySQLConnection();
        var prepare  = conn.prepareStatement(sql);
        prepare.setString(1,code);
        var result = prepare.executeQuery();
        if (result.next()){
            return false;
        }
        return true;
    }
    @Override
    public void add(Book book) throws SQLException, ClassNotFoundException {
        super.add(book);
        var conn = Util.getMySQLConnection();
        var sql = " insert into bookimp values(?,?)";
        var bookimp = (BookImpl)book;
        var prepare= conn.prepareStatement(sql);
        prepare.setString(1,bookimp.getCode());
        prepare.setString(2,bookimp.getTypebook());
        prepare.executeUpdate();
    }

    @Override
    public boolean edit(Book book) {
        return super.edit(book);
    }

    @Override
    public boolean remove(String codebook) throws SQLException, ClassNotFoundException {
        return super.remove(codebook);
    }
}

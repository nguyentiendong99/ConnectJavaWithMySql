package DAO;

import java.sql.SQLException;

public interface DAOCtrl<T> {
    T addfromkeyboard() throws SQLException, ClassNotFoundException;
}

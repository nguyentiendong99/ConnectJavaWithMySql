package DAO;

import java.sql.SQLException;

public interface DAO<T> {
    void add(T t) throws SQLException, ClassNotFoundException;
    boolean edit(T t);
    boolean remove(String codebook) throws SQLException, ClassNotFoundException;
}

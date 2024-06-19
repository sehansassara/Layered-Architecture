package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    public boolean update(T customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean exist(String id) throws SQLException, ClassNotFoundException ;

    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException ;

    public boolean save(T customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException ;

    public String generateId() throws SQLException, ClassNotFoundException ;

    public T search(String newValue) throws SQLException, ClassNotFoundException ;

}

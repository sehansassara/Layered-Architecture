package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
    /*public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;

    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String generateId() throws SQLException, ClassNotFoundException ;

    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

    public ArrayList<CustomerDTO> loadCustomerId() throws SQLException, ClassNotFoundException ;*/
}

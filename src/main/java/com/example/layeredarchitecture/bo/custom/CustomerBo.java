package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;


    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String generateIdCustomer() throws SQLException, ClassNotFoundException ;


    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

}

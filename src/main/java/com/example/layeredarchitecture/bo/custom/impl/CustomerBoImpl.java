package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.CustomerBo;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements CustomerBo {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return customerDAO.update(customerDTO);

    }

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
       return customerDAO.exist(id);
    }


    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
       return customerDAO.save(customerDTO);
    }

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }

    public String generateIdCustomer() throws SQLException, ClassNotFoundException {
       return customerDAO.generateId();
    }


    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException {
        return customerDAO.search(newValue);
    }
}

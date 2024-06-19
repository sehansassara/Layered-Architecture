package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.OrderBo;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBoImpl implements OrderBo {
    OrderDAO orderDAO = new OrderDAOImpl();
    public String generateIdOrder() throws SQLException, ClassNotFoundException {
        return orderDAO.generateId();
    }

    public OrderDTO search(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean update(OrderDTO customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
       return orderDAO.exist(orderId);

    }

    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
       return orderDAO.save(orderDTO);
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }
}

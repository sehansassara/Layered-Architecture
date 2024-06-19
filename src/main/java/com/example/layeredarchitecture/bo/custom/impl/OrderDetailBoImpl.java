package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.OrderDetailBo;
import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.OrderDetailDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailBoImpl implements OrderDetailBo {
    OrderDetailDAO orderDetailDAO = new OrderDetailDAOImpl();
    public boolean saveOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailDAO.save(dto);
     }

    public boolean update(OrderDetailDTO customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public String generateId() throws SQLException, ClassNotFoundException {
        return null;
    }

    public OrderDetailDTO search(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }
}

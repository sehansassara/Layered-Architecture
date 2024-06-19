package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBo {
    public String generateIdOrder() throws SQLException, ClassNotFoundException ;

    public OrderDTO search(String newValue) throws SQLException, ClassNotFoundException ;

    public boolean update(OrderDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException ;
}

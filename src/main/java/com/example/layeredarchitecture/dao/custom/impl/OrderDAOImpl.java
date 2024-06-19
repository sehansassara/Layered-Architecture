package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {

    public String generateId() throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();*/
        ResultSet rst = SqlUtill.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        if (rst.next()){
            String id = rst.getString("oid");
            return id;
        }
        return null;
    }

    @Override
    public OrderDTO search(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean update(OrderDTO customerDTO) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean exist(String orderId) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);

        return stm.executeQuery().next();*/

        ResultSet resultSet = SqlUtill.execute("SELECT oid FROM `Orders` WHERE oid=?",orderId);
        return resultSet.next();

    }

    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean save(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, orderDTO.getOrderId());
        stm.setDate(2, Date.valueOf(orderDTO.getOrderDate()));
        stm.setString(3, orderDTO.getCustomerId());

        return stm.executeUpdate()>0;*/

        return  SqlUtill.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",orderDTO.getOrderId(),orderDTO.getOrderDate(),orderDTO.getCustomerId());
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }
}

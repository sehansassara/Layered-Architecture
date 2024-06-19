package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.dao.custom.OrderDetailDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailBo {
    public boolean saveOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean update(OrderDetailDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean exist(String id) throws SQLException, ClassNotFoundException ;

    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException ;

    public String generateId() throws SQLException, ClassNotFoundException ;

    public OrderDetailDTO search(String newValue) throws SQLException, ClassNotFoundException ;
}

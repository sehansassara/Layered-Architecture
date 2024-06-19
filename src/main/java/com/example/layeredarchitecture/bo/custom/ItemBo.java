package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;

    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException ;


    public String generateIdItem() throws SQLException, ClassNotFoundException ;

    public ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException ;


    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;
}

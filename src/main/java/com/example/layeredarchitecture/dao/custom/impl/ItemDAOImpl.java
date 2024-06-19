package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SqlUtill;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();*/
        ResultSet rst = SqlUtill.execute("SELECT * FROM Item");

        ArrayList<ItemDTO> allItems =  new ArrayList<>();
        while (rst.next()) {
         ItemDTO itemDTO = new ItemDTO(
                 rst.getString("code"),
                 rst.getString("description"),
                 rst.getBigDecimal("unitPrice"),
                 rst.getInt("qtyOnHand"));

         allItems.add(itemDTO);
        }
       return allItems;
    }

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("DELETE FROM Item WHERE code=?");
        pstm.setString(1, code);
        return pstm.executeUpdate()>0;*/

        return SqlUtill.execute("DELETE FROM Item WHERE code=?",code);
    }

    public boolean save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)");
        pstm.setString(1, itemDTO.getCode());
        pstm.setString(2, itemDTO.getDescription());
        pstm.setBigDecimal(4, itemDTO.getUnitPrice());
        pstm.setInt(3, itemDTO.getQtyOnHand());
        return pstm.executeUpdate()>0;*/

        return SqlUtill.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",itemDTO.getCode(),itemDTO.getDescription(),itemDTO.getUnitPrice(),itemDTO.getQtyOnHand());
    }

    public boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");
        pstm.setString(4, itemDTO.getCode());
        pstm.setString(1, itemDTO.getDescription());
        pstm.setBigDecimal(2, itemDTO.getUnitPrice());
        pstm.setInt(3, itemDTO.getQtyOnHand());

        return pstm.executeUpdate()>0;*/

        return SqlUtill.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",itemDTO.getDescription(),itemDTO.getUnitPrice(),itemDTO.getQtyOnHand(),itemDTO.getCode());
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT code FROM Item WHERE code=?");
        pstm.setString(1, code);
        return pstm.executeQuery().next();*/

        ResultSet resultSet = SqlUtill.execute("SELECT code FROM Item WHERE code=?",code);
        return resultSet.next();
    }


    public String generateId() throws SQLException, ClassNotFoundException {
        //
        ResultSet rst = SqlUtill.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");

        if (rst.next()){
            String id = rst.getString("code");
            return id;
        }
        return null;
    }

    public ItemDTO search(String newItemCode) throws SQLException, ClassNotFoundException {
        //Connection connection = DBConnection.getDbConnection().getConnection();
                    ResultSet rst = SqlUtill.execute("SELECT * FROM Item WHERE code=?",newItemCode);
                    /*pstm.setString(1, newItemCode + "");
                    ResultSet rst = pstm.executeQuery();*/

                   while (rst.next()){
                       String description = rst.getString("description");
                       BigDecimal unitPrice = rst.getBigDecimal("unitPrice");
                       int qtyOnHand = rst.getInt("qtyOnHand");

                       ItemDTO itemDTO =new ItemDTO(newItemCode+"", description,unitPrice,qtyOnHand);
                       return itemDTO;
                   }
                   return null;
    }


    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException {
       // Connection connection = DBConnection.getDbConnection().getConnection();
        ResultSet rst = SqlUtill.execute("SELECT * FROM Item WHERE code=?",code);
       /* pstm.setString(1, code);
        ResultSet rst = pstm.executeQuery();*/


        if (rst.next()){
            String id = rst.getString(1);
            String description=rst.getString(2);
            int qtyOnHand = rst.getInt(3);
            BigDecimal unitPrice=rst.getBigDecimal(4);

            ItemDTO itemDTO = new ItemDTO(id,description,unitPrice,qtyOnHand);
            return itemDTO;
        }
        return null;
    }

   /* public int updateItemPl(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");
            pstm.setString(1, itemDTO.getDescription());
            pstm.setBigDecimal(2, itemDTO.getUnitPrice());
            pstm.setInt(3, itemDTO.getQtyOnHand());
            pstm.setString(4, itemDTO.getCode());

            return pstm.executeUpdate();
    }*/
}

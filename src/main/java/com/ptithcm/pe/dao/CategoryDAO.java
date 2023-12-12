/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tezca
 */
public class CategoryDAO implements DAO<Category> {

    public static CategoryDAO getInstance() {
        return new CategoryDAO();
    }

    @Override
    public int insert(Category t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO dbo.Category(CategoryName, CategoryType, UserId) VALUES(?, ? , ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setString(1, t.getCategoryName());
                ps.setBoolean(2, t.isCategoryType());
                ps.setInt(3, t.getUserId());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println(result + " line has been changed.");
                //Bước 5: commit
                con.commit();
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int update(Category t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [Category] SET CategoryName = ? WHERE CategoryId = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(2, t.getCategoryId());
                ps.setString(1, t.getCategoryName());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println(result + " line has been changed.");
                //Bước 5: commit
                con.commit();

            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int delete(Category t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "DELETE FROM dbo.Category WHERE CategoryId = ?";

                PreparedStatement preparedStatement = con.prepareStatement(sql);
                con.setAutoCommit(false);

                preparedStatement.setInt(1, t.getCategoryId());
                //Bước 3: Thực thi câu lệnh SQL
                result = preparedStatement.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println(result + " line has been changed.");
                //Bước 5: commit
                con.commit();

            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<Category> selectAll() {

        ArrayList<Category> result = new ArrayList<Category>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            String sql = "SELECT * FROM dbo.Category WHERE UserId = " + userId + "";
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int CategoryId = rs.getInt("CategoryId");
                String name = rs.getString("CategoryName");
                boolean type = rs.getBoolean("CategoryType");
                Category cate = new Category(CategoryId, name, type, userId);
                result.add(cate);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Category selectByName(String name) {
        Category cate = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM dbo.Category WHERE CategoryName = ? AND UserId = ?";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, userId);
            //Bước 3: Thực thi câu lệnh SQL
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int CategoryId = rs.getInt("CategoryId");
                String cateName = rs.getString("CategoryName");
                boolean type = rs.getBoolean("CategoryType");
                cate = new Category(CategoryId, cateName, type, userId);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cate;
    }

    public ArrayList<Category> selectbyType(boolean type) {
        ArrayList<Category> listCategory = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM dbo.Category WHERE CategoryType = ? AND UserId = ?";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setBoolean(1, type);
            preparedStatement.setInt(2, userId);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int CategoryId = rs.getInt("CategoryId");
                String cateName = rs.getString("CategoryName");
                Category cate = new Category(CategoryId, cateName, type, userId);
                listCategory.add(cate);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCategory;
    }
    
    

    public ArrayList<Category> searchByName(boolean type, String text) {
        ArrayList<Category> listCategory = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM dbo.Category WHERE CategoryType = ? AND UserId = ? AND CategoryName LIKE ?";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setBoolean(1, type);
            preparedStatement.setInt(2, userId);
            preparedStatement.setString(3, text);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int CategoryId = rs.getInt("CategoryId");
                String nameGr = rs.getString("CategoryName");
                Category group = new Category(CategoryId, nameGr, type, userId);
                listCategory.add(group);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCategory;

    }

    @Override
    public Category selectById(int id) {
        Category category = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM dbo.Category WHERE CategoryId = ?";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            //Bước 3: Thực thi câu lệnh SQL
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int CategoryId = rs.getInt("CategoryId");
                String cateName = rs.getString("CategoryName");
                boolean type = rs.getBoolean("CategoryType");
                category = new Category(CategoryId, cateName, type, userId);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }
}

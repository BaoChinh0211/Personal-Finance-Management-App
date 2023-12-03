/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.Group;
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
public class GroupDAO implements DAO<Group> {

    public static GroupDAO getInstance() {
        return new GroupDAO();
    }

    @Override
    public int insert(Group t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO [Group]([Name], [Type], UserId) VALUES(?, ? , ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setString(1, t.getGroupName());
                ps.setBoolean(2, t.getType());
                ps.setInt(3, t.getUserId());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println("Có " + result + " dòng bị thay đổi!");
                //Bước 5: commit
                con.commit();
                
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int update(Group t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [Group] SET [Name] = ? WHERE [GroupId] = ?";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(2, t.getGroupId());
                ps.setString(1, t.getGroupName());
                //Bước 3: Thực thi câu lệnh SQL
                result = ps.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println("Có " + result + " dòng bị thay đổi!");
                //Bước 5: commit
                con.commit();
                
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int delete(Group t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "DELETE FROM [Group] WHERE [GroupId] = ?";

                PreparedStatement preparedStatement = con.prepareStatement(sql);
                con.setAutoCommit(false);
                
            preparedStatement.setInt(1, t.getGroupId());
                //Bước 3: Thực thi câu lệnh SQL
                result = preparedStatement.executeUpdate();
                //Bước 4: Làm việc với kết quả thu được
                System.out.println("Có " + result + " dòng bị thay đổi!");
                //Bước 5: commit
                con.commit();
                
            } catch (Exception e) {
                con.rollback();
            } finally {
                con.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<Group> selectAll() {
        ArrayList<Group> result = new ArrayList<Group>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            String sql = "SELECT * FROM [Group]";
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int GroupId = rs.getInt("GroupId");
                String name = rs.getString("Name");
                boolean type = rs.getBoolean("Type");
                int userId = rs.getInt("UserId");
                Group gr = new Group(GroupId, name, type, userId);
                result.add(gr);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Group selectByName(String name) {
        Group group = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [Group] WHERE [Name] = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int GroupId = rs.getInt("GroupId");
                String nameGr = rs.getString("Name");
                boolean type = rs.getBoolean("Type");
                int userId = rs.getInt("UserId");
                group = new Group(GroupId, nameGr, type, userId);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return group;
    }

    public ArrayList<Group> selectbyType(boolean type, int userId) {
        ArrayList<Group> listGroup = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [Group] WHERE [Type] = ? AND userId = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setBoolean(1, type);
            preparedStatement.setInt(2, userId);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int GroupId = rs.getInt("GroupId");
                String nameGr = rs.getString("Name");
                Group group = new Group(GroupId, nameGr, type, userId);
                listGroup.add(group);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listGroup;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.User;

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
public class UserDAO implements DAO<User> {

    public static UserDAO getInstance() {
        return new UserDAO();
    }

    @Override
    public int insert(User t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO [User](FullName, Username, [Password], Email) VALUES(?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setString(1, t.getName());
                ps.setString(2, t.getUserName());
                ps.setString(3, t.getPassword());
                ps.setString(4, t.getEmail());
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
    public int update(User t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [User] SET FullName = ?, Username = ?, Password = ?,  Email = ? WHERE UserId = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(5, t.getId());
                ps.setString(1, t.getName());
                ps.setString(2, t.getUserName());
                ps.setString(3, t.getPassword());
                ps.setString(4, t.getEmail());
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
    public int delete(User t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "DELETE FROM [User] WHERE UserId = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(1, t.getId());
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
    public ArrayList<User> selectAll() {
        ArrayList<User> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            String sql = "SELECT * FROM [User]";
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String name = rs.getString("Fullname");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");

                User user = new User(userId, name, username, password, email);
                result.add(user);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public User selectByName(String fullName) {
        User user = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [User] WHERE [FullName] = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fullName);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = ps.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                user = new User(userId, fullName, username, password, email);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public User selectByUsername(String username) {
        User user = null;
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT * FROM [User] WHERE [Username] = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            //Bước 3: Thực thi câu lệnh SQL           
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int userId = rs.getInt("UserId");
                String name = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                user = new User(userId, name, username, password, email);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public int login(String username, String password) {

        User user = getInstance().selectByUsername(username);
        if (user == null) {
            return 2;
        }

        if (!user.getPassword().equals(password)) {
            return 1;
        }
        PersonalFinanceManagement.getInstance().setUserId(user.getId());
        return 0;
    }
}

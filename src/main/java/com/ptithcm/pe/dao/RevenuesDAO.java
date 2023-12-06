/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.Revenues;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tezca
 */
public class RevenuesDAO implements DAO<Revenues> {

    public static RevenuesDAO getInstance() {
        return new RevenuesDAO();
    }

    @Override
    public int insert(Revenues t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO Revenues(Amount, [DateTime], Note, GroupId) VALUES (?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(1, t.getAmount());
            ps.setTimestamp(2, t.getDateTime());
            ps.setString(3, t.getNote());
            ps.setInt(4, t.getGroupId());
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
    public int update(Revenues t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [Revenues] SET [Amount] = ?, [DateTime] = ?, Note = ? WHERE [RevenuesId] = ?";

                PreparedStatement pst = con.prepareStatement(sql);
                con.setAutoCommit(false);
                pst.setInt(4, t.getRevenuesId());
            pst.setInt(1, t.getAmount());
            pst.setTimestamp(2, t.getDateTime());
            pst.setString(3, t.getNote());
                //Bước 3: Thực thi câu lệnh SQL
                result = pst.executeUpdate();
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
    public int delete(Revenues t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "DELETE FROM Revenues WHERE RevenuesId = ?";

                PreparedStatement pst = con.prepareStatement(sql);
                con.setAutoCommit(false);
                pst.setInt(4, t.getRevenuesId());
            pst.setInt(1, t.getRevenuesId());
                //Bước 3: Thực thi câu lệnh SQL
                result = pst.executeUpdate();
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
    public ArrayList<Revenues> selectAll() {
        ArrayList<Revenues> result = new ArrayList<Revenues>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            String sql = "SELECT * FROM [Revenues] WHERE [UserId] = "+ userId +"";
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int revenuesId = rs.getInt("RevenuesId");
                int amount = rs.getInt("Amount");
                Timestamp dateTime = rs.getTimestamp("DateTime");
                String note = rs.getString("Note");
                int groupId = rs.getInt("GroupId");
                Revenues revenues = new Revenues(revenuesId, amount, dateTime, note, groupId);
                result.add(revenues);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }


    @Override
    public Revenues selectByName(String name) {
        return null;
    }

    public ArrayList<Revenues> selectByCondition(String sql) {
        ArrayList<Revenues> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            String query = "SELECT * FROM [Revenues] WHERE " + sql + "";
            ResultSet rs = statement.executeQuery(query);
            //Bước 4: Làm việc với kết quả thu được
            int revenuesId = rs.getInt("RevenuesId");
            int amount = rs.getInt("Amount");
            Timestamp dateTime = rs.getTimestamp("DateTime");
            String note = rs.getString("Note");
            int groupId = rs.getInt("GroupId");
            Revenues revenues = new Revenues(revenuesId, amount, dateTime, note, groupId);
            result.add(revenues);
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ArrayList<Revenues> selectByGroupAndUser(boolean typeGroup, int userId) {
        ArrayList<Revenues> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String query = "SELECT * FROM [Revenues] WHERE GroupId IN (SELECT GroupId FROM [Group] WHERE UserId = ? AND [Type] = ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setBoolean(2, typeGroup);
            //Bước 3: Thực thi câu lệnh SQL            
            ResultSet rs = ps.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int revenuesId = rs.getInt("RevenuesId");
                int amount = rs.getInt("Amount");
                Timestamp dateTime = rs.getTimestamp("DateTime");
                String note = rs.getString("Note");
                int groupId = rs.getInt("GroupId");
                Revenues revenues = new Revenues(revenuesId, amount, dateTime, note, groupId);
                result.add(revenues);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(GroupDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}

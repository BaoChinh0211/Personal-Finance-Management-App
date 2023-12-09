/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.dao;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.database.DatabaseHelper;
import com.ptithcm.pe.model.Financial;
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
public class FinancialDAO implements DAO<Financial> {

    public static FinancialDAO getInstance() {
        return new FinancialDAO();
    }

    @Override
    public int insert(Financial t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "INSERT INTO Financial(Amount, [DateTime], Note, CategoryId) VALUES (?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                con.setAutoCommit(false);
                ps.setInt(1, t.getAmount());
                ps.setTimestamp(2, t.getDateTime());
                ps.setString(3, t.getNote());
                ps.setInt(4, t.getCategoryId());
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
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int update(Financial t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "UPDATE [Financial] SET [Amount] = ?, [DateTime] = ?, Note = ? WHERE [FinancialId] = ?";

                PreparedStatement pst = con.prepareStatement(sql);
                con.setAutoCommit(false);
                pst.setInt(4, t.getFinancialId());
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
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int delete(Financial t) {
        int result = 0;
        try ( //Bước 1: Tạo kết nối cơ sở dữ liệu
                Connection con = DatabaseHelper.openConnection();) {
            try {
                // Bước 2: Tạo ra đối tượng statement
                String sql = "DELETE FROM Financial WHERE FinancialId = ?";

                PreparedStatement pst = con.prepareStatement(sql);
                con.setAutoCommit(false);
                pst.setInt(1, t.getFinancialId());
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
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public ArrayList<Financial> selectAll() {
        ArrayList<Financial> result = new ArrayList<Financial>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            int userId = PersonalFinanceManagement.getInstance().getUserId();
//            String sql = "SELECT * FROM dbo.Financial WHERE CategoryId IN (SELECT CategoryId From Category WHERE UserId = "+ userId +")" ;
            String sql = "SELECT * FROM dbo.Financial WHERE CategoryId IN (SELECT CategoryId From Category WHERE UserId = "+ 2 +")" ;
            ResultSet rs = statement.executeQuery(sql);
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int revenuesId = rs.getInt("FinancialId");
                int amount = rs.getInt("Amount");
                Timestamp dateTime = rs.getTimestamp("DateTime");
                String note = rs.getString("Note");
                int categoryId = rs.getInt("CategoryId");
                Financial financial = new Financial(revenuesId, amount, dateTime, note, categoryId);
                result.add(financial);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Financial selectByName(String name) {
        return null;
    }

    public ArrayList<Financial> selectByCondition(String sql) {
        ArrayList<Financial> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            Statement statement = con.createStatement();
            //Bước 3: Thực thi câu lệnh SQL
            String query = "SELECT * FROM [Financial] WHERE " + sql + "";
            ResultSet rs = statement.executeQuery(query);
            //Bước 4: Làm việc với kết quả thu được
            int revenuesId = rs.getInt("FinancialId");
            int amount = rs.getInt("Amount");
            Timestamp dateTime = rs.getTimestamp("DateTime");
            String note = rs.getString("Note");
            int categoryId = rs.getInt("CategoryId");
            Financial financial = new Financial(revenuesId, amount, dateTime, note, categoryId);
            result.add(financial);
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ArrayList<Financial> selectByGroupAndUser(boolean typeCate) {
        ArrayList<Financial> result = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String query = "SELECT * FROM Financial WHERE CategoryId IN (SELECT CategoryId FROM dbo.Category WHERE UserId = ? AND CategoryType = ?)";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setBoolean(2, typeCate);
            //Bước 3: Thực thi câu lệnh SQL            
            ResultSet rs = ps.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int revenuesId = rs.getInt("FinancialId");
                int amount = rs.getInt("Amount");
                Timestamp dateTime = rs.getTimestamp("DateTime");
                String note = rs.getString("Note");
                int CategoryId = rs.getInt("CategoryId");
                Financial revenues = new Financial(revenuesId, amount, dateTime, note, CategoryId);
                result.add(revenues);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}

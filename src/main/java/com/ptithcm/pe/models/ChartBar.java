package com.ptithcm.pe.models;

import com.ptithcm.pe.PersonalFinanceManagement;
import com.ptithcm.pe.dao.FinancialDAO;
import com.ptithcm.pe.database.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChartBar {

    private int month;
    private int totalExpense;
    private int totalIncome;
    private int total;

    public ChartBar(int month, int totalExpense, int totalIncome) {
        this.month = month;
        this.totalExpense = totalExpense;
        this.totalIncome = totalIncome;
        this.total = totalExpense + totalIncome;
    }

    public static ChartBar getInstance() {
        return new ChartBar();
    }

    public ChartBar() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(int totalExpense) {
        this.totalExpense = totalExpense;
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(int totalIncome) {
        this.totalIncome = totalIncome;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ChartBar{" + "month=" + month + ", totalExpense=" + totalExpense + ", totalIncome=" + totalIncome + ", total=" + total + '}';
    }

    public ArrayList<ChartBar> getData(int year) {
        ArrayList<ChartBar> chartBars = new ArrayList<>();
        try {
            //Bước 1: Tạo kết nối cơ sở dữ liệu
            Connection con = DatabaseHelper.openConnection();
            // Bước 2: Tạo ra đối tượng statement
            String sql = "SELECT\n"
                    + "    Months.Month AS Month,\n"
                    + "    COALESCE(SUM(CASE WHEN c.CategoryType = 1 THEN f.Amount ELSE 0 END), 0) AS TotalExpenditure,\n"
                    + "    COALESCE(SUM(CASE WHEN c.CategoryType = 0 THEN f.Amount ELSE 0 END), 0) AS TotalIncome\n"
                    + "FROM\n"
                    + "    (SELECT 1 AS Month\n"
                    + "     UNION SELECT 2\n"
                    + "     UNION SELECT 3\n"
                    + "     UNION SELECT 4\n"
                    + "     UNION SELECT 5\n"
                    + "     UNION SELECT 6\n"
                    + "     UNION SELECT 7\n"
                    + "     UNION SELECT 8\n"
                    + "     UNION SELECT 9\n"
                    + "     UNION SELECT 10\n"
                    + "     UNION SELECT 11\n"
                    + "     UNION SELECT 12) AS Months\n"
                    + "LEFT JOIN\n"
                    + "    Financial f ON Months.Month = MONTH(f.DateTime) AND YEAR(f.DateTime) = ?\n"
                    + "LEFT JOIN\n"
                    + "    Category c ON f.CategoryId = c.CategoryId AND c.CategoryType IN (0, 1) AND c.UserId = ?\n"
                    + "GROUP BY\n"
                    + "    Months.Month\n"
                    + "ORDER BY\n"
                    + "    Months.Month;";
            int userId = PersonalFinanceManagement.getInstance().getUserId();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(2, 1);
            preparedStatement.setInt(1, year);
            //Bước 3: Thực thi câu lệnh SQL
            ResultSet rs = preparedStatement.executeQuery();
            //Bước 4: Làm việc với kết quả thu được
            while (rs.next()) {
                int months = rs.getInt("Month");
                int totalExpenses = rs.getInt("TotalExpenditure");
                int totalIncomes = rs.getInt("TotalIncome");
                ChartBar chartBar = new ChartBar(months, totalExpenses, totalIncomes);
                chartBars.add(chartBar);
            }
            //Bước 5: Ngắt kết nối
            DatabaseHelper.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(FinancialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartBars;
    }
}

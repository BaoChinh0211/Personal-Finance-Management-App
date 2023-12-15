package com.ptithcm.pe.test;

import com.ptithcm.pe.dao.UserDAO;
import com.ptithcm.pe.models.User;

import java.util.ArrayList;

public class TestIUserDAO {
    public static void main(String[] args) {
        /* Insert A New User */
        User user1 = new User("Bảo Chính", "baochinh0211", "123456", "baochinh0211");
        User user2 = new User("Hạnh", "hanh2307", "123456", "ngochanh@gmail.com");
        int result1 = UserDAO.getInstance().insert(user1);
        int result2 = UserDAO.getInstance().insert(user2);
        if (result1 > 0)
            System.out.println("Insert User 1 success!");
        else System.out.println("Insert User 1 Fail");
        if (result2 > 0)
            System.out.println("Insert User 2 success!");
        else System.out.println("Insert User 2 Fail");

        ArrayList<User> user = new ArrayList<>();
        user = UserDAO.getInstance().selectAll();
        for (User users: user
             ) {
            System.out.println(users.toString());
        }

        System.out.println(UserDAO.getInstance().selectByName("Bảo Chính"));
        /* Update An User*/
//        User user = new User(1, "Nguyễn Bảo Chính", "baochinh02112001", "12345678", "baochinh02112001@gmail.com");
//        int result = UserDAO.getInstance().update(user);
//        if (result > 0)
//            System.out.println("Update success!");
//        else System.out.println("Update Fail");

//        System.out.println(UserDAO.getInstance().selectByUsername("baochinh02112001").toString());

        /* Delete An User*/
//        User user = new User(1, "Nguyễn Bảo Chính", "baochinh02112001", "12345678", "baochinh02112001@gmail.com");
//        int result = UserDAO.getInstance().delete(user);
//        if (result > 0)
//            System.out.println("Delete success!");
//        else System.out.println("Delete Fail");
    }
    
    
    
    
}

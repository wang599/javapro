package com.neuedu.bean;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyTest3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection(url, username, password);
                pstmt = con.prepareStatement("insert into student(name,age,gender) values('李狗子',7,1)");
                int i = pstmt.executeUpdate();
                System.out.println(i);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                    if (con != null)
                        con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

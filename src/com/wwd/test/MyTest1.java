package com.wwd.test;

import com.neuedu.util.JdbcUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            Socket socket = server.accept();
            System.out.println("客户端已连接");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            while(true){
                System.out.println("客户端说:"+str);
                str=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method(List list){}
    public static void shiwu1(){
        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        try {
            con.setAutoCommit(false);
            Thread.sleep(1000);
            pstmt = con.prepareStatement("insert into student (id,name,age,gender)values(?,?,?,?)");
            pstmt.setInt(1,1);
            pstmt.setString(2,"张三");
            pstmt.setInt(3,20);
            pstmt.setInt(4,1);
            Thread.sleep(1000);
            int i = pstmt.executeUpdate();
            System.out.println("事务1执行--"+i);
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(pstmt != null)
                        pstmt.close();
                    if(con != null)
                        con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    public static void shiwu2(){
        Connection con = JdbcUtil.getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        // 如果实现事务管理  我们就必须 不能让 每次增删改之后都自动提交
        try {
            con.setAutoCommit(false);
            con.setTransactionIsolation(8);
            pstmt = con.prepareStatement("select id,name,age,gender from student where id=1");
            rs = pstmt.executeQuery();
            if(rs.next()){
                System.out.println("事务2===存在 不能写了 ");
            }else{
                System.out.println("事务2====可以写 ");
                Thread.sleep(3000);
                pstmt2 = con.prepareStatement("insert into student(id,name,age,gender) values(?,?,?,?)");
                pstmt2.setInt(1,1);
                pstmt2.setString(2,"张三");
                pstmt2.setInt(3,20);
                pstmt2.setInt(4,1);
                int i = pstmt2.executeUpdate();
                System.out.println("事务2==="+i);
            }
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null)
                    ((ResultSet) rs).close();
                if(pstmt != null)
                    pstmt.close();
                if(pstmt2 != null)
                    pstmt2.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


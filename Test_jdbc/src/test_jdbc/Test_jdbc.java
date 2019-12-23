/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Test_jdbc {

    ArrayList<sinhvien>list;
    private Connection conn;
    
    public Test_jdbc(){
        
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//đăng kí
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_SV;integratedSecurity=true;");
          //kết nối
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public void read_database(){
        String sql="select * from sv";
       
        list=new ArrayList<sinhvien>();
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
             
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                  sinhvien s=new sinhvien();
                 s.setTensv(rs.getString("tensv"));
                 s.setMasv(rs.getInt("masv"));
                 s.setQuequan(rs.getString("quequan"));
                 s.setDiemso(rs.getFloat("diemso"));
               
                
                  list.add(s);
             }
             
            
          
            hienthi();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    public void hienthi(){
        for(int i=0;i<list.size();++i){
            System.out.println(list.get(i).xuat());
        }
    }
    public static void main(String[] args) {
        new Test_jdbc().read_database();
        
        
    }
    
}

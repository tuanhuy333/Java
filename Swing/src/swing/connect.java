/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;

/**
 *
 * @author Administrator
 */
public class connect {
    
    public Connection conn;
    public connect(){
        
      try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//đăng kí
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_quanlithuvien;integratedSecurity=true;");
          //kết nối
        }catch(Exception e){
            System.out.println("Không kết nối được với CSDL");
            e.printStackTrace();
        }
           
    }
    
        
   // them sua xoa du lieu 
    public void insert_remove_updateData(String sql){
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("thành công");
            }
            else{
                System.out.println("fail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //select * from ...
    public ResultSet loadData(String sql){
        new connect();
       ResultSet rs=null;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            
            return rs= ps.executeQuery();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
            
            return rs;
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goi_storeprocedure;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Goi_storeprocedure {

    /**
     * @param args the command line arguments
     */
    
    private static Connection conn;
    public static void main(String[] args) {
        
        
//        //ketnoi jdbc
//        try{
//            
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//đăng kí
//            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLHocVien;integratedSecurity=true;");
//          //kết nối
//        }catch(Exception e){
//            System.out.println("Không kết nối được với CSDL");
//            e.printStackTrace();
//        }
//           
//        
//        String ma="MH00002";
//        String sql=String.format("{CALL tenmh_theoma(%s)}",ma);
//        // String sql="{CALL tenmh_theoma(?)}";
//        
//        CallableStatement cs;
//        try {
//            cs = conn.prepareCall(sql);
//            
//           
//             
//             cs.execute();
//             
//             ResultSet rs=cs.getResultSet();
//             
//             while(rs.next()){
//                 System.out.println(rs.getString(1));
//             }
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Goi_storeprocedure.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        

            connect c=new connect();
            
            String ma="MH00003";
            String sql=String.format("{call tenmh_theoma(%s)}",ma);
            
            ResultSet rs=c.load_dataStore(sql);
            
        try {
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Goi_storeprocedure.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
}

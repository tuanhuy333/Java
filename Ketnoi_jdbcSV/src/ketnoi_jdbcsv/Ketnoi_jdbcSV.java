/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoi_jdbcsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Ketnoi_jdbcSV {

    public Connection conn;

    Scanner nhap = new Scanner(System.in);

    public void connect_SQL() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//đăng kí
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=data_bt1;integratedSecurity=true;");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void test(){
        String c=nhap.nextLine();
        System.out.println(c);
    }

    public void insertSV() {
        System.out.println("nhap ma sv");
        int ma = nhap.nextInt();
        nhap.nextLine();
        System.out.println("nhap ten sv");
        String ten = nhap.nextLine();
        System.out.println("nhap gioi tinh");
        String gt = nhap.nextLine();
        System.out.println("nhap ma lop");
        int malop = nhap.nextInt();

        try {                                                                              
            String sql = "insert into sv(masv,tensv,gioitinh,malop) values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, ma);
            ps.setString(2,ten);
            ps.setString(3, gt);
            ps.setInt(4, malop);
            
            
             int kq=ps.executeUpdate();
             if(kq>0){
                 System.out.println("Thêm thành công");
             }
             else{
                 System.out.println("Thêm thất bại");
             }
             
        
        } catch (SQLException ex) {
            Logger.getLogger(Ketnoi_jdbcSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    public void insertLOP() {
       
   
        System.out.println("nhap ten lop");
        String ten = nhap.nextLine();
        

        try {
            String sql = "insert into lop(tenlop) values(?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

         
            ps.setString(1, ten);
           

             ps.executeUpdate();
             
             
                ResultSet rs = ps.getGeneratedKeys();
 
        int idValue =0;
       
        if (rs.next()) {
            //neu chi so auto increase khong phai la 1 thi phai truy cap theo ten
            idValue = rs.getInt(1);
            
        }
 
        System.out.println("Ma Lop dang them: " + idValue);
 


        } catch (SQLException ex) {
            Logger.getLogger(Ketnoi_jdbcSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ResultSet load_data(String sql){
        
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            return ps.executeQuery();
            
        }catch(Exception e){
           
            System.out.println("Khong co du lieu trong CSDL");
             return null;
        }
    }
    public void showData(String sql){
        try {
            ResultSet rs=load_data(sql);
            
            while(rs.next()){
                System.out.println("||masv|| "+rs.getInt(1)+"||tensv|| "+rs.getString(2)
                        + "||gioitinh|| "+rs.getString(3) +"||malop|| "+rs.getInt(4));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ketnoi_jdbcSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa(String bang,String dk,String data){
        
        String sql="delete from "+bang+" where "+dk+" ="+data;
        
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            
            int kq=ps.executeUpdate();
            if(kq>0){
                System.out.println("Xoa thanh cong");
            }else{
                System.out.println("Xoa that bai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ketnoi_jdbcSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void chuyenlop(String tensv,String tenlopmuonchuyen){
        //cau sql1 de lay ma lop can chuyen den de dua vao cau lenh 2 Update...
        String sql1="select malop from lop where tenlop='"+tenlopmuonchuyen+"'";
        
        int malopmuonchuyen=0;
        try {
            PreparedStatement ps=conn.prepareStatement(sql1);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                malopmuonchuyen=rs.getInt(1);
            }
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        //chinh sua ma theo tensv
        String sql2="UPDATE dbo.sv SET malop="+malopmuonchuyen+" FROM dbo.sv JOIN dbo.lop ON lop.malop = sv.malop WHERE tensv='"+tensv+"'";
        try {
            PreparedStatement ps=conn.prepareStatement(sql2);
           
           
            int kq=ps.executeUpdate();
            if(kq>0){
                System.out.println("Da chuyen lop");
            }
            else{
                System.out.println("Chua chuyen duoc lop");
            }
            
        } catch (SQLException ex) {
            System.out.println("Khong co ai hoc lop "+tenlopmuonchuyen+" trong danh sach sv");
        }
        
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        connect c=new connect();
		
	ArrayList <sanpham>list=new ArrayList<sanpham>();
		
            list=c.getAllSP("select * from sp");
            
            for(sanpham s:list){
                 System.out.println(s.getId());
                System.out.println(s.getTensp());
            }
		
        
      
    }

}

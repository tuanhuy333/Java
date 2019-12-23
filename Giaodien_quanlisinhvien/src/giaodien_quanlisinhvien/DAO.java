/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien_quanlisinhvien;
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
public class DAO {
    private Connection conn;
    
    
    public DAO(){
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//đăng kí
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_SV;integratedSecurity=true;");
          //kết nối
        }catch(Exception e){
            e.printStackTrace();
        }
}
        //ghi du lieu vao CSDL
    public void addSV(sinhvien s){
        //cauu truy van SQL
        String sql="INSERT INTO sv(tensv,masv,quequan,diemso) VALUES(?,?,?,?)";
        
        try{
            PreparedStatement  ps=conn.prepareStatement(sql);
            
            ps.setString(1, s.getTensv());
            ps.setInt(2, s.getMasv());
            ps.setString(3, s.getQuequan());
            ps.setFloat(4, s.getDiemso());
            
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
       
    }
    public void updateSV(){
        String sql="update sv set tensv='hang' where masv='1001'";
        
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    public void removeSV(String gtxoa){
        String sql="delete from sv where masv="+gtxoa;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    //doc CSDL
    public ArrayList<sinhvien> getList(){
        
        ArrayList<sinhvien> list=new ArrayList<sinhvien>();
        
        String sql="SELECT * FROM DBO.SV";
        
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            
            
            ResultSet rs=ps.executeQuery();//doc dong dau tien
            
            while(rs.next()){
                sinhvien s=new sinhvien();
                
                s.setTensv(rs.getString("tensv"));
                s.setMasv(rs.getInt("masv"));
                s.setQuequan(rs.getString("quequan"));
                s.setDiemso(rs.getFloat("diemso"));
                
                list.add(s);
                
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        return list;
    }
    public ArrayList<sinhvien> getListsort(){
        
        ArrayList<sinhvien> list=new ArrayList<sinhvien>();
        
        String sql="SELECT * FROM DBO.SV order by diemso";
        
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            
            
            ResultSet rs=ps.executeQuery();//doc dong dau tien
            
            while(rs.next()){
                sinhvien s=new sinhvien();
                
                s.setTensv(rs.getString("tensv"));
                s.setMasv(rs.getInt("masv"));
                s.setQuequan(rs.getString("quequan"));
                s.setDiemso(rs.getFloat("diemso"));
                
                list.add(s);
                
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        return list;
    }
    public static void main (String[]args){
        
        new DAO();
    }
}

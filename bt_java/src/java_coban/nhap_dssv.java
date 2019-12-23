package java_coban;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.*;
public class nhap_dssv {
    public static void main(String[] args){
         
    
        Scanner nhap =new Scanner(System.in);
        
        //tao danh sach sinh vien
        ArrayList <sinhvien>ds=new ArrayList<>();
        
        System.out.println("nhap so luong sinh vien trong danh sach:");
        int n=nhap.nextInt();
        
        
        //nhap ds sinh vien
        for(int i=0;i<n;++i){
            
        //co the dung vong lap do while...de tuy y so luong sinh vien
            
            sinhvien sv=new sinhvien(); //moi lan set thi phai tao lai doi tuong trong vong lap
            
            System.out.println("sinh vien "+i);
            nhap.nextLine(); //tranh bi truot dong
            
            System.out.println("ten:");
            String tenX=nhap.nextLine();
            
            System.out.println("diem:");
            int diemX=nhap.nextInt();
            
            sv.set_hoten(tenX);
            sv.set_diem(diemX);
            
            ds.add(sv); 
        }
        
        
        //xuat danh sach sinh vien
        
//        for(int i=0;i<ds.size();++i){
//            System.out.println(ds.get(i).get_hoten() + ds.get(i).get_diem());
//        }
//        
        xuat_ds(ds);
        
    }
    public static void xuat_ds(ArrayList<sinhvien> a){
       
        for(int i=0;i<a.size();++i){
            System.out.println(a.get(i).get_hoten() + a.get(i).get_diem());
        }
    }
}
class sinhvien {
    private String hoten;
    
    private int diem;
    
    public sinhvien(){
        this.hoten=null;
        this.diem=0;
    }
    public sinhvien(String hoten,int diem){
        this.hoten=hoten;
        this.diem=diem;
    }
    public void set_hoten(String hoten){
        this.hoten=hoten;
    }
    public String get_hoten(){
        return hoten;
    }
    public void set_diem(int diem){
        this.diem=diem;
    }
    public int get_diem(){
        return diem;
    }
    
}




  
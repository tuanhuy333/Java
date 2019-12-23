///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package java_coban;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class hocsinh{
        String hoten;
        int tuoi;
        int diem;
    
    private static Scanner nhap=new Scanner(System.in);
    //ArrayList <hocsinh> list_hs=new ArrayList();
    //CONTRUCTOR
    public hocsinh(){};
    public hocsinh(String hoten,int tuoi,int diem){
        this.hoten=hoten;
        this.tuoi=tuoi;
        this.diem=diem;
    }
        
        //getter va setter
    public void set_hoten(String hoten){
        this.hoten=hoten;
    }
    public String get_hoten(){
        return this.hoten;
    }
    public void set_tuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public int get_tuoi(){
        return this.tuoi;
    }
    public void set_diem(int diem){
        this.diem=diem;
    }
    public int get_diem(){
        return this.diem;
    }
    
    public void nhap_info( ArrayList <hocsinh> l){
        
       
        
        
        
        while(true){
                
            hocsinh hs=new hocsinh();
            
            System.out.println("Ho ten :");
            
            String ht=nhap.nextLine();
            
            
            
            System.out.println("Tuoi ");
            int t=nhap.nextInt();
            
            
            System.out.println("Diem ");
            int d=nhap.nextInt();
            
            hs.set_hoten(ht);
            hs.set_tuoi(t);
            hs.set_diem(d);
            
            l.add(hs);
            
            System.out.println("Ban co muon nhap thong tin nua ko? Y/N");
            
            
            
            
            if(nhap.next().equals("N")){
                break;
            }
            nhap.nextLine();
            
        }
        
    }
    
    public String hienthi(){
        return "Ho ten :"+this.get_hoten()+"Tuoi :"+this.get_tuoi()+"Diem :"+this.get_diem();
    }
    public void xuat_info( ArrayList <hocsinh> l){
        System.out.println("THONG TIN DA NHAP :");
        
        
        for(int i=0;i<l.size();++i){
            System.out.println(l.get(i).hienthi());
        }
    }
    
    

}

public class quanlihocsinh {
    
    
    
   
    
    public static void main(String[]args){
        quanlihocsinh qlhs=new quanlihocsinh();
        
        ArrayList <hocsinh> l=new ArrayList();
        
        hocsinh hs1=new hocsinh();
        
        hs1.nhap_info(l);
        hs1.xuat_info(l);
       
        
    
          
    }
} 
        
        
        
    
    
        
       
//        Iterator it=list_hs.iterator();
//        while(it.hasNext()) {
//            Object obj=it.next();
//            if(obj instanceof hocsinh) {
//                hocsinh hs=(hocsinh)obj;
//                System.out.println ("ho ten "+ hs.get_hoten());
//                System.out.println ("tuoi "+ hs.get_tuoi());
//                System.out.println ("diem "+ hs.get_diem());
               
        
//    
    
    
    
        
 
    
    
    
    
    
        
    

//import java.util.Scanner;
//import java.util.ArrayList;
//class HocSinh {
//
//    private String ten;
//    private int tuoi;
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public int getTuoi() {
//        return tuoi;
//    }
//
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//}
//
//public class quanlihocsinh {
//
//    public static void main(String[] args) {
//        ArrayList<HocSinh> listHS = new ArrayList(); // Khai báo 1 đối tượng ArrayList, các phần tử tạo ra từ lớp HocSinh
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập số học sinh: ");
//        int n = input.nextInt();
//
//
//        for (int i = 0; i < n; i++) {
//            HocSinh x = new HocSinh(); //Tạo đối tượng x để lưu tạm thời dữ liệu
//            System.out.println("Học sinh thứ " + i + ": ");
//            input.nextLine(); //Dòng này tránh bị trượt dòng!
//
//            System.out.print("Tên: ");
//            String tenX = input.nextLine();
//
//            System.out.print("Tuổi: ");
//            int tuoiX = input.nextInt();
//
//            x.setTen(tenX);
//            x.setTuoi(tuoiX);
//            listHS.add(x);  // Thêm đối dữ liệu về x vào trong ArrayList
//        }
//
//        System.out.println("Thông tin danh sách vừa nhập vào là: ");
//        for (int i = 0; i < listHS.size(); i++) {
//            System.out.print("Học sinh thứ " + i);
//            System.out.print(" - Tên " + listHS.get(i).getTen() + " Tuổi: " + listHS.get(i).getTuoi()+"\n");
//        }
//    }
//}
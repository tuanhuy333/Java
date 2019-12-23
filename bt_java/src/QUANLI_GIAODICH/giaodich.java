/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLI_GIAODICH;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class giaodich {
    protected int ma_giaodich;
    protected String ngay_giaodich;
    protected int soluong;
    protected double thanhtien,dongia;
    
    Scanner nhap=new Scanner(System.in);
    //setter 
    public void set_ma_giaodich(int ma_giaodich){
        this.ma_giaodich=ma_giaodich;
    }
    public void set_ngay_giaodich(String ngay_giaodich){
        this.ngay_giaodich=ngay_giaodich;
    }
    public void set_soluong(int soluong){
        this.soluong=soluong;
    }
    public void set_thanhtien(double thanhtien){
        this.thanhtien=thanhtien;
    }
    public void set_dongia(double dongia){
        this.dongia=dongia;
    }
    
    //getter
    public int get_ma_giaodich(){
        return this.ma_giaodich;
    }
    public String get_ngay_giaodich(){
        return this.ngay_giaodich;
    }
    public int get_soluong(){
        return this.soluong;
    }
    public double get_dongia(){
        return this.dongia;
    }
    public double get_thanhtien(){
        return this.thanhtien;
    }
    
    //contructor
    
    public giaodich(){
        this.ma_giaodich=0;
        this.ngay_giaodich="";
        this.soluong=0;
        this.dongia=0.0;
        this.thanhtien=0.0;
    }
    public giaodich(int ma_giaodich,String ngay_giaodich,int soluong,double dongia,double thanhtien){
        this.ma_giaodich=ma_giaodich;
        this.ngay_giaodich=ngay_giaodich;
        this.soluong=soluong;
        this.dongia=dongia;
        this.thanhtien=thanhtien;
        
    }
    
    //nhap 
    public void nhap(){
        System.out.println("Ma giao dich:");
        this.ma_giaodich=nhap.nextInt();
        
        nhap.nextLine(); //de ko bi mat mot dong
        
        System.out.println("Ngay giao dich:");
        this.ngay_giaodich=nhap.nextLine();
        
        System.out.println("So luong:");
        this.soluong=nhap.nextInt();
        
        System.out.println("Don gia:");
        this.dongia=nhap.nextDouble();
        
       
    }
    
    public String xuat(){
        return "Magiaodich:"+this.ma_giaodich+" Ngaygiaodich:"+this.ngay_giaodich+" Soluong:"+this.soluong+" Dongia:"+this.dongia;
    }
    
}

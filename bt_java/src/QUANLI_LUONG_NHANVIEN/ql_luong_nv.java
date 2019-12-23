/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLI_LUONG_NHANVIEN;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

    
public class ql_luong_nv {
    
    
    public static void main(String []args){
        
        nhanvien n1=new nhanvien();
        n1.nhap_thongtin();
        n1.xuat_thongtin();
        System.out.println(n1.tinh_luong());
        n1.tinh_thuong();
    }
    
}
class nhanvien{
    private String maso;
    private String hoten;
    private int songaycong;
    char xeploai;
    
    private static int luong=200000;
    
    public  Scanner nhap=new Scanner(System.in);
    public void set_maso(String maso){
        this.maso=maso;
    }
    public String get_maso(){
        return this.maso;
    }
    public void set_hoten(String hoten){
        this.hoten=hoten;
    }
    public String get_hoten(){
        return this.hoten;
    }
    public void set_songaycong(int songaycong){
        this.songaycong=songaycong;
    }
    public int get_songaycong(){
        return this.songaycong;
    }
    //ham khoi tao
    public nhanvien(){
        maso=null;
        hoten=null;
        songaycong=0;
    }
    public nhanvien(String maso,String hoten,int songaycong){
        this.hoten=hoten;
        this.maso=maso;
        this.songaycong=songaycong;
    }
    public void nhap_thongtin(){
        System.out.println("MS: ");
         maso=nhap.nextLine(); 
        System.out.println("Ho ten: ");
        hoten=nhap.nextLine();
       
        System.out.println("So ngay cong: ");
        songaycong=nhap.nextInt();
    }
    public void xuat_thongtin(){
        xeploai();
        System.out.println("MS:"+this.maso+" Hoten:"+this.hoten+" songaycong:"+this.songaycong+" xeploai:"+this.xeploai);
    }
    public void xeploai(){
        if(songaycong > 26){
            xeploai='A';
        }
        if(songaycong >= 22 && songaycong <=26 )
        {
            xeploai='B';
            
        }
        if(songaycong < 22){
            xeploai='C';
        }
    }
    public int tinh_luong(){
        return this.luong * this.songaycong;
        
    }
    public void tinh_thuong(){
        int luong_ht=tinh_luong();
        int thuong=0;
        if(this.xeploai == 'A'){
            thuong=(luong_ht*5)/100;
        }
        else if(this.xeploai == 'B'){
            thuong = (luong_ht*2)/100;
        }
        else{
            thuong=0;
        }
        System.out.println("tien thuong: "+thuong);
    }
    
    
    
    
}


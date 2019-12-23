/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NUOC_GIAI_KHAT;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class nuoc_giai_khat {
    public static void main(String[]args){
        
        nuocgiaikhat ngk1=new nuocgiaikhat();
        ngk1.nhap_thongtin();
        ngk1.xuat_thongtin();
        ngk1.thanhtien();
        

    }
    
}
class nuocgiaikhat{
    private String tenhang;
    private String donvitinh;
    private int soluong;
    private float dongia;
    private float thue_VAT;
    
    //ham khoi tao tham so
    public nuocgiaikhat(){
        tenhang=null;
        donvitinh=null;
        soluong=0;
        dongia=0;
        thue_VAT=0;
    }
    public nuocgiaikhat(String tenhang,String donvitinh,int soluong,float dongia,float thue_VAT){
        this.tenhang=tenhang;
        this.donvitinh=donvitinh;
        this.soluong=soluong;
        this.dongia=dongia;
        this.thue_VAT=thue_VAT;
    }
    
    //setter and getter
    
    public void set_tenhang(String tenhang){
        this.tenhang=tenhang;
    }
    public String get_tenhang(){
        return this.tenhang;
    }
    public void set_donvitinh(String donvitinh){
        this.donvitinh=donvitinh;
    }
    public String get_donvitinh(){
        return this.donvitinh;
    }
    public void set_soluong(int soluong){
        this.soluong=soluong;
    }
    public int get_soluong(){
        return this.soluong;
    }
    public void set_dongia(float dongia){
        this.dongia=dongia;
    }
    public float get_dongia(){
        return this.dongia;
    }
    public void set_thue_VAT(float thue_VAT){
        this.thue_VAT=thue_VAT;
    }
    public float get_thue_VAT(){
        return this.thue_VAT;
    }
    
    //nhap_xuat
    public void nhap_thongtin(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("ten hang:");
        tenhang=nhap.nextLine();
        
        do{
            System.out.println("don vi tinh:");
            donvitinh=nhap.nextLine();
        }while(donvitinh.equals("chai")==false &&donvitinh.equals("kết")==false &&donvitinh.equals("thùng")==false &&donvitinh.equals("lon")==false );
        
        
        System.out.println("so luong:");
        soluong=nhap.nextInt();
        
        System.out.println("don gia:");
        dongia=nhap.nextFloat();
        
        System.out.println("thue_VAT:");
        thue_VAT=nhap.nextFloat();
    }
    public void xuat_thongtin(){
        System.out.println("tenhang:"+tenhang+" donvitinh:"+donvitinh+" soluong:"+soluong+" dongia:"+dongia+" thue_VAT"+thue_VAT);
    }
    
    public void thanhtien(){
        float tien=0;
       if(donvitinh.compareTo("kết")==0 || donvitinh.compareTo("thùng")==0){
           tien=soluong*dongia*thue_VAT;
           
       }
       if(donvitinh.compareTo("chai")==0){
           tien=soluong*(dongia/20)*thue_VAT;
       }
       if(donvitinh.compareTo("lon")==0){
           tien=soluong*(dongia/24)*thue_VAT;
       }
       System.out.println("thanh tien :"+tien);
    }
    public void donvitinh_theoquydinh(){
        do{
            System.out.println("nhap dvt:");
        }while(donvitinh.compareTo("kết")==0||donvitinh.compareTo("thùng")==0||donvitinh.compareTo("chai")==0||donvitinh.compareTo("lon")==0);
    
    }
    
}

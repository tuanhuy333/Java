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
public class giaodich_tien extends giaodich{
    Scanner nhap=new Scanner(System.in);
    
    private float tygia;
    private int loaitien;
    
    //setter
    
    public void set_tygia(float tygia){
        this.tygia=tygia;
    }
    public void set_loaitien(int loaitien){
        this.loaitien=loaitien;
    }
    
    //getter 
    public float get_tygia(){
        return this.tygia;
    }
    public int get_loaitien(){
        
        return this.loaitien;
    }
    
    //contructor
    
    public giaodich_tien(){
        super();
        
        this.tygia=0;
        this.loaitien=0;
    }
    public giaodich_tien(int ma_giaodich,String ngay_giaodich,int soluong,double dongia,double thanhtien,float tygia,int loaitien){
        super(ma_giaodich, ngay_giaodich, soluong, dongia, thanhtien);
        
        this.tygia=tygia;
        this.loaitien=loaitien;
    }
    
    public double thanhtien(){
        if(this.loaitien == 1){
            return this.thanhtien=this.dongia*this.soluong;
        }
        else
            return this.thanhtien=this.dongia*this.soluong*this.tygia;
    }
    
    @Override 
    public void nhap(){
        
        super.nhap();
        
        System.out.println("Ty gia:");
        this.tygia=nhap.nextFloat();
        
        System.out.println("Loai tien:");
        this.loaitien=nhap.nextInt();
        
    }
    
    @Override
    public String xuat(){
        
        String temp="";
        
        if(this.loaitien==1){
            temp="VND";
        }
        else if(this.loaitien==2){
            temp="USD";
        }
        else if(this.loaitien==3){
            temp="EURO";
        }
        
        return "GIAO DICH TIEN "+ super.xuat() + "ty gia:"+this.tygia+ "loai tien:"+temp+" thanh tien"+thanhtien();
    }
}

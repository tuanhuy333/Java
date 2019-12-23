/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLI_CHUYENXE;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class chuyenxe_ngoaithanh extends chuyenxe{
    private String noiden;
    private int songay_diduoc;
    
    
    //setter
    public void set_noiden(String noiden){
        this.noiden=noiden;
    }
    public void set_songay_diduoc(int songay_diduoc){
        this.songay_diduoc=songay_diduoc;
    }
    
    //getter
    public String get_noiden(){
        return this.noiden;
    }
    public int get_songay_diduoc(){
        return this.songay_diduoc;
    }
    //contructor
    
    public chuyenxe_ngoaithanh(){
        super();
        this.noiden="";
        this.songay_diduoc=0;
    }
    
    public chuyenxe_ngoaithanh(String maso_chuyen,String hoten_taixe,int soxe,double doanhthu,String noiden,int songay_diduoc){
        super(maso_chuyen, hoten_taixe, soxe, doanhthu);
        this.noiden=noiden;
        this.songay_diduoc=songay_diduoc;
    }
    
    @Override 
    public void nhap(){
        super.nhap();
        
        nhap.nextLine();//tranh bo mat 1 dong
        
        System.out.println("Noi den:");
        this.set_noiden(nhap.nextLine());
        
        System.out.println("So ngay di duoc:");
        this.set_songay_diduoc(nhap.nextInt());
    }
    
    @Override 
    public String xuat(){
        return super.xuat() + " noi den:"+this.noiden+" so ngay di duoc:"+this.songay_diduoc+" doanh thu:"+this.doanhthu;
    }
}

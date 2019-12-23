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

public class chuyenxe_noithanh extends chuyenxe {
    private int sotuyen;
    private int sokm;
    
    //setter
    public void set_sotuyen(int sotuyen){
        this.sotuyen=sotuyen;
    }
    
    public void set_sokm(int sokm){
        this.sokm=sokm;
    }
    
    //getter
    public int get_sotuyen(){
        return this.sotuyen;
    }
    public int get_sokm(){
        return this.sokm;
    }
    
    //contructor
    public chuyenxe_noithanh(){
        super();
        this.sotuyen=0;
        this.sokm=0;
    }
    public chuyenxe_noithanh(String maso_chuyen,String hoten_taixe,int soxe,double doanhthu,int sotuyen,int sokm){
        super(maso_chuyen, hoten_taixe, soxe, doanhthu);
        
        this.sotuyen=sotuyen;
        this.sokm=sokm;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        
        System.out.println("So tuyen:");
        this.sotuyen=nhap.nextInt();
        
        System.out.println("So km di duoc:");
        this.sokm=nhap.nextInt();
    }
    
    @Override
    public String xuat(){
        return super.xuat() + "so tuyen:" + this.sotuyen +" so km:"+this.sokm +" doanh thu:"+this.doanhthu;
    }
}

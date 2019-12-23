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
import java.util.Scanner;
public class chuyenxe {
    protected String maso_chuyen;
    protected String hoten_taixe;
    protected int soxe;
    protected double doanhthu;
    
    Scanner nhap=new Scanner(System.in);
    
    //setter
    protected void set_maso_chuyen(String maso_chuyen){
        this.maso_chuyen=maso_chuyen;
    }
    protected void set_hoten_taixe(String hoten_taixe){
        this.hoten_taixe=hoten_taixe;
    }
    protected void set_soxe(int soxe){
        this.soxe=soxe;
    }
    protected void set_doanhthu(double doanhthu){
        this.doanhthu=doanhthu;
    }
    
    //getter
    protected String get_maso_chuyen(){
        return this.maso_chuyen;
    }
    protected String get_hoten_taixe(){
        return this.hoten_taixe;
    }
    protected int get_soxe(){
        return this.soxe;
    }
    protected double get_doanhthu(){
        return this.doanhthu;
    }
    
    //contructor
    protected chuyenxe(){
        this.maso_chuyen="";
        this.hoten_taixe="";
        this.soxe=0;
        this.doanhthu=0.0;
    }
    protected chuyenxe(String maso_chuyen,String hoten_taixe,int soxe,double doanhthu){
        this.maso_chuyen=maso_chuyen;
        this.hoten_taixe=hoten_taixe;
        this.soxe=soxe;
        this.doanhthu=doanhthu;
    }
    
    protected void nhap(){
        System.out.println("Ma so chuyen xe:");
        this.maso_chuyen=nhap.nextLine();
        
        
        System.out.println("Ho ten tai xe:");
        this.hoten_taixe=nhap.nextLine();
        
        
        System.out.println("So xe:");
        this.soxe=nhap.nextInt();
        
        System.out.println("Doanh thu:");
        this.doanhthu=nhap.nextDouble();
        
    }
    public String xuat(){
        return "maso_chuyen:"+this.maso_chuyen+" ho ten tai xe:"+this.hoten_taixe+" soxe:"+this.soxe;
    }
}

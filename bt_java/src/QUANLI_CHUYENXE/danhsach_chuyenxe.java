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
public class danhsach_chuyenxe {
    
    ArrayList <chuyenxe> ds_chuyenxe=new ArrayList<chuyenxe>();
    
    private double sum1=0.0;//tong doanh thu xe noi thanh 
    
    private double sum2=0.0;//tong doanh thu xe ngoai thanh
    
    
    public void them_xenoithanh(){
        
        chuyenxe_noithanh nt=new chuyenxe_noithanh();
        
        nt.nhap();
        sum1 += nt.get_doanhthu();
        ds_chuyenxe.add(nt);
        
    }
    public void them_xengoaithanh(){
        
        chuyenxe_ngoaithanh ngt=new chuyenxe_ngoaithanh();
        
        ngt.nhap();
        sum2+=ngt.get_doanhthu();
        
        ds_chuyenxe.add(ngt);
    }
    
    public void xuat_thongtin(){
        for(int i=0;i<ds_chuyenxe.size();++i){
            
            System.out.println(ds_chuyenxe.get(i).xuat());
        }
        
        System.out.println("Doanh thu ");
        System.out.println("Chuyen xe noi thanh:"+sum1);
        System.out.println("Chuyen xe ngoai thanh:"+sum2);
    }
    
}

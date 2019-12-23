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
public class danhsach_giaodich {
    
    ArrayList <giaodich> ds_giaodich=new ArrayList<giaodich>();
    int sum1=0,sum2=0;
    double sumtien=0.0;
    
    
    public void nhap_giaodichvang(){
        
        giaodich_vang gd_vang=new giaodich_vang();
        
        gd_vang.nhap();
        
        //tong so luong vang
        sum1+= gd_vang.get_soluong();
        
        ds_giaodich.add(gd_vang);
        
    }
    public void nhap_giaodichtien(){
        
        giaodich_tien gd_tien=new giaodich_tien();
        
        gd_tien.nhap();
        
        //tong so luong tien
        
        sum2+=gd_tien.get_soluong();
        
        //tong cac thanh tien
        sumtien+= gd_tien.get_thanhtien();
        
        ds_giaodich.add(gd_tien);
    }
    
    public void xuat_thongtin(){
        
        for(int i=0;i<ds_giaodich.size();++i){
            
            System.out.println(ds_giaodich.get(i).xuat());
        }
    }
    
    public void tong_soluong(){
        System.out.println("-----------tong so luong vang-----------");
        System.out.println("Tong so luong vang:"+sum1);
        System.out.println("-----------tong so luong tien-----------");
        System.out.println("Tong so luong tien:"+sum2);
    }
    
    public void tbtt_tiente(){
        
        System.out.println("------------trung binh thanh tien------------");
        System.out.println(sumtien/ds_giaodich.size());
        
    }
    public void dongia_tren1ty(){
        System.out.println("---------------don gia tren 1 ty---------------");
        for(int i=0;i<ds_giaodich.size();++i){
            if(ds_giaodich.get(i).get_dongia() > 1000000000){
                System.out.println(ds_giaodich.get(i).xuat());
            }
        }
    }
    
    
    
    
}

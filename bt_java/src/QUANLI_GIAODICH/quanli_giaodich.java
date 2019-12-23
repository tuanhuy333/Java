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
public class quanli_giaodich {
    
    public static void main(String []args){
    Scanner nhap =new Scanner(System.in);
    danhsach_giaodich ds=new danhsach_giaodich();
    //tao menu
    
    int x;
    
    
    do{
            System.out.println("-------------MENU-------------");
            System.out.println("0.Exit");
            System.out.println("1.Them giao dich vang");
            System.out.println("2.Them giao dich tien");
            System.out.println("3.Xuat thong tin giao dich");
            System.out.println("4.Tong so luong cua tung loai giao dich");
            System.out.println("5.Trung binh thanh tien cua giao dich tien te");
            System.out.println("6.Don gia tren 1 ty");
            
            System.out.println("MOI BAN CHON :");
            x=nhap.nextInt();
            switch(x){
                case 0: System.exit(0);
                case 1: ds.nhap_giaodichvang();break;
                case 2: ds.nhap_giaodichtien();break;
                case 3: ds.xuat_thongtin();break;
                case 4: ds.tong_soluong();break;
                case 5: ds.tbtt_tiente();break;
                case 6: ds.dongia_tren1ty();break;
            }
    }while(x!=0);

    }
}

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
public class quanli_chuyenxe {
    public static void main(String [] args){
        Scanner nhap=new Scanner(System.in);
        int x;
        
        danhsach_chuyenxe ds=new danhsach_chuyenxe();
        //tao menu
        
        do{
            System.out.println("-----------MENU------------");
            System.out.println("0.Exit");
            System.out.println("1.Them chuyen xe noi thanh");
            System.out.println("2.Them chuyen xe ngoai thanh");
            System.out.println("3.Xuat thong tin");
            
            System.out.println("Moi ban nhap lua chon");
            x=nhap.nextInt();
            
            switch(x){
                case 0: System.exit(0);
                case 1: ds.them_xenoithanh();break;
                case 2: ds.them_xengoaithanh();break;
                case 3: ds.xuat_thongtin();break;
            }
        }while(true);
    }
}

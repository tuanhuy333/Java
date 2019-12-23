/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_quaivat;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String []args){
        
        Scanner nhap=new Scanner(System.in);
        
        danhsach_convat ls=new danhsach_convat();
        
        int chon;
        System.out.println("------------------MENU---------------------");
        System.out.println("1.Nhap");
        System.out.println("2.Xuat");
        System.out.println("3.A move");
        System.out.println("4.B move");
        System.out.println("5.C move");
        System.out.println("6.Tong gia tri cac con vat");
        System.out.println("7.Gia tri lon nhat cua con vat");
        while(true){
            
            System.out.println("Moi ban chon menu:");
            chon=nhap.nextInt();
            
            switch(chon){
                case 1:ls.nhapds();break;
                case 2:ls.xuatds();break;
                case 3:ls.A_move();break;
                case 4:ls.B_move();break;
                case 5:ls.C_move();break;
                case 6:ls.tonggiatri();break;
                case 7:ls.giatrimax();break;
            }
            if(chon==0)break;
        }
        
        
        
    }
}

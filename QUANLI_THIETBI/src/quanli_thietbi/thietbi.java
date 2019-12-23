/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_thietbi;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class thietbi {
    protected int ma;
    protected String ten;
    protected String ngaynhaphang;
    protected int giatien;
    
    
    Scanner nhap=new Scanner(System.in);
    
    
    public void nhap(){
        System.out.println("Nhap ma thiet bi:");
        this.ma=nhap.nextInt();
        nhap.nextLine();
        System.out.println("Nhap ten thiet bi:");
        this.ten=nhap.nextLine();
        
        System.out.println("Nhap ngay nhap hang: dd/mm/yyyy");
            this.ngaynhaphang=nhap.nextLine();
        
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        
        df.setLenient(false); //kiem tra ngay nhap co hop le (void)
        
        try{
            df.parse(this.ngaynhaphang);
        }
        catch(Exception e){
            
                System.out.println("Ngay nhap vao khong hop le...Moi ban nhap vao ngay khac");
                System.out.println("Nhap ngay nhap hang: dd/mm/yyyy");
                this.ngaynhaphang=nhap.nextLine();

        }

        System.out.println("Nhap gia tien cua thiet bi:");
        this.giatien=nhap.nextInt();
    }
    public String xuat(){
        return "Ma:"+this.ma+" Ten:"+this.ten+" Ngay nhap:"+this.ngaynhaphang+" Gia tien:"+this.giatien;
    }
    public abstract int theloai(); //chua biet dinh nghia the nao...vi "moi con" co cach dinh nghia rieng
}

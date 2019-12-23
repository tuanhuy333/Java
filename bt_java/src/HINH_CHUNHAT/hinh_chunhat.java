/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HINH_CHUNHAT;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class hinh_chunhat {
    public static void main(String[]args){
        hinhchunhat h1=new hinhchunhat();
        h1.nhap_thongtin();
        h1.xuat_thongtin();
        
        //h1.thaydoi_kichthuoc(1, 1, 1);
        
        hinhchunhat another_shape=new hinhchunhat(5,2);
        
        h1.thaydoi_kichthuoc(another_shape, 0);
        h1.xuat_thongtin();
    }
    
}
class hinhchunhat{
    private int chieudai;
    private int chieurong;
    
        //contructor
    public hinhchunhat(){
        chieudai=0;
        chieurong=0;
    }
    public hinhchunhat(int chieudai,int chieurong){
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }
    //ham huy
    public void finalize(){
        
    }
    
    //setter getter
    
    public void set_chieudai(int chieudai){
        this.chieudai=chieudai;
    }
    public int get_chieudai(){
        return this.chieudai;
    }
    public void set_chieurong(int chieurong){
        this.chieurong=chieurong;
    }
    public int get_chieurong(){
        return this.chieurong;
    }
    
    public float chuvi(){
        
        return (chieudai+chieurong)/2;
    }
    public int dientich(){
        return chieudai*chieurong;
    }
    public float duongcheo(){
        return (float)Math.sqrt((Math.pow(chieudai, 2)) + (Math.pow(chieurong, 2)));
    }
    
    //nhap_xuat
    public void nhap_thongtin(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("chieu dai:");
        chieudai=nhap.nextInt();
        System.out.println("chieu rong:");
        chieurong=nhap.nextInt();
    }
    public void xuat_thongtin(){
        System.out.println("chieudai:"+chieudai+" chieurong:"+chieurong);
    }
    
    //overload
    
    public void thaydoi_kichthuoc(int tx,int ty,int kieu){
        if(kieu == 1){
            chieudai+=tx;
            chieurong+=ty;
        }
        if(kieu == 0){
            chieudai-=tx;
            chieurong-=ty;
        }
    }
    public void thaydoi_kichthuoc(hinhchunhat a,int kieu){
        if(kieu == 1){
            chieudai+= a.chieudai;
            chieurong+=a.chieurong;
        }
        else if(kieu == 0){
            chieudai-= a.chieudai;
            chieurong-=a.chieurong;
        }
    }
}

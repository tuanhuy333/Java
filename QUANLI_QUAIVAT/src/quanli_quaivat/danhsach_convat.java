/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_quaivat;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class danhsach_convat {
    ArrayList <convat> ds=new ArrayList<>();
    Scanner nhap=new Scanner(System.in);
    
    
    public void nhapds(){
        
        convat c;
        
        System.out.println("1.Loai vat A");
        System.out.println("2.Loai vat B");
        System.out.println("3.Loai vat C");
        int chon;
        while(true){
            System.out.println("Moi ban lua chon");
            chon=nhap.nextInt();
            
            switch(chon){
                case 1: c=new loaivatA();
                            c.nhap();
                            ds.add(c);
                break;
                case 2: c=new loaivatB();
                            c.nhap();
                            ds.add(c);
                break;
                case 3: c=new loaivatC();
                            c.nhap();
                            ds.add(c);
                break;
            }
            if(chon==0)break;
        }
    }
    
    
    public void xuatds(){
        for(int i=0;i<ds.size();++i){
            System.out.println(ds.get(i).xuat());
        }
        
    }
    
    public void A_move(){
        System.out.println("Loai vat A da move");
        for(int i=0;i<ds.size();++i){
            if(ds.get(i) instanceof loaivatA) //neu doi tuong trong danh sach la loaivatA
            {
                ds.get(i).move();
            }
        }
        
        xuatds();
    }
    public void B_move(){
        
        System.out.println("Loai vat B da move");
        for(int i=0;i<ds.size();++i){
            if(ds.get(i) instanceof loaivatB)//neu doi tuong trong danh sach la loaivatB
            {
                ds.get(i).move();
            }
        }
        
        xuatds();
    }
    public void C_move(){
        System.out.println("Loai vat C da move");
        for(int i=0;i<ds.size();++i){
            if(ds.get(i) instanceof loaivatC)//neu doi tuong trong danh sach la loaivatC
            {
                ds.get(i).move();
            }
        }
        xuatds();
    }
    
    public void tonggiatri(){
        int tong=0;
        for(int i=0;i<ds.size();++i){
            tong+=ds.get(i).giatri();
        }
        System.out.println("Tong gia tri:"+tong);
    }
    
    public void giatrimax(){
        int max=0;
        
        for(int i=0;i<ds.size();++i){
            if(ds.get(i).giatri() > max){
                max=ds.get(i).giatri();
            }
        }
        
        System.out.println("Gia tri lon nhat cua con vat :"+max);
    }
}

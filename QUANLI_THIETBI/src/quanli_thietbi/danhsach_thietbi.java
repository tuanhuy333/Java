/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_thietbi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class danhsach_thietbi {
    ArrayList <thietbi> ds=new ArrayList<thietbi>();
    
    Scanner nhap=new Scanner(System.in);
    
    thietbi tb;
    
    public void nhap_ds(){
        while(true)
        {
            System.out.println("1.Dien thoai");
            System.out.println("2.Linh kien");
            int chon;
            System.out.println("Moi ban chon loai thiet bi de them vao danh sach:");
            chon=nhap.nextInt();
            
            switch(chon){
                case 1: tb=new dienthoai();
                            tb.nhap();
                            ds.add(tb);
                break;
                case 2: tb=new linhkien();
                            tb.nhap();
                            ds.add(tb);
                break;
            }
            if(chon==0) break;
        }
    }
    public void xuat_ds(){
        for(int i=0;i<ds.size();++i){
            System.out.println(ds.get(i).xuat());
        }
    }
    public void thietbi_dattiennhat(){
        int max=0;
        
        for(int i=0;i<ds.size();++i){
            if(ds.get(i) instanceof dienthoai){
                if(ds.get(i).giatien > max){
                max=ds.get(i).giatien;
            }
            }
            
        }
        System.out.println("Thiet bi dat tien nhat :"+max);
    }
    
//    public void xoa(){
//        
//        for(int i=0;i<ds.size();++i){
//            if(ds.get(i).nam<2000)
//            {
//                ds.remove(i);
//            }
//            if(ds.get(i).nam==2000){
//                        if(ds.get(i).thang <3){
//                                ds.remove(i);
//                    }
//                        if(ds.get(i).thang==3){
//                            if(ds.get(i).ngay <10){
//                                ds.remove(i);
//                            }
//                }
//            }
//            
//        }
    
    
        
    public void xoa() {
        
        for(int i=0;i<ds.size();++i){
             SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
             String d1="20/03/2000";
             
             try{
                 Date day1=s.parse(d1);
                Date day2=s.parse(ds.get(i).ngaynhaphang);
            
            if(day2.before(day1)){
                ds.remove(i);
            }
             }catch(Exception e){
                 System.out.println("Error format date");
             }
            
        }
       
    }
    
    public void sapxep(){
            
        System.out.println("Thiet bi tang dan theo ngay nhap hang:");
            
            Collections.sort(ds, new Comparator<thietbi>() {
            

                @Override
                public int compare(thietbi t1, thietbi t2) {
                        SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
                        String d1=t1.ngaynhaphang;
                        String d2=t2.ngaynhaphang;
                        Date day1 = null;
                        Date day2 = null;
                        try{
                              day1=s.parse(d1);
                               day2=s.parse(d2);
                        }catch(Exception e){
                            System.out.println("loi dinh dang date");
                        }
                             
                            
                             
                             return day2.before(day1)?1:-1;
                        
                        
                       
                        
                      
                }
        });
            xuat_ds();
            
        
    }   
    public void sapxeptien(){
        
            System.out.println("Thiet bi tang dan theo gia tien:");
            Collections.sort(ds, new Comparator<thietbi>() {
            

                @Override
                public int compare(thietbi t1, thietbi t2) {
                        
                             
                            
                             
                             return t1.giatien>t2.giatien ? 1:-1;
                        
                        
                       
                        
                      
                }
        });
            xuat_ds();
            
        
    }
    
}

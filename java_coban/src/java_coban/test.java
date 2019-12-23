/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class test {
    private static Scanner nhap=new Scanner(System.in);
    public static void main(String[]args){
        ArrayList <String> a=new ArrayList <>();
        //nhập danh sách họ tên sinh viên
         
         test t=new test();
        while(true){
            System.out.println("1.Nhập danh sách họ tên:");
            System.out.println("2.Xuất danh sách họ tên:");
            System.out.println("3.Hoán vị ngẫu nhiên các phần tử:");
            System.out.println("4.Sắp xếp giảm dần:");
            System.out.println("5.Sắp xếp A-Z:");
            System.out.println("6.Số lượng tên đã nhập:");
            System.out.println("7.Tìm và xóa họ tên:");
            System.out.println("8.Thoát:");
            int chon=nhap.nextInt();
            switch(chon){
                case 1: t.nhap(a);
                    break;
                case 2:t.xuat(a);
                    break;
                    
                case 3:t.ngaunhien(a);
                    break;
                    
                case 4:t.sapxep_giamdan(a);
                    break;
                case 5:t.sapxep_Apphabet(a);
                    break;
                case 6:t.soluongten(a);
                    break;
                case 7:t.tim_xoa(a);
                case 8: System.exit(0);
                    
            }
            
            
        }
        
        
        
        
       
}
    public void nhap(ArrayList a){
        
        //ArrayList <String> a=new ArrayList <>();
        
        while(true){
            System.out.println("Nhập:");
            
            String s=nhap.nextLine();
            
            a.add(s);
            
            System.out.println("Y/N ?");
            if(nhap.nextLine().equals("N")){
                break;
            }
            
        }
        
       
    }
    public void xuat(ArrayList a){
        for(int i=0;i<a.size();++i){
            System.out.println(a.get(i));
        }
    }
    public void ngaunhien(ArrayList a){
        Collections.shuffle(a);
        xuat(a);
    }
    public void sapxep_giamdan(ArrayList a){
        Collections.sort(a);
        Collections.reverse(a);
        xuat(a);
        
}
    public void sapxep_Apphabet(ArrayList a){
        Collections.sort(a);
        xuat(a);
    }
    public void soluongten(ArrayList a){
        System.out.println(a.size());
    }
    public void tim_xoa(ArrayList a){
        System.out.println("Nhập họ tên muốn xóa ra khỏi danh sách");
       
        String s=nhap.nextLine();
        a.remove(s);
        
        xuat(a);
    }
}


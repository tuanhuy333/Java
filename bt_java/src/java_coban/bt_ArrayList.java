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
import java.util.Random;
public class bt_ArrayList {
    public static Scanner nhap=new Scanner(System.in);
    
    public static void main(String[]args){
        
        ArrayList <Integer> ds=new ArrayList<>();
        
        
       
    nhap_xuat(ds);
    ds.set(2, 3);
        System.out.println(ds.toString());
     
      // timx(ds);
        
    }
    public static void tao_mang_ngaunhien(ArrayList a){
        
        Random r=new Random();
        System.out.println("nhap so luong cho ArrayList:");
        int n=nhap.nextInt();
        
        for(int i=0;i<n;++i){
            a.add(r.nextInt(4));
        }
        
        
        System.out.println(a.toString());
    }
    public static void nhap_xuat(ArrayList a){
        System.out.println("nhap so luong cho ArrayList:");
        int n=nhap.nextInt();
        
        for(int i=0;i<n;++i){
            a.add(nhap.nextInt());
        }
        
        //xuat
        
            System.out.println(a.toString());
        
    }
    
    public static void sinh_ngaunhien(ArrayList a){
        Random r=new Random();
        for(int i=0;i<10;++i){
            a.add(r.nextInt(100));
        }
        
        System.out.println(a.toString());
        
    }
    public static void them_phantu(ArrayList a){
        System.out.println("nhap so luong phan tu muon them :");
        int n=nhap.nextInt();
        
        for(int i=0;i<n;++i){
            a.add(nhap.nextInt());
        }
        
        System.out.println(a.toString());
    }
    public static void xoa_boiso(ArrayList a){
      
        System.out.println("hay nhap so muon xoa boi so ");
        int n=nhap.nextInt();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<a.size();++i){
            if((int)a.get(i) % n==0){
                b.add((int)a.get(i));
            }
        }
        a.removeAll(b);
        System.out.println(a.toString());
       
    }
    public static void timx(ArrayList a){
        System.out.println("nhap vao mot so de kiem tra co ton tai trong danh sach hay ko ?");
        int x=nhap.nextInt();
        
        if(a.contains(x)){
            System.out.println("co phan tu "+ x+" trong danh sach");
            System.out.println("no o vi tri "+a.indexOf(x));
        }
        else{
            System.out.println("ko co");
        }
    }
}
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
public class QLSV {
    private static Scanner nhap=new Scanner(System.in);
    
    private static ArrayList <sinhvien> sv=new ArrayList<sinhvien>();
    
    public static void main(String[]args){
        
        QLSV ql=new QLSV();
        
        ql.nhap();
                
        ql.xuatdanhsach(ql.getArrayList());
        
        
        
    }
    public void nhap(){
        sinhvien s=new sinhvien();
        
        System.out.println("ho ten ");
        s.set_hoten(nhap.nextLine());
        System.out.println("tuoi ");
        s.set_tuoi(nhap.nextInt());
        
        sv.add(s);
        
    }
    public ArrayList getArrayList(){
        return sv;
    }
    
    public void xuatdanhsach(ArrayList <sinhvien> a){
        for(sinhvien x:a)
        {
            System.out.println(x.hienthi());
        }
    }
    
    public void xuat(){
        sinhvien s=new sinhvien();
        
        
    }
}

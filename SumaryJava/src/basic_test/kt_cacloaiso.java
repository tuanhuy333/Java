/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_test;


import java.util.*;
public class kt_cacloaiso {
    public static void main(String[]args){
        kiemtra a=new kiemtra();
        
        System.out.println("Nhập số để kiểm tra");
        
        Scanner nhap=new Scanner(System.in);
        int n=nhap.nextInt();
        
        if(a.kt_nguyento(n)==1)
        {
            System.out.println("Là số nguyên tố");
        }
        else{
            System.out.println("Không phải số nguyên tố");
        }
    }
}
class kiemtra{
    public int kt_nguyento(int n){
        if(n<2) return 0;
        for(int i=2;i<Math.sqrt(n);++i){
            if(n%i==0) return 0;
        }
        return 1;
    }
    
}

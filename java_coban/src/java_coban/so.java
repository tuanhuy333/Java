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


public class so {
    public static void main(String []args){
        
        
        Scanner nhap=new Scanner (System.in);
        
        phantich_nhantu(21942);
        
        
        
    }
    public static void phantich_nhantu(int n){
        
        int i=2;
        System.out.print(n+" = ");
        if(n==1){
            System.out.println(n);
        }
        else{
            
            while(n != 1){
                if(n%i==0){
                    System.out.print(i+ " x ");
                    n/=i;
                }
                else{
                    i++;
                }
            }
            System.out.println("\b\b");
        }
    }
    public static int tong_chu_so(int n){
        int tong=0;
        
        while(n!=0){
            
            int chuso=n%10;
            tong+=chuso;
            
            n/=10;
        }
        return tong;
    }
    public static int so_chuso(int n){
        int dem=0;
        while(n!=0)
        {
            dem++;
            n/=10;
        }
        return dem;
    }
}

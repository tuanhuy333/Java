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
public class ep_kieu {
    public static void main(String[]args){
        Scanner nhap=new Scanner(System.in);
        
        //ép các kiểu "số"
       int i=9;
        System.out.println("ép kiểu int sang float "+ (float)i);
        
        //ép kiểu string sang int
        String s="100";
        int a=Integer.parseInt(s);
       
        System.out.println("chua ep kieu "+s+20);
        System.out.println("da ep kieu "+(a+20));
        
        //ép kiểu int sang String
        
        int so=20;
        String str=Integer.toString(so);
        
        
        System.out.println("chua ep kieu "+so+20);
        System.out.println("da ep kieu "+(so+20));
        


    }
}

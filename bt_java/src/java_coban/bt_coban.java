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
public class bt_coban {
    public static Scanner nhap=new Scanner(System.in);
    public static void main(String [] args){
        System.out.println(dem_so_chuso(1126));
        
    }
    public static int kt_snt(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);++i){
            if(n % i ==0){
                return 0;
            }
        }
        return 1;
    }
    public static int kt_sohoanchinh(int n){
        int tong=0;
        for(int i=1;i<n;++i){
            if(n % i ==0){
                tong+=i;
            }
        }
        return tong==n ? 1:0;
    }
    public static int kt_sochinhphuong(int n){
        
        float can_2=(float) Math.sqrt(n);
        
        if(can_2 == (int)can_2){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int dem_so_chuso(int n){
        int dem=0;
        
        while(n!=0){
            dem++;
            n/=10;
        }
        return dem;
    }
}

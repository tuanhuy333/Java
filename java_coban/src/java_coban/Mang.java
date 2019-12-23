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
import java.util.Arrays;
import java.util.Scanner;
public class Mang {
    public static Scanner nhap=new Scanner(System.in);
    public static void main(String [] args){
        
        int a[],b[],c[] ;
        int n,m,k,v;
        
        System.out.println("nhap so phan tu cua mang a ");
        n=nhap.nextInt();
        a=nhapmang(n);
        System.out.println(Arrays.toString(a));
        
        System.out.println("nhap so phan tu cua mang b ");
        m=nhap.nextInt();
        b=nhapmang(m);
        System.out.println(Arrays.toString(b));
        
        k=m+n;
        do{
        System.out.println("nhap vi tri chen tai mang a ");
        v=nhap.nextInt();
        }while(v>n || v<0);
        
        c=new int[k];
        
        for(int i=0;i<v;++i){
            c[i]=a[i];
        }
        for(int i=0;i<m;++i){
            c[i+v]=b[i];
        }
        for(int i=v;i<n;++i){
            c[i+m]=a[i];
        }
        System.out.println(Arrays.toString(c));
        
        //tim phan tu xuat hien nhieu nhat
        //System.out.println("phan tu xuat hien nhieu nhat"+phantu_xuathien_nhieunhat(a));
    }
    
    public static int solan_xuathien_1phantu(int a[],int x){
        
        int dem=0;
        for(int i=0;i<a.length;++i){
            if(a[i] == x)dem++;
        }
        return dem;
        
        
    }
    public static int phantu_xuathien_nhieunhat(int a[]){
        
        int b[]=new int [a.length]; // mang chua so lan xuat hien
        
        for(int i=0;i<a.length;++i){
            b[i]=solan_xuathien_1phantu(a,a[i]);
        }
        int max=b[0]; 
        int vt=0;
        for(int i=0;i<b.length;++i){
            
            if(b[i] > max) {
                max=b[i];
                vt=i;
            }
        }
        return a[vt];
    }
    
    // nối mảng b vào mảng a tại vị trí v
    public static int[] nhapmang(int phantu){
       
        
        int a[]=new int[phantu];
        
        for(int i=0;i<phantu;++i){
            a[i]=nhap.nextInt();
        }
        return a;
        
    }
    
}

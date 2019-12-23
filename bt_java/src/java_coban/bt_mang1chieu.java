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
import java.util.Random;

import java.util.Scanner;
public class bt_mang1chieu {
    public static Scanner nhap=new Scanner(System.in);
    
    public static void main(String []args){
        
        
        int x;
        
        System.out.println("nhap so phan tu cua mang:");
        x=nhap.nextInt();
        
        int v[]=new int [x];
        
        
        
        
        tao_mang_ngaunhien(v,x);
        xuat_mang(v,x);
        
        System.out.println(dem_snt(v,x));
        
        
    }
    public static void nhap_mang1chieu(int a[],int n){
        
        for(int i=0;i<n;++i){
            System.out.println("a["+i+"]=");
            a[i]=nhap.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
    public static int tong_phantu(int a[],int n){
        int tong=0;
        
        for(int i=0;i<n;++i){
            tong+=a[i];
        }
        return tong;
    }
    public static int so_lonnhat(int a[],int n){
        int max=a[0];
        
        for(int i=0;i<n;++i){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void tao_mang_ngaunhien(int a[],int n){
        
        
        
        Random r=new Random();
        
        for(int i=0;i<n;++i){
            a[i]=r.nextInt(10);
        }
        
       
        
    }
    //phan tu xuat hien nhieu nhat
    public static int solan_xuathien_x(int a[],int n,int x){
        int dem=0;
        
        for(int i=0;i<n;++i){
            if(a[i] == x){
                dem++;
            }
        }
        return dem;
    }
    public static void solan_xuathien_nhieunhat(int a[],int n){
        
        int luu_solan[]=new int [10];
        int z=0;
        for(int i=0;i<n;++i){
            luu_solan[z++]= solan_xuathien_x(a,n,a[i]);
        }
        
        int luu_vitri[]=new int [10]; //truong hop co nhieu phan tu co so lan xuat hien nhieu nhat
        int t=0;
        int max=0;
        for(int i=0;i<z;++i){
            if( luu_solan[i] > max){
                max = luu_solan[i]; 
                t=i;
            }
        }
        System.out.println("số lần xuất hiện nhiều nhất:"+max);
        System.out.println("phann tu do la:"+a[t]);
        
        //PHAN TU CO SO LAN XUAT HIEN NHIEU NHAT
        
        
    }
    public static int kt_snt(int n){
        if(n<2) {return 0;}
        for(int i=2;i <= Math.sqrt(n) ; ++i ){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static int dem_snt(int a[],int n){
        int dem=0;
        for(int i=0;i<n;++i){
            if(kt_snt(a[i]) == 1)
            {
                dem++;
            }
        }
        return dem;
        
    }
    public static void xoa_phantu_trung(int a[],int n){
        for(int i=0;i<n-1;i++)

    {
		for( int j=i+1;j<n;j++)

        {
			if (a[i]==a[j])

        	{

            	for(int k=j;k<n-1;k++)

            		{a[k]=a[k+1];}

				n--;
            
            	j--;
        	}

        }
    }
        
       
	
    }
    public static void xuat_mang(int a[],int n){
        
        for(int i=0;i<n;++i){
            
            System.out.print(a[i]+" ");
        }
    }
}

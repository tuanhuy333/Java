/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_quaivat;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class convat {
    protected int ma,sucmanh,x,y;
    
    Scanner nhap=new Scanner(System.in);
    
    
    public abstract void move();
    
    public void nhap(){
        System.out.println("Nhap ma:");
        this.ma=nhap.nextInt();
        System.out.println("Nhap suc manh:");
        this.sucmanh=nhap.nextInt();
        System.out.println("Nhap toa do x:");
        this.x=nhap.nextInt();
        System.out.println("Nhap toa do y:");
        this.y=nhap.nextInt();
    }
    
    public String xuat(){
        return "Ma:"+this.ma+" Suc manh:"+this.sucmanh+" Toa do x:"+this.x+" Toa do y:"+this.y;
    }
    
    
    public abstract int giatri();
}

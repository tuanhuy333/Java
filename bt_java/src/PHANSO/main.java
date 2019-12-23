/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PHANSO;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String[]args){
        
        //test cac phuong thuc trong doi tuong
        phanso ps=new phanso(2,1);
        phanso ps1=new phanso(1,9);
        phanso ps2=new phanso (2,3);
        
        ps1.chia_ps(ps2);
    }
}

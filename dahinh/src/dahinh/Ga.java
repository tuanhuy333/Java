/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

/**
 *
 * @author Administrator
 */
public class Ga extends ConVat {

    private int tuoi;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap tuoi con ga:");
        this.tuoi = nhap.nextInt();
    }

    public String toString() {
        return this.loai + " " + this.tuoi;
    }

    //phuong thuc rieng
    public String tiengkeu() {
        return "gagagagag";
    }
}

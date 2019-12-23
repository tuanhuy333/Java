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
public class Cho extends ConVat {

    private int cannang;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap can nang cua cho:");
        this.cannang = nhap.nextInt();
    }

    public String toString() {
        return this.loai + " " + this.cannang;
    }
    //phuong thuc rieng

    public int sochan() {
        return 4;
    }
}

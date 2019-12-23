/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ConVat {

    Scanner nhap = new Scanner(System.in);

    protected int loai;

    public void nhap() {
        System.out.println("Nhap loai:");
        this.loai = nhap.nextInt();

    }

}

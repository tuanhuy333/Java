/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class List_ConVat {

    ArrayList<ConVat> L = new ArrayList<ConVat>();

    Scanner nhap = new Scanner(System.in);

    public void nhapds() {

        while (true) {
            System.out.println("1.Cho");
            System.out.println("2.Ga");

            System.out.println("Moi ban chon ConVat muon nhap:");

            int chon = nhap.nextInt();
            switch (chon) {
                case 1:
                    ConVat a = new Cho();
                    a.nhap();
                    L.add(a);
                    break;
                case 2:
                    ConVat b = new Ga();
                    b.nhap();
                    L.add(b);
                    break;

            }
            if (chon == 3) {
                break;
            }
        }
    }

    public void xuatds() {
        for (int i = 0; i < L.size(); ++i) {
            System.out.println("XUAT DS" + L.get(i).toString());
        }
    }

    public void sochancuacho() {
        ConVat c = new Cho();
        //phai ep kieu cho de lay phuong thuc rieng cua cho
        Cho ch = (Cho) c;

        System.out.println("so chan cua cho:" + ch.sochan());
    }
}

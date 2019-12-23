/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_thietbi;


public class linhkien extends thietbi {
    private String ram;
    private String hdd;
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap Ram :");
        this.ram=nhap.nextLine();
        nhap.nextLine();
        System.out.println("Nhap HDD:");
        this.hdd=nhap.nextLine();
    }
    @Override
    public String xuat(){
        return super.xuat() + " RAM:"+this.ram+" HDD"+this.hdd;
    }
    @Override
    public int theloai(){
        return 2;
    }
}

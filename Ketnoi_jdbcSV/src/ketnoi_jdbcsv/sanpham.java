/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoi_jdbcsv;

/**
 *
 * @author Administrator
 */
public class sanpham {
    private int id;
    private String tensp;
    private String theloai;

    public sanpham(int id, String tensp, String theloai) {
        this.id = id;
        this.tensp = tensp;
        this.theloai = theloai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
    
    
}

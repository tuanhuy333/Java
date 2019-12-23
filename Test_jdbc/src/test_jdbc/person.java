/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_jdbc;

/**
 *
 * @author Administrator
 */
public class person {
    protected int id;

    
    protected String ten;
    protected int diem;
    protected String diachi;
    
    public person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int sdt) {
        this.diem = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public person(int id, String ten, int sdt, String diachi) {
        this.id = id;
        this.ten = ten;
        this.diem = sdt;
        this.diachi = diachi;
    }
    
}

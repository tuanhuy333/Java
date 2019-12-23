/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindmap_java;

/**
 *
 * @author Administrator
 */
public class connguoi {
    protected int id;
    protected String ten;
    protected Boolean gioitinh;
    public connguoi(){
        
    }
    public connguoi(int id, String ten, Boolean gioitinh) {
        this.id = id;
        this.ten = ten;
        this.gioitinh = gioitinh;
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

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    protected void test(){
        System.out.println("das");
    }
    
}

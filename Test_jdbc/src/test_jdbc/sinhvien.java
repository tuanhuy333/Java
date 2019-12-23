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
public class sinhvien {
    protected String tensv;
    protected int masv;
    protected String quequan;
    protected Float diemso;

    public sinhvien() {
    }

    

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public float getDiemso() {
        return diemso;
    }

    public void setDiemso(float diemso) {
        this.diemso = diemso;
    }

    public sinhvien(String tensv, int masv, String quequan, float diemso) {
        this.tensv = tensv;
        this.masv = masv;
        this.quequan = quequan;
        this.diemso = diemso;
    }
    
    public String xuat(){
        return this.tensv+this.masv+this.diemso+this.quequan;
    }
}

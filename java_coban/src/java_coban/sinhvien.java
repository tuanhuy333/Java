/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban;

/**
 *
 * @author Administrator
 */
public class sinhvien {
    public String hoten;
    public int tuoi;
    
    public sinhvien(){};
    
    public sinhvien(String hoten,int tuoi){
        this.hoten=hoten;
        this.tuoi=tuoi;
    }
    
    public void set_hoten(String hoten){
        this.hoten=hoten;
    }
    public String get_hoten(){
        return this.hoten;
    }
    public void set_tuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public int get_tuoi(){
        return this.tuoi;
    }
    public String hienthi(){
        
        return hoten +tuoi;
    }
}

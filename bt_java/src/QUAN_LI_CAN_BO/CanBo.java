/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUAN_LI_CAN_BO;

/**
 *
 * @author Administrator
 */
public class CanBo implements CB {
    public String hoten;
    public int namsinh;
    public String gioitinh;
    public String diachi;
    
    
    public CanBo(){
        hoten="";
        namsinh=0;
        gioitinh="";
        diachi="";
    }
    
    //getter and setter
    public void setHoten(String hoten){
        this.hoten=hoten;
    }
    public void setNamsinh(int namsinh){
        this.namsinh=namsinh;
    }
    public void setGioitinh(String gioitinh){
        this.gioitinh=gioitinh;
    }
    public void setDiachi(String diachi){
        this.diachi=diachi;
    }
    public String getHoten(){
        return hoten;
    }
    public int getNamsinh(){
        return namsinh;
    }
    public String getGiotinh(){
        return gioitinh;
    }
    public String getDiachi(){
        return diachi;
    }
    
    
    @Override
    public String hienthi(){
        return(hoten + " " +namsinh +" " +gioitinh+ " "+diachi+" ");
    }
}

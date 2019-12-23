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
public class NhanVien extends CanBo{
    public String congviec;
    
    public NhanVien(){
        congviec="";
    }
    public void setCongviec(String congviec){
        this.congviec=congviec;
    }
    public String getCongviec(){
        return congviec;
    }
    
    @Override
    public String hienthi(){
        return(super.hienthi()+ congviec);
    }
}

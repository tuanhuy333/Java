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
public class CongNhan extends CanBo{
    public String capbac;
    
    public CongNhan(){
        capbac="";
    }
    public void setCapbac(String capbac){
        this.capbac=capbac;
    }
    public String getCapbac(){
        return capbac;
    }
    @Override
    public String hienthi(){
        return(super.hienthi()+capbac);
    }
}

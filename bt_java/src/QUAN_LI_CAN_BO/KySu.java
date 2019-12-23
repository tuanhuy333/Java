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
public class KySu extends CanBo{
    public String nganhdaotao;
    
    public KySu(){
        nganhdaotao="";
    }
    
    public void setNganhdaotao(String nganhdaotao){
        this.nganhdaotao=nganhdaotao;
    }
    public String getNganhdaotao(){
        return nganhdaotao;
    }
    
    @Override
    public String hienthi(){
        return(super.hienthi()+nganhdaotao);
    }
}

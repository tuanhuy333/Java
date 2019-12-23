/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_thietbi;

/**
 *
 * @author Administrator
 */
public class main {
    public static void main(String []args){
        
        danhsach_thietbi ds=new danhsach_thietbi();
        
        
        ds.nhap_ds();
        ds.xuat_ds();
        ds.thietbi_dattiennhat();
        //ds.xoa();
        ds.sapxep();
        ds.sapxeptien();
        ds.xuat_ds();
    }
}

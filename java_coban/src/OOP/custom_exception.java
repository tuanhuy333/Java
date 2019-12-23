/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class custom_exception {
    public static void main(String []args){
        
        try{
            int tuoi=nhap_tuoi();
            System.out.println(" tuoi da nhap "+tuoi);
        }catch(kiemtra_tuoi e){
            System.out.println(e.getMessage());
        }
        
    }
    
    //ham nhap so
    public static int nhap_tuoi()throws kiemtra_tuoi{
        Scanner nhap=new Scanner(System.in);
        
        
        int tuoi;
        try{
            System.out.println("nhap tuoi nhan vien ");
            tuoi=nhap.nextInt();
            if(tuoi <0) throw new kiemtra_tuoi("tuoi phai lon hon 0");
        }
        catch(InputMismatchException e){
            throw new kiemtra_tuoi("tuoi nhap vao phai la so nguyen");
        }
        
        
        return tuoi;
                
    }
}
class kiemtra_tuoi extends Exception{
    
    //khoi tao contructor
    public kiemtra_tuoi(String message){
        super(message);
    }
    
    @Override 
    public String getMessage(){
        return "loi nhap mot so "+super.getMessage();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoadaptermain;

/**
 *
 * @author Administrator
 */
public class CheckNumberAdaptee {
    
    //kiểm tra chuỗi có là phải là số
   public boolean checkNumber(String s){
       
       String regex="[0-9]+";
       
       
       return s.matches(regex);
   }
}

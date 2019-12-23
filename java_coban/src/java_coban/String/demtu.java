/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban.String;

/**
 *
 * @author Administrator
 */
public class demtu {
    public static void main(String []args){
        
        String s="chua bao gio toi chiu co gang den cuoi cung";
        int dem=1;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)==' ')
            {
                dem++;
            }
        }
        System.out.println("so tu "+ dem);
    }
}

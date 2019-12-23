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

//client muốn kt sđt nhưng adaptee chỉ có kt số 
//nên client không thể dùng trực tiếp adaptee mà phải nhờ adapter
public class Adapter implements PhoneTarget{
    
    CheckNumberAdaptee adaptee;

    public Adapter(CheckNumberAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    
    
    @Override
    public boolean checkPhoneNumber(String s) {
        
        //nếu ko phải số
       if( !adaptee.checkNumber(s)  ){
           return false;
       }
       
       //đk là sđt
       if(s.length() > 11 || s.length() < 10){
           return false;
       }
       return true;
    }
    
}
//Hay ta có thể hiểu đơn giản, đối với Object Adapter Pattern, ta sẽ sử dụng một đối tượng Adapter để “mặc” (wrap) 
//cho đối tượng Adaptee một “bộ áo mới” (giao diện mới). 
//Nếu tưởng tượng Adaptee là một người, thì Adapter chỉnh là bộ đồ, khi Adaptee “mặc” lên mình Adapter
//thì Adaptee (lúc này là người) sẽ có một vẻ bề ngoài (giao diện) khác.
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

class Animal{
    void loai(){
        System.out.println("dong vat");
    }
}
class dog extends Animal{
    void sua(){
        System.out.println("gau gau");
    }
}
class cat extends Animal{
    void keu(){
        System.out.println("meo meo");
    }
}
class mucdog extends dog{
    void maulong(){
        System.out.println("co long mau den");
    }
}
public class kethua_Inheritance {
    public static void main(String[]args){
        
        //đơn kế thừa
        System.out.println("1.đơn kế thừa:");
        dog d=new dog();
        d.sua();
        
        //kế thừa nhiều cấp
        
        System.out.println("2.kế thừa nhiều cấp:");
        mucdog Md=new mucdog();
        Md.loai();
        Md.sua();
        
        //kế thừa thứ bậc
        
        System.out.println("3.kế thừa thứ bậc:");
        
        cat c=new cat();
        
        c.loai();
        c.keu();
        //c.sua();  compile error
        
    }
}

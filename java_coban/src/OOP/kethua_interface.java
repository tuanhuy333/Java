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
interface interface_cha{
    void chung();
}

interface interface_con extends interface_cha{
    void rieng();
}

class A implements interface_con{
    public void chung(){
        System.out.println("thuoc tinh chung cua interface");
    }
    public void rieng(){
        System.out.println("thuoc tinh rieng");
    }
    
    public static void main(String [ ] args){
        
        A a=new A();
        
        a.rieng();
        a.chung();

    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovd;

/**
 *
 * @author Administrator
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        adaptee.specificRequest();
        Target target=new Adapter(new Adaptee());
        target.request();
        
    }
    
}

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
public class Adapter implements Target{
    
    Adaptee adaptee; //thể hiện của adaptee

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void request() {
        adaptee.specificRequest();
    }
    
}

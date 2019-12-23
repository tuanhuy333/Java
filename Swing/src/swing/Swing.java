/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Administrator
 */
public class Swing {

    JFrame JF;
    JButton btn;
    
    
    public void create(){
        btn =new JButton("Click");
        JF =new JFrame("Giao dien");
        JF.setSize(400, 500);
        btn.setSize(50, 100);
      
        
        
        
        JF.add(btn);
       
        
        
        
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setLocationRelativeTo(null); //hien thi chinh giua man hinh
        JF.setVisible(true);//hien thi len
    }
    
    public static void main(String[] args) {
       
        Swing s=new Swing();
        s.create();
    }
    
}

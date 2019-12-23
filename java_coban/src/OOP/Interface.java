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

//Interface giống là một giao diện gồm các phương thức mà khi các lớp khác implements phải thực hiện
interface printable{
    void nhap();
    void tinhtoan();
    void xuat();
}

class congviec implements printable{
    public void nhap(){
        System.out.println("nhap thong tin");
    }
    public void tinhtoan(){
        System.out.println("tinh toan so lieu");
    }
    public void xuat(){
        System.out.println("xuat thong tin");
    }
    public static void main(String[] args){
        congviec a=new congviec();
        
        a.xuat();
        a.tinhtoan();
    }
        
}




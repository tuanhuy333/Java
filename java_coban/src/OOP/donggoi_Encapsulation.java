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
//tính đóng gói là sử dụng phương thức setter getter để khởi tạo và xuất đối tượng
class sinhvien{
        String name;
        int tuoi;
        int diem;
        
        public void setName(String name){
            this.name=name;
        }   
        
        public String getName(){
            return this.name;
        }
        public void setTuoi(int tuoi){
            this.tuoi=tuoi;
        }
        public int getTuoi(){
            return this.tuoi;
        }
        public void setDiem(int diem){
            this.diem=diem;
        }
        public int getDiem(){
            return this.diem;
        }}

public class donggoi_Encapsulation {
    

    public static void main(String[]args){
        
        sinhvien sv1=new sinhvien();
        sv1.setName("thanh");
        sv1.setTuoi(19);
        
        System.out.println("ten:"+sv1.getName()+" tuoi: "+sv1.getTuoi());
    }
}

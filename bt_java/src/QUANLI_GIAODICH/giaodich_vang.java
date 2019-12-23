/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUANLI_GIAODICH;

/**
 *
 * @author Administrator
 */
public class giaodich_vang extends giaodich{
    private String loaivang;
    
    //setter 
    public void set_loaivang(String loaivang){
        this.loaivang=loaivang;
    }
    
    //getter
    public String get_loaivang(){
        return this.loaivang;
    }
    
    //contructor
    
    public giaodich_vang(){
        super();
        this.loaivang="";
    }
    public giaodich_vang(int ma_giaodich,String ngay_giaodich,int soluong,double dongia,double thanhtien,String loaivang){
        super(ma_giaodich, ngay_giaodich, soluong, dongia, thanhtien);
        this.loaivang=loaivang;
    }
    
    public double thanhtien(){
        
        return this.thanhtien=this.dongia * this.soluong;
    }
    //nhap 
    @Override
    public void nhap(){
        
        super.nhap();
        nhap.nextLine();
        System.out.println("Loai vang:");
        this.loaivang=nhap.nextLine();
    }
    
    @Override
    public String xuat(){
        
        return "GIAO DICH VANG: "+super.xuat() + " loai vang"+this.loaivang+" thanh tien:"+this.thanhtien();
        
        
        
    }
}

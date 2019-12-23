/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUAN_LI_CAN_BO;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
public class QLCB {
    private  ArrayList <CB> l;
    private static Scanner  nhap=new Scanner(System.in);
    public QLCB(){
        l=new ArrayList();
    }
    
    public ArrayList getArrayList(){
        return l;
    }
    
    public void showmenu(){
        System.out.println("-------Quan ly can bo-------");
        System.out.println("1.Nhap thong tin cong nhan");
        System.out.println("2.Nhap thong tin ky su");
        System.out.println("3.Nhap thong tin nhan vien");
        System.out.println("4.Tim kiem theo ho ten");
        System.out.println("5.Hien thi thong tin");
        System.out.println("6.Thoat");
    }
    public static void main(String[] args) {
        QLCB ql=new QLCB();
        
        
        
        
        
        
        
        
        do{
            ql.showmenu();
            int  so=nhap.nextInt();
            
        switch(so){
            case 1:
                ql.nhapCongnhan();
                break;
            case 2:
                ql.nhapKysu();
                break;
            case 3:
                ql.nhapNhanVien();
                break;
            case 4:
                
                break;
            case 5:
                ql.hienthithongtin(ql.getArrayList());
                break;
            
            case 6:System.exit(0);
                break;
            default:System.out.println("Khong co chuc nang nay");
        }
        }while(true);
    }
    
    public CanBo nhapCanbo(){
           CanBo cb=new CanBo();
           
           System.out.println("Ho ten :");
           cb.setHoten(nhap.next());
           
           System.out.println("Nam sinh :");
           cb.setNamsinh(nhap.nextInt());
           System.out.println("Gioi tinh :");
           cb.setGioitinh(nhap.next());
           System.out.println("Dia chi :");
           cb.setDiachi(nhap.next());
           return cb;
    }
    public void nhapCongnhan(){
            CanBo cb=nhapCanbo();
            CongNhan cn=new CongNhan();
            
            System.out.println("Cap bac :");
            cn.setCapbac(nhap.next());
            cn.setHoten(cb.getHoten());
            cn.setNamsinh(cb.getNamsinh());
            cn.setGioitinh(cb.getGiotinh());
            cn.setDiachi(cb.getDiachi());
            l.add(cn);
    }
    public void nhapKysu(){
            CanBo cb=nhapCanbo();
            KySu ks=new KySu();
            
            System.out.println("Nganh dao tao :");
            ks.setNganhdaotao(nhap.next());
            ks.setHoten(cb.getHoten());
            ks.setNamsinh(cb.getNamsinh());
            ks.setGioitinh(cb.getGiotinh());
            ks.setDiachi(cb.getDiachi());
            l.add(ks);
    }
    public void nhapNhanVien(){
            CanBo cb=nhapCanbo();
            NhanVien nv=new NhanVien();
            
            System.out.println("Cong viec :");
            nv.setCongviec(nhap.nextLine());
            nv.setHoten(cb.getHoten());
            nv.setNamsinh(cb.getNamsinh());
            nv.setGioitinh(cb.getGiotinh());
            nv.setDiachi(cb.getDiachi());
            l.add(nv);
    }
    public void hienthithongtin(ArrayList <CB> arr){
        System.out.println("Thong tin can bo :");
        System.out.println("hoten: \t nam sinh: \t gioi tinh: \t dia chi: \t cap bac: \t nganh dao tao: \t cong viec:");
        for(CB c :arr){
            System.out.println(c.hienthi());
        }
        System.out.println("");
    }
}

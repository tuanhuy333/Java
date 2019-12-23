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

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class exception {
    public static void main(String[] args) throws IOException {
        
        //TRY-CATCH
        
//        int box_songuyen[]=new int[10];
//         
//        Random r=new Random();
//        
//        for(int i=0;i<10;++i){
//            box_songuyen[i]=r.nextInt(100);
//        }
//        
//        Scanner nhap=new Scanner(System.in);
//        
//        System.out.println("ban muon biet gia tri cua phan tu thu bao nhieu?");
//        int index=nhap.nextInt();
//        try{
//        System.out.println(box_songuyen[index]);
//        }catch(Exception e){
//            System.out.println("ban bi exception"+e );
//            System.out.println("khong co phan tu thu "+index);
//        }


            //FINALLY

//          FileOutputStream out_f=new FileOutputStream("D://test.txt");
//          try{
//              
//              
//              out_f.write(13);
//          }
//          catch(Exception e){
//              e.printStackTrace();
//          }
//          finally{
//              out_f.close();
//          }
            
            try{
                int tuoi=nhap_tuoi();
                System.out.println("tuoi da nhap"+tuoi);
            }
            catch(kiemtratuoi e){
                System.out.println(e.getMessage());
            }
            
            
    }
    
    private static int nhap_tuoi() throws kiemtratuoi//phai co throws nay moi su dung exception do minh tao ra duoc
    {
        
        Scanner nhap =new Scanner(System.in);
        
        System.out.println("nhap tuoi nhan vien");
        int tuoi=0;
        try{
         tuoi=nhap.nextInt();
         if (tuoi<0) throw new kiemtratuoi("tuoi nhap vao lon hon 0");
        }catch (InputMismatchException e){
            throw new kiemtratuoi("tuoi phai la mot so");
        }
        return tuoi;
    }
}
 class kiemtratuoi extends Exception{
     
     
     //contructor
     public kiemtratuoi(String tinnhan){
         super(tinnhan);
     }
     
     @Override
     public String getMessage(){
         return "loi nhap so "+ super.getMessage();
     }
 }

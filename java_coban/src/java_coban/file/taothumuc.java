/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class taothumuc {
    public static void main(String[]args)throws IOException{
        
        File dir=new File("tao thu muc");
        
       
        dir.mkdir();
        
        File f=new File("tao thu muc/ts.txt");
        f.createNewFile();
        FileInputStream fis=new FileInputStream(f);
        FileOutputStream fos=new FileOutputStream(f);
        
        String thongdiep="xin chao moi nguoi";
        fos.write(thongdiep.getBytes());
        
    }
}

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
public class docghi {
    public static void main(String[]args)throws IOException{
       
        File f=new File("data.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileInputStream fis=new FileInputStream(f); 
        
        int c=fis.read();
        
        while(c!=-1){
            System.out.print((char)c);
            c=fis.read();
            
        }
        
        fis.close();
        
        
        FileOutputStream fos=new FileOutputStream(f);
        
        String s="ghi de vao file";
       
        fos.write(s.getBytes());
        //fos.write(s.getBytes());
    }}


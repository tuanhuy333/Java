/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class file {
    public static void main (String []args) throws IOException{
        
        
        Scanner nhap=new Scanner(System.in);
        
        
        
        docfile();
        
        
        
        
        
        
//        File f=new File("ghidulieu.txt");
//        
//        FileWriter fw=new FileWriter(f);
//        BufferedWriter bw=new BufferedWriter(fw);
//        
//        bw.write("sdas");
//        
//        
//        bw.close();
//        fw.close();
        
    }
    public static void ghifile() throws FileNotFoundException{
        FileOutputStream fos=new FileOutputStream("ghidulieu.txt");
        
        PrintWriter pw=new PrintWriter(fos);
        Scanner nhap =new Scanner(System.in);
        
        pw.println(nhap.nextLine());
        pw.println(nhap.nextLine());
        
        pw.close();
    }
    
    public static void docfile() throws FileNotFoundException, IOException{
        
        
        FileReader fr=new FileReader("dulieu.txt");
        BufferedReader br=new BufferedReader(fr); //doc tung dong
        
        String line="";
        line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        fr.close();
        br.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_coban;

import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class string {
    public static void main(String[]args) {
        
        String s="  chu   bao gio   toi  chiu co    gang den     cuoi cung  ";
        String a="nguyen hoang tuan huy";
        String n="toi dang hoc java java la ngon ngu java";
        
        String v="abba";
       
        tokenizer(s);
       
        //System.out.println(dem_chuoi_con(n,"java"));
        
        //System.out.println(dao_nguoc_tu(s));
        //tu_dai_nhat(s);
    }
    
    private static int dem_tu(String a){
        a=xoa_khoang_trang(a);
        int dem=1;
        for(int i=0;i<a.length();++i){
            if( a.charAt(i) ==' ' && a.charAt(i+1) != ' '){
                dem++;
                
            }
        }
        return dem;
    }
    public static String dao_nguoc_chuoi(String str){
        
        //dung StringBuffer hoac StringBuilder
        
        StringBuffer s=new StringBuffer(str);
        
        return s.reverse().toString();
    }
    public static String dao_nguoc_tu(String str){
        
        str=xoa_khoang_trang(str);
        
        String temp[];
        
        temp=str.split("\\s");
        String str_out="";
        for(int i=temp.length-1;i>=0;--i){
            str_out += temp[i];
            str_out+=" ";
        }
        return str_out;
    }
    public static String xoa_khoang_trang(String str){
        
        
        str = str.trim();
        str=str.replaceAll("\\s+", " ");
        return str;
    }
    public static String viet_hoa_chu_cai_dau(String str){
        
        str=xoa_khoang_trang(str);
        
        String temp[]; //mang String
        
        temp=str.split("\\s");
        
        String str_out="";
        
        for(int i=0;i<temp.length;++i){
            
            
            
            
            str_out+= String.valueOf(temp[i].charAt(0)).toUpperCase() +temp[i].substring(1);
            
            str_out += " ";
        } 
        return str_out;
    }
    
    public static void tu_dai_nhat(String str){ //tu dai nhat dau tien trong chuoi
        
        str=xoa_khoang_trang(str);
        
        String temp[];
        temp=str.split(" ");
        
        int max=0;
        int vitri=0;
        for(int i=0;i<temp.length;++i){
            if(temp[i].length() >= max){ //neu them dau bang thi la "tu dai nhat cuoi cung chuoi"
                max=temp[i].length();
                vitri=i;
            }
        }
        System.out.println(temp[vitri]);
        System.out.println("so ky tu "+max);
    }
    
    public static int dem_chuoi_con(String str,String chuoi_con){
        
        int dem=0;
        
        str=xoa_khoang_trang(str);
        
        String temp[];
        
        
        temp=str.split(" ");
        
        for(int i=0;i<temp.length;++i){
            
            if(temp[i].compareTo(chuoi_con)==0){
                dem++;
            }
        }
        
        
        
        return dem;
    }
    
    public static String[] sap_xep_alphabet(String str){
        
        
        str=xoa_khoang_trang(str);
        
        String temp[];
        temp=str.split(" ");
        
        for(int i=0;i<temp.length-1;++i){
            for(int j=i+1;j<temp.length;++j){
                if(temp[i].compareToIgnoreCase(temp[j]) >0){ //chuoi 1 lon hon chuoi 2
                    String temp1=temp[i];
                           temp[i]=temp[j];
                           temp[j]=temp1;
                }
            }
        }
        return temp;//xuat ra mang String
        
        //duyet mang string roi xuat ra
        
//        for(String v:sap_xep_alphabet(n)){
//            System.out.println(v);
//        }
        
        
        
        
           //chuyen ham thanh void (khoi can lam tren main)
           
//        for(String c:temp){
//            System.out.print(c+" ");
//        }
    }
    public static char[] tach_mang_ky_tu_khong_khoang_trang(String str){
        str=xoa_khoang_trang(str);
        
        str=str.replaceAll(" ", "");
        char c[];
        c=str.toCharArray();
        
        return c;
        
    }
    public static int kt_chuoi_doi_xung(String str){
        
        char c[];
        c=str.toCharArray();
        
        int i=0, j=c.length-1;
        
        while(i<j){
            if(c[i++] != c[j--]){
                return 0;
            }
        }
        return 1;
    }
    
    public static String ten_ho_dem(String str){
        
        //vd : phan tran hoang thai
        //result : thai phan tran hoang
        
        str=xoa_khoang_trang(str);
        
        
        String temp[];
        
        temp=str.split(" ");
        
        String str_out1="";
        String str_out="";
        
        for(int i=1;i<temp.length-1;++i){
            str_out1 += temp[i];
            str_out1 += " ";
        }   
        
        str_out=temp[temp.length-1]+" "+temp[0]+" "+str_out1;
            
        
        return str_out;
           
              
    } 
    public static void tokenizer(String str){
        
        StringTokenizer s=new StringTokenizer(str);
        
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
    
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PHANSO;

/**
 *
 * @author Administrator
 */
public class phanso {
    public int tuso;
    public int mauso;
    
    //CONTRUCTOR
    public phanso(int tuso,int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
    }
    
    
    //setter and getter
    public void setTuso(int tuso){
        this.tuso=tuso;
    }
    public int getTuso(){
        return this.tuso;
    }
    public void setMauso(int mauso){
        this.mauso=mauso;
        
    }
    public int getMauso(){
        return this.mauso;
    }
    
    //phuong thuc UCLN kieu default
    int UCLN(int a,int b){
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
            
        }
        return a;
    }
    
    //phuong thuc ps_toigian
    public void ps_toigian(){
        int i=UCLN(this.getTuso(),this.getMauso());
        
        this.setTuso(this.getTuso()/i);
        this.setMauso(this.getMauso()/i);
    }
    
    //phuong thuc cong tru nhan chia phan so
    public void cong_ps(phanso ps){
        int ts=this.tuso * ps.mauso +this.mauso * ps.tuso;
        
                //this.tuso la tu so cua phanso 1
                //ps.tuso la tu so cua phanso  2
                //ps se truyen vao sau
        int ms=this.mauso * ps.mauso;
        
        //tao doi tuong moi
        phanso p=new phanso(ts,ms);
        
        p.ps_toigian();
        
        System.out.println("tong 2 phan so la "+p.tuso +"/" +p.mauso);
    }
    public void tru_ps(phanso ps){
        int ts=this.tuso * ps.mauso -this.mauso * ps.tuso;
        int ms=this.mauso * ps.mauso;
        
        phanso p=new phanso(ts,ms);
        p.ps_toigian();
        
        System.out.println("hieu 2 phan so la "+p.tuso+"/"+p.mauso);
    }
    public void nhan_ps(phanso ps){
        int ts=this.tuso * ps.tuso;
        int ms=this.mauso * ps.mauso;
        
        phanso p=new phanso(ts,ms);
        p.ps_toigian();
        
        System.out.println("tich 2 phan so la "+p.tuso+"/"+p.mauso);
    }
    public void nhan_ps(phanso ps1,phanso ps2){
        int ts= ps1.tuso * ps2.tuso;
        int ms= ps1.mauso * ps2.mauso;
        
        phanso p=new phanso(ts,ms);
        p.ps_toigian();
        
        System.out.println("tich 2 phan so la "+ps1.tuso+"/"+p.mauso);
    }
    public void chia_ps(phanso ps){
        int ts=this.tuso * ps.mauso ;
        int ms=this.mauso * ps.tuso;
        
        phanso p=new phanso(ts,ms);
        p.ps_toigian();
        
        System.out.println("thuong 2 phan so la "+p.tuso+"/"+p.mauso);
    }
    public void chia_ps(phanso ps1,phanso ps2){
        int ts= ps1.tuso * ps2.mauso;
        int ms= ps1.mauso * ps2.tuso;
        
        phanso p=new phanso(ts,ms);
        p.ps_toigian();
        
        System.out.println("thuong 2 phan so la "+ps1.tuso+"/"+p.mauso);
    }
}

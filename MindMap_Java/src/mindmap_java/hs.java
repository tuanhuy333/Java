/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindmap_java;

/**
 *
 * @author Administrator
 */
public class hs extends connguoi{
    int stt;
   private int scmnd;

   public hs() {
       super();
  }

    public hs(int stt, int id, String ten, Boolean gioitinh) {
        super(id, ten, gioitinh);
        this.stt = stt;
    }

    public int getScmnd() {
        return scmnd;
    }
    
    
    
    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    
    
    
}

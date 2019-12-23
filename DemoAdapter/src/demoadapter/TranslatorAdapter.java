/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoadapter;

/**
 *
 * @author Administrator
 */
public class TranslatorAdapter  implements VietnameseTarget{
    
    //tham chiếu thể hiện ( thực thể ) của Adaptee
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    
    //cài đặt target
    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String words) {
        System.out.println("Translated!");
        return "**tiếng nhật**";
    }
    
}

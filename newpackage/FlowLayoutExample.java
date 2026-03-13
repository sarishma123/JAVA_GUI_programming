

//flow layout program:
package newpackage;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setSize(300,300);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        to make the layout on left and the distance between them
        jf.setLayout(new FlowLayout(FlowLayout.LEFT,15,15)); 
        
       JButton b1=new JButton("one");
       JButton b2=new JButton("two");
       JButton b3=new JButton("three");
       
       
       jf.add(b1);
       jf.add(b2);
       jf.add(b3);
       
       jf.setVisible(true); 
        
      
    }
}

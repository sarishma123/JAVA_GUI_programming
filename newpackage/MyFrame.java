
package newpackage;
import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
         JFrame jf= new JFrame("HELLO,WORLD");
         jf.setSize(400,300);
         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
         jf.setResizable(false);
         jf.getContentPane().setBackground(Color.blue);
         jf.setVisible(true);
    }
    
}

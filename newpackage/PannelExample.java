package newpackage;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PannelExample {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setSize(300,300);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // BorderLayout with horizontal and vertical gaps
        jf.setLayout(new BorderLayout(5,5));

        JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
        JButton b4 = new JButton("four");
        JButton b5 = new JButton("five");

        JPanel p1 = new JPanel();

        jf.add(p1, BorderLayout.SOUTH);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        jf.add(b5, BorderLayout.CENTER);

        jf.setVisible(true);
    }
}
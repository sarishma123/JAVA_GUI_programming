import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui implements ActionListener {

    JFrame jf;
    JButton b1, b2;
    JTextField t1;

    Gui() {
        jf = new JFrame();

        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(20);
        b1 = new JButton("OK");
        b2 = new JButton("Clear");

        jf.add(t1);
        jf.add(b1);
        jf.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
                    
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t1.setText("Hello");
        } else if (e.getSource() == b2) {
            t1.setText("");
        }
    }
}
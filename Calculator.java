import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame jf;
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3;

    Calculator() {
        jf = new JFrame("Calculator");

        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

       

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = 0;

            if (e.getSource() == b1)
                c = a + b;
            else if (e.getSource() == b2)
                c = a - b;
            else if (e.getSource() == b3)
                c = a * b;
            else if (e.getSource() == b4) {
                if (b == 0) {
                    t3.setText("Cannot divide by zero");
                    return;
                }
                c = a / b;
            }

            t3.setText(String.valueOf(c));

        } catch (Exception ex) {
            t3.setText("Invalid input");
        }
    }
}
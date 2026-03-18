import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo implements ActionListener {

    JFrame jf;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    Demo() {
        jf = new JFrame("Calculator");

        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");

        jf.add(new JLabel("Enter first number:"));
        jf.add(t1);

        jf.add(new JLabel("Enter second number:"));
        jf.add(t2);

        jf.add(new JLabel("Result:"));
        jf.add(t3);

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
        new Demo();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1) {
                result = num1 + num2;
            } else if (e.getSource() == b2) {
                result = num1 - num2;
            } else if (e.getSource() == b3) {
                result = num1 * num2;
            } else if (e.getSource() == b4) {
                result = num1 / num2;
            }

            t3.setText(String.valueOf(result));

        } catch (Exception ex) {
            t3.setText("Invalid input");
        }
    }
}



import javax.swing.*;
import java.awt.event.*;

public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Name App");

        JLabel l1 = new JLabel("Enter Name:");
        JTextField t1 = new JTextField();
        JButton b = new JButton("Submit");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);
        b.setBounds(100, 100, 100, 30);

        f.add(l1);
        f.add(t1);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                JOptionPane.showMessageDialog(f, "Hello " + name);
            }
        });

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
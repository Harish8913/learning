import javax.swing.*;
import java.awt.event.*;

public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Radio Button");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JButton b = new JButton("Submit");

        r1.setBounds(50, 50, 100, 30);
        r2.setBounds(50, 80, 100, 30);
        b.setBounds(50, 120, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    JOptionPane.showMessageDialog(f, "Male Selected");
                } else if (r2.isSelected()) {
                    JOptionPane.showMessageDialog(f, "Female Selected");
                }
            }
        });

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.event.*;

public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("MY APP");
        JButton b = new JButton("Click");
        JTextField t = new JTextField();
        JLabel l = new JLabel("NAME: ");

        b.setBounds(50, 100, 100, 30);
        l.setBounds(50, 100, 30, 30);
        t.setBounds(50, 50, 100, 40);

        f.add(l);
        f.add(t);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = t.getText();
                JOptionPane.showMessageDialog(f, "Hello " + name);
            }
        });


        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

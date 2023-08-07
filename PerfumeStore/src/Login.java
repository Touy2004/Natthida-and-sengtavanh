
import java.awt.*;
import javax.swing.*;

import main.Loade;

import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1;

    public Login() {

        setBackground(new Color(255, 255, 204));
        setBounds(550, 250, 700, 400);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);

        JLabel la1 = new JLabel(" Perfume Stroe ");
        la1.setForeground(new Color(25, 0, 51));
        la1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        la1.setBounds(480, 180, 650, 24);
        panel.add(la1, BorderLayout.NORTH);

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(80, 89, 95, 24);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(80, 124, 95, 24);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(150, 93, 200, 20);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 128, 190, 20);
        panel.add(passwordField);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i1 = c1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l6 = new JLabel(i2);
        l6.setBounds(400, 25, 300, 300);
        panel.add(l6);

        b1 = new JButton("Log In");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(176, 224, 230));
        b1.setBounds(180, 181, 113, 50);
        panel.add(b1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 204));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);

    }

    public void actionPerformed(ActionEvent ae) {
        new Loade().setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }

}
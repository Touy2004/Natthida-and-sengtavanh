package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Onep extends JFrame implements ActionListener {
    private JButton l7, l8, l9;
    private int counter = 0;
    private JLabel counterLabel;

    public static void main(String[] args) {
        new Onep().setVisible(true);

    }

    Onep() {
        JFrame frame = new JFrame();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dim.width / 2, dim.height / 2);

        setUndecorated(true);
        setBounds(390, 150, 550, 800);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/One.jpg"));
        Image i1 = c1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 550, 450);
        panel.add(l1);

        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/heart.png"));
        Image h2 = h1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel hi1 = new JLabel(h3);
        hi1.setBounds(470, 400, 25, 45);
        panel.add(hi1);
        counterLabel = new JLabel("0");
        counterLabel.setForeground(new Color(255, 102, 102));
        counterLabel.setFont(new Font("Arial", Font.BOLD, 25));
        counterLabel.setBounds(500, 400, 100, 45);
        panel.add(counterLabel);

        JLabel l2 = new JLabel("Les Creations de Monsieur Dior Forever and Ever");
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setBounds(5, 470, 550, 25);
        panel.add(l2);

        JLabel a3 = new JLabel("100mg/ml");
        a3.setForeground(new Color(255, 102, 102));
        a3.setFont(new Font("Tahoma", Font.TYPE1_FONT, 20));
        a3.setBounds(16, 500, 150, 45);
        panel.add(a3);

        JLabel a2 = new JLabel("$" + 138.49);
        a2.setForeground(new Color(255, 102, 102));
        a2.setFont(new Font("Tahoma", Font.TYPE1_FONT, 20));
        a2.setBounds(436, 500, 150, 45);
        panel.add(a2);

        JLabel l3 = new JLabel("    Forever and Ever was presented in 2002 as a sophisticated floral ");
        l3.setFont(new Font("Tahoma", Font.ITALIC, 15));
        l3.setBounds(10, 560, 550, 45);
        panel.add(l3);

        JLabel l4 = new JLabel("composition which leaves a mild, spicy trail in a base. A floral bouquet of ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l4.setBounds(11, 590, 550, 45);
        panel.add(l4);

        JLabel l5 = new JLabel("freesia, jasmine,rose, pelargonium and almond blossom are refreshed with ivy ");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setBounds(11, 620, 570, 45);
        panel.add(l5);

        JLabel l6 = new JLabel("and spiced with nutmeg, vanilla and");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l6.setBounds(11, 650, 570, 45);
        panel.add(l6);

        l7 = new JButton("ADD TO CART");
        l7.addActionListener(this);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l7.setForeground(new Color(255, 255, 255));
        l7.setBackground(new Color(255, 102, 102));
        l7.setBorder(null);
        l7.setBounds(0, 740, 430, 50);
        panel.add(l7);

        l8 = new JButton();
        l8.addActionListener(this);
        l8.setForeground(new Color(255, 255, 255));
        l8.setBackground(new Color(255, 102, 102));
        l8.setBorder(null);
        l8.setBounds(450, 740, 60, 50);
        panel.add(l8);
        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("icons/Picture1.png"));
        Image p2 = p1.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);
        JLabel d5 = new JLabel(p3);
        l8.setLayout(new BorderLayout());
        l8.add(d5, BorderLayout.CENTER);

        l9 = new JButton();
        l9.addActionListener(this);
        l9.setForeground(new Color(255, 255, 255));
        l9.setBorder(null);
        l9.setBounds(485, 10, 40, 50);
        panel.add(l9);
        ImageIcon pa1 = new ImageIcon(ClassLoader.getSystemResource("icons/close.jpg"));
        Image pa2 = pa1.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT);
        ImageIcon pa3 = new ImageIcon(pa2);
        JLabel da5 = new JLabel(pa3);
        l9.setLayout(new BorderLayout());
        l9.add(da5, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent a) {
        try {
            if (a.getSource() == l8) {
                try {
                    counter++;
                    counterLabel.setText(Integer.toString(counter));
                } catch (Exception e) {

                }
            }
            if (a.getSource() == l7) {
                try {

                    new AddtoCart().setVisible(true);
                    dispose();
                } catch (Exception e) {

                }
            }
            if (a.getSource() == l9) {
                try {
                    dispose();
                } catch (Exception e) {

                }
            }

        } catch (Exception e) {

        }
    }

}

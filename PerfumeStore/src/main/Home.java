package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    String[] goods = new String[] { "One.jpg", "Les Creations de  ", "Monsieur Dior Forever and Ever", "DIOR" };
    private JButton panel2, panel3, panel4, panel5, panel6, pl1, pl2, pl3, pl4, pl5, ca, cs;

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

    public Home() {
        super("Natthida and Sengtavanh");
        setLayout(null);
        setBounds(0, 0, 1950, 1900);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel(" Perfume Store ");
        l1.setForeground(new Color(25, 0, 51));
        l1.setFont(new Font("Tahoma", Font.PLAIN, 40));
        l1.setBounds(700, 10, 1000, 100);
        add(l1);
        ImageIcon g1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image g2 = g1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon g3 = new ImageIcon(g2);
        JLabel lo = new JLabel(g3);
        lo.setBorder(null);
        lo.setBounds(960, 8, 80, 100);
        lo.setBackground(new Color(255, 255, 255));
        panel.add(lo);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cart.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        cs = new JButton(i3);
        cs.addActionListener(this);
        cs.setBorder(null);
        cs.setBounds(1700, 35, 70, 70);
        cs.setBackground(new Color(255, 255, 255));
        panel.add(cs);

        ImageIcon ca1 = new ImageIcon(ClassLoader.getSystemResource("icons/cal.jpg"));
        Image ca2 = ca1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon ca3 = new ImageIcon(ca2);
        ca = new JButton(ca3);
        ca.addActionListener(this);
        ca.setBorder(null);
        ca.setBounds(1800, 35, 70, 70);
        ca.setBackground(new Color(255, 255, 255));
        panel.add(ca);

        JLabel l2 = new JLabel("Product");
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));
        l2.setBounds(120, 130, 195, 24);
        panel.add(l2);

        panel2 = new JButton();
        panel2.setBackground(new Color(244, 244, 244));
        panel2.setBounds(90, 200, 204, 293);
        panel2.addActionListener(this);
        panel.add(panel2);
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + goods[0]));
        Image im2 = im1.getImage().getScaledInstance(190, 230, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel l4 = new JLabel(im3);
        panel2.setLayout(new BorderLayout());
        panel2.add(l4, BorderLayout.NORTH);
        JLabel a1 = new JLabel(goods[1]);
        a1.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel2.add(a1, BorderLayout.CENTER);
        JLabel az1 = new JLabel(goods[2]);
        panel2.add(az1, BorderLayout.PAGE_END);

        panel3 = new JButton();
        panel3.addActionListener(this);
        panel3.setBackground(new Color(244, 244, 244));
        panel3.setBounds(390, 200, 204, 293);
        panel.add(panel3);
        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icons/Two.jpg"));
        Image m2 = m1.getImage().getScaledInstance(190, 230, Image.SCALE_DEFAULT);
        ImageIcon m3 = new ImageIcon(m2);
        JLabel l5 = new JLabel(m3);
        panel3.setLayout(new BorderLayout());
        panel3.add(l5, BorderLayout.NORTH);
        JLabel a2 = new JLabel("J'ADORE ");
        a2.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel3.add(a2, BorderLayout.CENTER);
        JLabel az2 = new JLabel("eau de parfum");
        az2.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel3.add(az2, BorderLayout.PAGE_END);

        panel4 = new JButton();
        panel4.addActionListener(this);
        panel4.setBackground(new Color(244, 244, 244));
        panel4.setBounds(690, 200, 204, 293);
        panel.add(panel4);
        ImageIcon mn1 = new ImageIcon(ClassLoader.getSystemResource("icons/Three.png"));
        Image mn2 = mn1.getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT);
        ImageIcon mn3 = new ImageIcon(mn2);
        JLabel l6 = new JLabel(mn3);
        panel4.setLayout(new BorderLayout());
        panel4.add(l6, BorderLayout.PAGE_START);
        JLabel a3 = new JLabel("CHANCE CHANEL");
        a3.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel4.add(a3, BorderLayout.CENTER);

        panel5 = new JButton();
        panel5.addActionListener(this);
        panel5.setBackground(new Color(244, 244, 244));
        panel5.setBounds(990, 200, 204, 293);
        add(panel5);
        ImageIcon n1 = new ImageIcon(ClassLoader.getSystemResource("icons/Four.jpg"));
        Image n2 = n1.getImage().getScaledInstance(170, 240, Image.SCALE_DEFAULT);
        ImageIcon n3 = new ImageIcon(n2);
        JLabel l7 = new JLabel(n3);
        panel5.setLayout(new BorderLayout());
        panel5.add(l7, BorderLayout.NORTH);
        JLabel a4 = new JLabel("             JO MALONE");
        a4.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel5.add(a4, BorderLayout.CENTER);
        JLabel az3 = new JLabel(" Peony & Blush Suede");
        panel5.add(az3, BorderLayout.PAGE_END);

        panel6 = new JButton();
        panel6.addActionListener(this);
        panel6.setBackground(new Color(244, 244, 244));
        panel6.setBounds(1290, 200, 204, 293);
        panel.add(panel6);
        ImageIcon nk1 = new ImageIcon(ClassLoader.getSystemResource("icons/Five.jpg"));
        Image nk2 = nk1.getImage().getScaledInstance(190, 180, Image.SCALE_DEFAULT);
        ImageIcon nk3 = new ImageIcon(nk2);
        JLabel l8 = new JLabel(nk3);
        panel6.setLayout(new BorderLayout());
        panel6.add(l8, BorderLayout.NORTH);
        JLabel a5 = new JLabel("Chanel No 5");
        a5.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel6.add(a5, BorderLayout.WEST);
        JLabel az4 = new JLabel("             Eau de Parfum");
        az4.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel6.add(az4, BorderLayout.SOUTH);

        pl4 = new JButton();
        pl4.addActionListener(this);
        pl4.setBackground(new Color(244, 244, 244));
        pl4.setBounds(1290, 600, 204, 293);
        panel.add(pl4);
        ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/Six.jpg"));
        Image k2 = k1.getImage().getScaledInstance(190, 230, Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel d4 = new JLabel(k3);
        pl4.setLayout(new BorderLayout());
        pl4.add(d4, BorderLayout.NORTH);
        JLabel a6 = new JLabel("DIOR SAUVAGE");
        a6.setFont(new Font("Tahoma", Font.BOLD, 20));
        pl4.add(a6, BorderLayout.CENTER);

        pl1 = new JButton();
        pl1.addActionListener(this);
        pl1.setBackground(new Color(244, 244, 244));
        pl1.setBounds(90, 600, 204, 293);
        panel.add(pl1);
        ImageIcon kl1 = new ImageIcon(ClassLoader.getSystemResource("icons/Seven.jpg"));
        Image kl2 = kl1.getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT);
        ImageIcon kl3 = new ImageIcon(kl2);
        JLabel d1 = new JLabel(kl3);
        pl1.setLayout(new BorderLayout());
        pl1.add(d1, BorderLayout.NORTH);
        JLabel a7 = new JLabel("VILLAIN HYDRA");
        a7.setFont(new Font("Tahoma", Font.BOLD, 20));
        pl1.add(a7, BorderLayout.CENTER);
        JLabel az7 = new JLabel("   Eau de Parfum");
        az7.setFont(new Font("Tahoma", Font.ITALIC, 20));
        pl1.add(az7, BorderLayout.SOUTH);

        pl2 = new JButton();
        pl2.addActionListener(this);
        pl2.setBackground(new Color(244, 244, 244));
        pl2.setBounds(390, 600, 204, 293);
        panel.add(pl2);
        ImageIcon q1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image q2 = q1.getImage().getScaledInstance(190, 230, Image.SCALE_DEFAULT);
        ImageIcon q3 = new ImageIcon(q2);
        JLabel d2 = new JLabel(q3);
        pl2.setLayout(new BorderLayout());
        pl2.add(d2, BorderLayout.NORTH);
        JLabel a8 = new JLabel("      Chloe.");
        a8.setFont(new Font("Tahoma", Font.BOLD, 25));
        pl2.add(a8, BorderLayout.CENTER);

        pl3 = new JButton();
        pl3.addActionListener(this);
        pl3.setBackground(new Color(244, 244, 244));
        pl3.setBounds(690, 600, 204, 293);
        panel.add(pl3);
        ImageIcon qa1 = new ImageIcon(ClassLoader.getSystemResource("icons/nine.jpg"));
        Image qa2 = qa1.getImage().getScaledInstance(150, 230, Image.SCALE_DEFAULT);
        ImageIcon qa3 = new ImageIcon(qa2);
        JLabel d3 = new JLabel(qa3);
        pl3.setLayout(new BorderLayout());
        pl3.add(d3, BorderLayout.NORTH);
        JLabel a9 = new JLabel("COCO NOIR CHANEL");
        a9.setFont(new Font("Tahoma", Font.ITALIC, 20));
        pl3.add(a9, BorderLayout.AFTER_LINE_ENDS);

        pl5 = new JButton();
        pl5.addActionListener(this);
        pl5.setBackground(new Color(244, 244, 244));
        pl5.setBounds(990, 600, 204, 293);
        panel.add(pl5);
        ImageIcon qb1 = new ImageIcon(ClassLoader.getSystemResource("icons/ten.jpg"));
        Image qb2 = qb1.getImage().getScaledInstance(190, 220, Image.SCALE_DEFAULT);
        ImageIcon qb3 = new ImageIcon(qb2);
        JLabel d5 = new JLabel(qb3);
        pl5.setLayout(new BorderLayout());
        pl5.add(d5, BorderLayout.NORTH);
        JLabel a10 = new JLabel(" Chanel Bleu De Chanel ");
        a10.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl5.add(a10, BorderLayout.CENTER);
        JLabel az6 = new JLabel("  Eau de Parfum SPRAY");
        az6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        pl5.add(az6, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == panel2) {
                try {
                    new Onep().setVisible(true);

                    try {

                    } catch (Exception e) {

                    }
                } catch (Exception e) {
                    // Onep.dispose();
                }
            }
            if (ae.getSource() == panel3) {
                try {
                    new Twop().setVisible(true);

                } catch (Exception e) {

                }
            }

            if (ae.getSource() == panel4) {
                try {
                    new Three().setVisible(true);

                    new Four().setVisible(false);

                } catch (Exception e) {

                }
            }
            if (ae.getSource() == panel5) {
                try {
                    new Four().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == panel6) {
                try {
                    new Five().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == pl4) {
                try {
                    new Six().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == pl1) {
                try {
                    new Seven().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == pl2) {
                try {
                    new Eight().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == pl3) {
                try {
                    new Nine().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == pl5) {
                try {
                    new Ten().setVisible(true);

                } catch (Exception e) {
                }
            }
            if (ae.getSource() == ca) {
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception e) {
                }
            }
            if (ae.getSource() == cs) {
                try {
                    new cart().setVisible(true);
                } catch (Exception e) {
                }
            }

        } catch (Exception e) {

        }
    }

}
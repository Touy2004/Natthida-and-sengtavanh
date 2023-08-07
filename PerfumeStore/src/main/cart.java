package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cart extends JFrame implements ActionListener {

    private int quantity = 1;
    JPanel l2, panel;
    JLabel l7;
    private JLabel quantityLabel;
    private JButton l3, l9, b1, minusButton, plusButton;

    public static void main(String[] args) {
        new cart().setVisible(true);

    }

    cart() {
        setUndecorated(true);
        setBounds(1580, 150, 350, 1500);

        panel = new JPanel();
        panel.setBackground(new Color(204, 229, 255));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel(" Your cart ");
        l1.setForeground(new Color(32, 32, 32));
        l1.setFont(new Font("Tahoma", Font.BOLD, 20));
        l1.setBounds(15, 55, 200, 45);
        panel.add(l1);

        minusButton = new JButton("-");
        minusButton.setBorder(null);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
        minusButton.setBackground(new Color(255, 255, 255));
        minusButton.setBounds(30, 120, 40, 40);

        quantityLabel = new JLabel(Integer.toString(quantity), JLabel.CENTER);
        quantityLabel.setBounds(30, 165, 40, 40);
        quantityLabel.setBorder(null);

        plusButton = new JButton("+");
        plusButton.setBorder(null);
        plusButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
        plusButton.addActionListener(this);
        plusButton.setBounds(30, 210, 40, 40);
        plusButton.setBackground(new Color(255, 255, 255));

        panel.add(minusButton);
        panel.add(quantityLabel);
        panel.add(plusButton);

        l9 = new JButton();
        l9.addActionListener(this);
        l9.setBackground(new Color(204, 229, 255));
        l9.setBorder(null);
        l9.setBounds(20, 20, 45, 30);
        panel.add(l9);
        ImageIcon pa1 = new ImageIcon(ClassLoader.getSystemResource("icons/leftTurn.png"));
        Image pa2 = pa1.getImage().getScaledInstance(45, 30, Image.SCALE_DEFAULT);
        ImageIcon pa3 = new ImageIcon(pa2);
        JLabel da5 = new JLabel(pa3);
        l9.add(da5);

        b1 = new JButton();
        b1.addActionListener(this);
        b1.setBackground(new Color(224, 102, 102));
        b1.setBorder(null);
        b1.setBounds(285, 120, 20, 20);
        panel.add(b1);
        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("icons/close.png"));
        Image p2 = p1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);
        JLabel d5 = new JLabel(p3);
        b1.add(d5);

        l2 = new JPanel();
        l2.setBackground(new Color(255, 255, 255));
        l2.setBounds(10, 110, 310, 150);
        panel.add(l2);

        JLabel l4 = new JLabel("Not connecting to the database");
        l4.setForeground(new Color(96, 96, 96));
        l4.setFont(new Font("Tahoma", Font.ITALIC, 15));
        l4.setBounds(30, 680, 500, 45);
        panel.add(l4);
        JLabel l5 = new JLabel("not enough information. ");
        l5.setForeground(new Color(96, 96, 96));
        l5.setFont(new Font("Tahoma", Font.ITALIC, 15));
        l5.setBounds(30, 700, 500, 45);
        panel.add(l5);

        JLabel l8 = new JLabel("Total ");
        l8.setForeground(new Color(80, 80, 80));
        l8.setFont(new Font("Tahoma", Font.BOLD, 18));
        l8.setBounds(20, 755, 500, 45);
        panel.add(l8);
        l7 = new JLabel("$");
        l7.setForeground(new Color(80, 80, 80));
        l7.setFont(new Font("Tahoma", Font.BOLD, 18));
        l7.setBounds(250, 755, 500, 45);
        panel.add(l7);

        l3 = new JButton(" Procceed to payment ");
        l3.addActionListener(this);
        l3.setForeground(new Color(32, 32, 32));
        l3.setBackground(new Color(209, 224, 255));
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setBounds(20, 810, 300, 50);
        panel.add(l3);

        JPanel l6 = new JPanel();
        l6.setBackground(new Color(255, 255, 255));
        l6.setBounds(0, 755, 400, 250);
        panel.add(l6);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        String action = a.getActionCommand();

        if (action.equals("-")) {
            if (quantity > 1) {
                quantity--;
            }
        } else if (action.equals("+")) {
            quantity++;
        }
        if (a.getSource() == l9) {
            try {
                dispose();
            } catch (Exception e) {

            }
        }
        if (a.getSource() == b1) {
            try {
                minusButton.setVisible(false);
                plusButton.setVisible(false);
                b1.setVisible(false);
                quantityLabel.setVisible(false);
                l2.setVisible(false);

            } catch (Exception e) {

            }
        }
        if (a.getSource() == l3) {
            try {
                new payment().setVisible(true);
                dispose();
            } catch (Exception e) {

            }
        }
        quantityLabel.setText(Integer.toString(quantity));
    }

}

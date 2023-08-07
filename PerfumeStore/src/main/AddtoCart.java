package main;

import javax.swing.*;
import java.awt.*;

public class AddtoCart extends JFrame implements Runnable {

    private JPanel contentPane;
    private JFrame frame;
    private JProgressBar progressBar;
    int s;
    Thread th;

    public static void main(String[] args) {
        new AddtoCart().setVisible(true);

    }

    public void setUploading() {
        setVisible(false);
        th.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 6000; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    i = 6001;
                    setVisible(false);
                    new cart().setVisible(true);
                    frame.dispose();
                }
                Thread.sleep(40);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    AddtoCart() {
        th = new Thread((Runnable) this);

        setBounds(750, 300, 400, 350);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130, 135, 300, 25);

        JLabel a3 = new JLabel("Successfully");
        a3.setForeground(new Color(255, 204, 51));
        a3.setFont(new Font("Tahoma", Font.BOLD, 30));
        a3.setBounds(110, 25, 300, 45);
        contentPane.add(a3);

        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/scc.jpg"));
        Image h2 = h1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel hi1 = new JLabel(h3);
        hi1.setBounds(110, 75, 170, 170);
        contentPane.add(hi1);

        JLabel a1 = new JLabel("The perfume has been added to cart.");
        a1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        a1.setBounds(25, 250, 700, 20);
        contentPane.add(a1);

        JLabel a2 = new JLabel("Go check it out in your cart and pay for perfume! <3");
        a2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        a2.setBounds(25, 280, 700, 20);
        contentPane.add(a2);

        JLabel a4 = new JLabel("- HERE's AROMA -");
        a4.setForeground(new Color(128, 128, 128));
        a4.setFont(new Font("Tahoma", Font.ITALIC, 12));
        a4.setBounds(152, 310, 700, 20);
        contentPane.add(a4);

        setContentPane(contentPane);
        setUndecorated(true);
        setUploading();
    }
}

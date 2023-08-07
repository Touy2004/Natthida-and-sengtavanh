package main;

import javax.swing.*;
import java.awt.*;

public class payment extends JFrame implements Runnable {

    private JPanel contentPane;
    private JFrame frame;
    private JProgressBar progressBar;
    int s;
    Thread th;

    public static void main(String[] args) {
        new payment().setVisible(true);

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
                    frame.dispose();

                }
                Thread.sleep(40);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    payment() {
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

        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/thanks.jpg"));
        Image h2 = h1.getImage().getScaledInstance(400, 350, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel hi1 = new JLabel(h3);
        hi1.setBounds(0, 0, 400, 350);
        contentPane.add(hi1);

        setContentPane(contentPane);
        setUndecorated(true);
        setUploading();
    }
}

package view;

import model.Semaphore;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 23.04.2017.
 */
public class SemaphoreWindow extends JFrame{

    Semaphore semaphore;

    public SemaphoreWindow(Semaphore semaphore) {
        this.semaphore = semaphore;
    }


    public void init(){
        setTitle("Светофор");
        setSize(100,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu start = new JMenu("START");
        JMenu stop = new JMenu("STOP");

        jMenuBar.add(start);
        jMenuBar.add(stop);

        stop.addActionListener(e -> {
            System.out.println("click");
            System.exit(0);
        });

        start.addActionListener(e -> {
            System.out.println("start");
            try {
                semaphore.start();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }

        });

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,1));
        JButton greenButton = new JButton();
        JButton yellowButton = new JButton();
        JButton redButton = new JButton();
        greenButton.setBackground(Color.GREEN);
//        if (semaphore.greenLight) greenButton.setBackground(Color.GREEN);
//        else greenButton.setBackground(Color.WHITE);
//        if (semaphore.yellowLight) yellowButton.setBackground(Color.YELLOW);
//        else yellowButton.setBackground(Color.WHITE);
//        if (semaphore.redLight) redButton.setBackground(Color.RED);
//        else redButton.setBackground(Color.WHITE);

        jPanel.add(redButton);
        jPanel.add(yellowButton);
        jPanel.add(greenButton);

        add(jPanel);


        setJMenuBar(jMenuBar);

        setVisible(true);
    }
}


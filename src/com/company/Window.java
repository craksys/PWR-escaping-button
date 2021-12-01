package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JPanel implements MouseListener, ActionListener {
    short i,x =1;
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Aplikacja");

    JButton check = new JButton("Press");
    JButton clear = new JButton("Reset");


    public Window(){
       check.addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {

           }

           @Override
           public void mousePressed(MouseEvent e) {

           }

           @Override
           public void mouseReleased(MouseEvent e) {

           }

           @Override
           public void mouseEntered(MouseEvent e) {

               if(i<15) {
                   check.setBounds(0, 281-(i*20), 90, 20);
                   i++;
               }else{
                   switch(x){
                       case 1: check.setBounds(50, 30, 90, 20);
                       x++;
                       break;
                       case 2:
                           check.setBounds(220, 30, 90, 20);
                           x++;
                           break;
                       case 3: check.setBounds(100, 80, 90, 20);
                           x++;
                           break;
                       case 4: check.setBounds(200, 20, 90, 20);
                           x++;
                           break;
                       case 5: check.setBounds(150, 150, 90, 20);
                           x=1;
                           break;
                   }

               }

           }

           @Override
           public void mouseExited(MouseEvent e) {

           }

       });
        clear.addActionListener(this);
    }


    public void windowopen (){

        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        check.setBounds(0,281,90,20);
        panel.add(check);

        clear.setBounds(480,281,90,20);
        panel.add(clear);


        frame.setLocation(400,100);
        frame.setPreferredSize(new Dimension(580, 340));
        frame.pack();
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        check.setBounds(0,281,90,20);
        i=1;
    }

//

}


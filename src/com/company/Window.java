package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JPanel implements MouseMotionListener, ActionListener,KeyListener {
    private char figure;
    private short x1,y1;
    private short i, x = 1;
    private boolean ok = true;

    JFrame frame = new JFrame("Aplikacja");
    JButton check = new JButton("Press");
    JButton clear = new JButton("Reset");


    public Window() {
        check.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (e.getX() <70) {

                    if (i < 15) {
                        check.setBounds(0, 281 - (i * 20), 90, 20);
                        i++;
                    } else {
                        switch (x) {
                            case 1:
                                check.setBounds(50, 30, 90, 20);
                                x++;
                                break;
                            case 2:
                                check.setBounds(220, 30, 90, 20);
                                x++;
                                break;
                            case 3:
                                check.setBounds(100, 80, 90, 20);
                                x++;
                                break;
                            case 4:
                                check.setBounds(200, 20, 90, 20);
                                x++;
                                break;
                            case 5:
                                check.setBounds(150, 150, 90, 20);
                                x = 1;
                                break;
                        }
                    }
                }

            }
        });
        frame.addMouseMotionListener(this);
        clear.addActionListener(this);
        addKeyListener(this);

        setFocusable(true);
    }


    public void windowopen() {



        setLayout(null);
        setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        check.setBounds(0, 281, 90, 20);
        add(check);

        clear.setBounds(480, 281, 90, 20);
        add(clear);


        frame.setLocation(400, 100);
        frame.setPreferredSize(new Dimension(580, 340));
        frame.pack();
        frame.add(this);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.repaint();



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        check.setBounds(0, 281, 90, 20);
        i = 1;
        figure = 'x';
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        requestFocusInWindow();
        x1= (short) e.getX();
        y1= (short) e.getY();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'k'){
            System.out.println("xd");
            figure = 'k';

        } else if (e.getKeyChar() == 'o') {
            figure = 'o';
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (figure == 'k') {
            g.setColor(Color.blue);
            g.fillRect(x1, y1, 25, 25);
            g.drawRect(x1, y1, 25, 25);


        } else if(figure == 'o') {
            g.setColor(Color.RED);
            g.fillOval(x1, y1, 25, 25);
            g.drawOval(x1, y1, 25, 25);
        }
    }




}




//




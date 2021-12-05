package ATM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class ATMEngine extends JPanel  { 
    
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    int[] pin = {0, 0, 0, 0};
    int choice = 0;

    ATMEngine(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH ,SCREEN_HEIGHT));
        this.setBackground(new Color(143, 121, 120));
        this.setFocusable(true);
        Login();
    }

    public void Login () {
        JPanel panel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        add(panel);
        JTextField textField = new JTextField(8);
        textField.setFont(textField.getFont().deriveFont(50f));
        panel.add(textField);
        JButton button = new JButton("Hello World");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(textField.getText());
            }
        });
        JLabel newLine = new JLabel("<html><br></html>");
        JPanel topButtonPanel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        add(topButtonPanel);
        add(newLine);
        JPanel middleButtonPanel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        add(middleButtonPanel);
        add(newLine);
        JPanel bottomButtonPanel = new JPanel(new FlowLayout(SwingConstants.LEADING, 10, 10));
        add(bottomButtonPanel);
        add(newLine);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(1);
                checkPin();
            }
        });
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(2);
                checkPin();
            }
        });
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(3);
                checkPin();
            }
        });
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(4);
                checkPin();
            }
        });
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(5);
            }
        });
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(6);
            }
        });
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(7);
            }
        });
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(8);
            }
        });
        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                enterNumber(9);
            }
        });


        topButtonPanel.add(button1);
        topButtonPanel.add(button2);
        topButtonPanel.add(button3);
        middleButtonPanel.add(button4);
        middleButtonPanel.add(button5);
        middleButtonPanel.add(button6);
        bottomButtonPanel.add(button7);
        bottomButtonPanel.add(button8);
        bottomButtonPanel.add(button9);
    
        textField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(e);
            }
        });
        panel.add(button);
    }
    
    public void enterNumber(int num){
        pin[choice] = num;
        choice++;
        if(choice > 3){
            choice = 0;
        }
        for(int i = 0; i < pin.length; i++){
            System.out.println(pin[i]);
        }
    }

    public void checkPin(){
        boolean correct = false;
        int[] correctPin = {1,2,3,4};
        if(Arrays.equals(correctPin, pin)){
            correct = true;
        }
        System.out.println(correct);
    }

}

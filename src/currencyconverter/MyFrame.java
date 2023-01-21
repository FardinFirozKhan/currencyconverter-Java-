
package currencyconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    String money;
    JLabel Name = new JLabel("Currency Converter");
    JLabel sp1 = new JLabel(" ");

    String[] country = {"Bangladesh", "India","Pakistan", "Sri Lanka", "Bhutan", "Maldives", "Afghanistan", "Nepal"};
    JComboBox cBox = new JComboBox(country);
    JLabel gap1 = new JLabel("   ");
    JTextField in1 = new JTextField(10);
    JLabel usd = new JLabel("     USD :  ");
    JTextField in2 = new JTextField(10);

    JLabel sp2 = new JLabel(" ");

    JLabel us = new JLabel("USD :  ");
    JTextField in3 = new JTextField(10);
    JLabel gap2 = new JLabel("   ");
    JTextField in4 = new JTextField(10);
    JLabel gap3 = new JLabel("   ");
    JComboBox comboBox = new JComboBox(country);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    MyFrame(String title){
        super(title);
        setSize(600,250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Name.setFont(new Font("Cooper Black", Font.PLAIN, 45));
        Font font = new Font("Constantia", Font.BOLD,15);
       
        
        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.cyan);
        getContentPane().setBackground(Color.cyan);
       
        cBox.setFont(font);
        comboBox.setFont(font);
        us.setFont(font);
        usd.setFont(font);
        in1.setFont(font);
        in2.setFont(font);
        in3.setFont(font);
        in4.setFont(font);
        
        

        panel1.add(cBox); panel1.add(gap1); panel1.add(in1); panel1.add(usd); panel1.add(in2);
        panel3.add(us); panel3.add(in3); panel3.add(gap2); panel3.add(in4); panel3.add(gap3); panel3.add(comboBox);

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(Name); panel2.add(sp1); panel2.add(panel1); panel2.add(sp2); panel2.add(panel3);
        add(panel2);
        cBox.addActionListener(this);
        comboBox.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Convert conv = new Convert();
        UsdToOther obj = new UsdToOther();
        if(e.getSource() == cBox) {
            try {
                if (cBox.getSelectedItem().equals("Bangladesh")) {
                    money = (in1.getText());
                    in2.setText(conv.BD(money));
                } else if (cBox.getSelectedItem().equals("India")) {
                    money = (in1.getText());
                    in2.setText(conv.IN(money));
                } else if (cBox.getSelectedItem().equals("Pakistan")) {
                    money = (in1.getText());
                    in2.setText(conv.PK(money));
                } else if (cBox.getSelectedItem().equals("Sri Lanka")) {
                    money = (in1.getText());
                    in2.setText(conv.SL(money));
                } else if (cBox.getSelectedItem().equals("Bhutan")) {
                    money = (in1.getText());
                    in2.setText(conv.BT(money));
                } else if (cBox.getSelectedItem().equals("Maldives")) {
                    money = (in1.getText());
                    in2.setText(conv.MV(money));
                } else if (cBox.getSelectedItem().equals("Afghanistan")) {
                    money = (in1.getText());
                    in2.setText(conv.AF(money));
                } else if (cBox.getSelectedItem().equals("Nepal")) {
                    money = (in1.getText());
                    in2.setText(conv.NP(money));
                }
            }catch(Exception ex){
                in1.setText("Input Amount");
            }
        }
        else if(e.getSource()== comboBox){
            try {
                if (comboBox.getSelectedItem().equals("Bangladesh")) {
                    money = (in3.getText());
                    in4.setText(obj.BDA(money));
                } else if (comboBox.getSelectedItem().equals("India")) {
                    money = (in3.getText());
                    in4.setText(obj.INA(money));
                } else if (comboBox.getSelectedItem().equals("Pakistan")) {
                    money = (in3.getText());
                    in4.setText(obj.PKA(money));
                } else if (comboBox.getSelectedItem().equals("Sri Lanka")) {
                    money = (in3.getText());
                    in4.setText(obj.SLA(money));
                } else if (comboBox.getSelectedItem().equals("Bhutan")) {
                    money = (in3.getText());
                    in4.setText(obj.BTA(money));
                } else if (comboBox.getSelectedItem().equals("Maldives")) {
                    money = (in3.getText());
                    in4.setText(obj.MVA(money));
                } else if (comboBox.getSelectedItem().equals("Afghanistan")) {
                    money = (in3.getText());
                    in4.setText(obj.AFA(money));
                } else if (comboBox.getSelectedItem().equals("Nepal")) {
                    money = (in3.getText());
                    in4.setText(obj.NPA(money));
                }
            }catch(Exception ex){
                in3.setText("Input Amount");
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class Lo extends JFrame implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    Container pane;
    JComboBox box;
    JComboBox bo;
    JRadioButton b1;
    JRadioButton b2;
    ButtonGroup g;
    JButton x = new JButton("Cancel"), s = new JButton("Submit");

    public Lo() throws MalformedURLException {
        setTitle("Registration System");
        Container pane = getContentPane();
        pane.setLayout(null);
        setBounds(300, 90, 800, 500);

        l1 = new JLabel("Welcome New Student");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Full Name");
        l3 = new JLabel("Age");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Parent Name");
        l6 = new JLabel("Phone Number");
        l7 = new JLabel("Address");
        l8 = new JLabel("Email");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        t6 = new JTextField(10);
        t7 = new JTextField(10);

        b1 = new JRadioButton();
        b2 = new JRadioButton();
        g = new ButtonGroup();
        b1.setText("Male");
        b2.setText("Female");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        t1.setBounds(300, 70, 200, 30);
        t2.setBounds(300, 110, 200, 30);
        t3.setBounds(300, 150, 200, 30);
        t4.setBounds(300, 190, 200, 30);
        t5.setBounds(300, 230, 200, 30);
        t6.setBounds(300, 270, 200, 30);
        t7.setBounds(300, 310, 200, 30);

        b1.setSize(100, 30);
        b1.setLocation(300, 150);
        pane.add(b1);
        b2.setSize(100, 30);
        b2.setLocation(400, 150);
        pane.add(b2);

        x.setSize(100, 30);
        x.setLocation(300, 400);
        pane.add(x);
        s.setSize(100, 30);
        s.setLocation(150, 400);
        pane.add(s);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);
        add(l6);
        add(t5);
        add(l7);
        add(t6);
        add(l8);
        add(t7);
//        
//         BufferedImage img;
//         Graphics2D g1;
//        img=new ImageIO.aa(new URL("file:///Users/slemani/Desctop//GUI/src/gui/Webp.net-resizeimage"));
//        ImageIcon icon=new ImageIcon(img);
//        JLabel lab1=new JLabel();
//        lab1.setIcon(icon);
//          pane.add(lab1);
//          lab1.setSize(400,300);
//          lab1.setLocation(700, 120);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int x = 0;
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        String s4 = t4.getText();
        String s5 = t5.getText();
        String s6 = t6.getText();
        String s7 = t7.getText();
        box.getSelectedIndex();
        x++;
        String st = "";
        if (b1.isSelected()) {
            st = "Male";
        } else if (b1.isSelected()) {
            st = "Female";
        } else {
            st = "No Button Selscted";
        }

        this.dispose();

        if (x > 0) {
            JOptionPane.showMessageDialog(s, "Student Accept Successfully");
        } else {
            JOptionPane.showMessageDialog(s, "Student Doesn't Accept ");
        }
    }

    public static void main(String[] args) throws IOException {
        Lo ob = new Lo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

package JasperPortfolio;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import JasperPortfolio.Homepage;

public class Educational extends Frame {

    public Educational(int width, int height) {
        super(width, height);
        // Set up the JFrame
        setTitle("Educational Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(531, 563);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Trinidad Tecson Elementary School");
        lblNewLabel.setBounds(144, 40, 439, 30);
        lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Pre School:");
        lblNewLabel_1.setBounds(21, 11, 191, 29);
        lblNewLabel_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Primary School:");
        lblNewLabel_1_1.setBounds(21, 81, 191, 29);
        lblNewLabel_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1);

        JLabel lblTrinidadTecsonElementary = new JLabel("Trinidad Tecson Elementary School ");
        lblTrinidadTecsonElementary.setBounds(144, 146, 439, 30);
        lblTrinidadTecsonElementary.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblTrinidadTecsonElementary);

        JLabel lblNewLabel_1_1_1 = new JLabel("Secondary School: ");
        lblNewLabel_1_1_1.setBounds(21, 187, 242, 29);
        lblNewLabel_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNazarethSchoolOf = new JLabel("Nazareth School of National University");
        lblNazarethSchoolOf.setBounds(136, 256, 486, 30);
        lblNazarethSchoolOf.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNazarethSchoolOf);

        JLabel lblNewLabel_2 = new JLabel("Grade 7 to Grade 10");
        lblNewLabel_2.setBounds(184, 220, 242, 25);
        lblNewLabel_2.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Grade 1 to Grade 6");
        lblNewLabel_2_1.setBounds(184, 109, 242, 30);
        lblNewLabel_2_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_2_1);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("Higher Secondary:");
        lblNewLabel_1_1_1_1.setBounds(21, 389, 220, 29);
        lblNewLabel_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1);

        JLabel lblNationalUniversity = new JLabel("National University");
        lblNationalUniversity.setBounds(136, 470, 214, 30);
        lblNationalUniversity.setBackground(new Color(0, 0, 0));
        lblNationalUniversity.setFont(new Font("Lucida Console", Font.BOLD, 16));
        getContentPane().add(lblNationalUniversity);

        JLabel lblNewLabel_4 = new JLabel("1st Year College");
        lblNewLabel_4.setFont(new Font("Lucida Console", Font.BOLD, 15));
        lblNewLabel_4.setBounds(177, 429, 206, 30);
        getContentPane().add(lblNewLabel_4);

        JButton backButton = new JButton("Back");
        backButton.setBounds(439, 0, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // dispose the frame
            }
        });
        getContentPane().add(backButton);
        
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Senior High School:");
        lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        lblNewLabel_1_1_1_1_1.setBounds(21, 297, 268, 29);
        getContentPane().add(lblNewLabel_1_1_1_1_1);
        
        JLabel lblNazarethSchoolOf_1 = new JLabel("Nazareth School of National University");
        lblNazarethSchoolOf_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        lblNazarethSchoolOf_1.setBounds(136, 337, 486, 30);
        getContentPane().add(lblNazarethSchoolOf_1);
        
        JLabel lblNewLabel_3 = new JLabel("2009-2010");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3.setBounds(243, 20, 140, 20);
        getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("2010-2016");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3_1.setBounds(243, 81, 140, 20);
        getContentPane().add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("2016-2020");
        lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3_1_1.setBounds(243, 187, 140, 20);
        getContentPane().add(lblNewLabel_3_1_1);
        
        JLabel lblNewLabel_3_1_1_1 = new JLabel("2020-2022");
        lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3_1_1_1.setBounds(270, 297, 140, 20);
        getContentPane().add(lblNewLabel_3_1_1_1);
        
        JLabel lblNewLabel_3_1_1_1_1 = new JLabel("2022-2023");
        lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_3_1_1_1_1.setBounds(243, 391, 140, 20);
        getContentPane().add(lblNewLabel_3_1_1_1_1);
        
        JLabel lblNewLabel_6 = new JLabel("BSIT-MWA");
        lblNewLabel_6.setFont(new Font("Lucida Console", Font.BOLD, 15));
        lblNewLabel_6.setBounds(344, 429, 96, 30);
        getContentPane().add(lblNewLabel_6);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel_5.setBounds(0, 0, 519, 524);
        getContentPane().add(lblNewLabel_5);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Educational frame = new Educational(1100, 430);
                frame.setVisible(true);
            }
        });
    }
}

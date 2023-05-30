package JasperPortfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import JasperPortfolio.Homepage;

public class Profile extends Frame {
    private JPanel contentPane;

    public Profile (int width, int height) {
        super(width, height);
        getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
        getContentPane().setLayout(null);
        setBackground(new Color(255, 255, 128));
        setBounds(100, 100, 865, 445);
        

        JLabel lblNewLabel_1 = new JLabel("Jasper S. Dela Cruz");
        lblNewLabel_1.setBounds(406, 122, 257, 25);
        lblNewLabel_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("20 Years Old");
        lblNewLabel_3.setBounds(392, 158, 166, 25);
        lblNewLabel_3.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Male");
        lblNewLabel_4.setBounds(425, 194, 143, 25);
        lblNewLabel_4.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Cristobal Honradez Street, Sampaloc, Manila");
        lblNewLabel_5.setBounds(438, 266, 491, 30);
        lblNewLabel_5.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("1st Year College");
        lblNewLabel_6.setBounds(406, 299, 191, 30);
        lblNewLabel_6.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("BSIT - MWA");
        lblNewLabel_7.setBounds(425, 336, 125, 25);
        lblNewLabel_7.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("jasperdelacruz588@gmail.com");
        lblNewLabel_8.setBounds(406, 372, 311, 25);
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_8);

        JLabel lblNewLabel_3_1 = new JLabel("0918 688 2368");
        lblNewLabel_3_1.setBounds(527, 230, 166, 25);
        lblNewLabel_3_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_3_1);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(10, 46, 305, 375);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\sddsdsds.jpg"));
        getContentPane().add(lblNewLabel);

        JButton backButton = new JButton("Back");
        backButton.setBounds(748, 11, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // dispose the frame
            }
        });
        getContentPane().add(backButton);
        
        JLabel lblNewLabel_1_1 = new JLabel("Name:");
        lblNewLabel_1_1.setBounds(328, 120, 102, 25);
        lblNewLabel_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Age:");
        lblNewLabel_1_1_1.setBounds(328, 158, 102, 25);
        lblNewLabel_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Contact Number:");
        lblNewLabel_1_1_1_1.setBounds(328, 230, 191, 25);
        lblNewLabel_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender:");
        lblNewLabel_1_1_1_1_1.setBounds(328, 194, 191, 25);
        lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Address:");
        lblNewLabel_1_1_1_1_2.setBounds(328, 267, 191, 25);
        lblNewLabel_1_1_1_1_2.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1_2);
        
        JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Year:");
        lblNewLabel_1_1_1_1_1_1.setBounds(328, 300, 191, 25);
        lblNewLabel_1_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Course:");
        lblNewLabel_1_1_1_1_1_1_1.setBounds(328, 336, 191, 25);
        lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Email:");
        lblNewLabel_1_1_1_1_1_1_1_1.setBounds(328, 375, 191, 25);
        lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 20));
        getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel_2.setBounds(0, 0, 849, 406);
        getContentPane().add(lblNewLabel_2);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Profile frame = new Profile(1100, 430);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
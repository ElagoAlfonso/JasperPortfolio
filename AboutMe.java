package JasperPortfolio;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import JasperPortfolio.Homepage;

public class AboutMe extends Frame {
	
    public AboutMe(int width, int height) {
        super(width, height);
        setTitle("About Me");
        setSize(916, 376);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("I am Jasper Dela Cruz, I'm 20 years old, I'm hardworking college student with self-motivated");
        lblNewLabel_1.setBounds(10, 46, 880, 35);
        lblNewLabel_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("and versatile skills. Usually i also like to edit videos and edit pictures because  i really");
        lblNewLabel_1_1.setBounds(10, 92, 880, 36);
        lblNewLabel_1_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("want to become fashion designer or master the editing videos or pictures. I also like to sing");
        lblNewLabel_1_1_1.setBounds(10, 139, 880, 37);
        lblNewLabel_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        getContentPane().add(lblNewLabel_1_1_1);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // dispose the frame
            }
        });
        backButton.setBounds(784, 11, 106, 23);
        getContentPane().add(backButton);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("every time i have noting to do i record a song or cover, and i also want to be a singer one ");
        lblNewLabel_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        lblNewLabel_1_1_1_1.setBounds(10, 187, 880, 37);
        getContentPane().add(lblNewLabel_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("day since i was a child i have to loved to sing so i also want to be a famous singer.");
        lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        lblNewLabel_1_1_1_1_1.setBounds(10, 242, 880, 37);
        getContentPane().add(lblNewLabel_1_1_1_1_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel.setBounds(0, 0, 900, 337);
        getContentPane().add(lblNewLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AboutMe frame = new AboutMe(1100, 430);
                frame.setVisible(true);
            }
        });
    }
}
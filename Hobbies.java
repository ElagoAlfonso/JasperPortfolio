package JasperPortfolio;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import JasperPortfolio.Homepage;

public class Hobbies extends Frame {
    private JPanel contentPane;
    private JPanel Panel_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Hobbies frame = new Hobbies(1100, 430);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Hobbies(int width, int height) {
        super(width, height);
        setTitle("AboutMyselfs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 733, 612);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.desktop);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        Panel_2 = new JPanel();
        Panel_2.setBackground(SystemColor.text);
        Panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2));
        Panel_2.setBounds(0, 0, 717, 573);
        contentPane.add(Panel_2);
        Panel_2.setLayout(null);

        JPanel BasicSkills_pnl_1 = new JPanel();
        BasicSkills_pnl_1.setBounds(34, 69, 179, 173);
        BasicSkills_pnl_1.setLayout(null);
        Panel_2.add(BasicSkills_pnl_1);

        JLabel lblNewLabel_12 = new JLabel("New label");
        lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\download (2).jfif"));
        lblNewLabel_12.setBounds(0, 0, 179, 173);
        BasicSkills_pnl_1.add(lblNewLabel_12);

        JPanel BasicSkills_pnl_1_1 = new JPanel();
        BasicSkills_pnl_1_1.setBounds(249, 69, 179, 173);
        BasicSkills_pnl_1_1.setLayout(null);
        Panel_2.add(BasicSkills_pnl_1_1);

        JLabel lblNewLabel_13 = new JLabel("New label");
        lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\download (4).jfif"));
        lblNewLabel_13.setBounds(0, 0, 179, 173);
        BasicSkills_pnl_1_1.add(lblNewLabel_13);

        JPanel BasicSkills_pnl_1_1_1 = new JPanel();
        BasicSkills_pnl_1_1_1.setBounds(475, 69, 179, 173);
        BasicSkills_pnl_1_1_1.setLayout(null);
        Panel_2.add(BasicSkills_pnl_1_1_1);

        JLabel lblNewLabel_14 = new JLabel("New label");
        lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\download (5).jfif"));
        lblNewLabel_14.setBounds(0, 0, 179, 173);
        BasicSkills_pnl_1_1_1.add(lblNewLabel_14);

        JLabel lblNewLabel = new JLabel("HOBBIES");
        lblNewLabel.setBounds(266, 26, 145, 56);
        lblNewLabel.setFont(new Font("Lucida Console", Font.BOLD, 20));
        Panel_2.add(lblNewLabel);

        JLabel lblNewLabel_9 = new JLabel("BASKETBALL");
        lblNewLabel_9.setBounds(44, 262, 179, 35);
        lblNewLabel_9.setFont(new Font("Lucida Console", Font.BOLD, 15));
        Panel_2.add(lblNewLabel_9);

        JLabel lblNewLabel_10 = new JLabel("MOBILE GAMES");
        lblNewLabel_10.setBounds(259, 262, 164, 35);
        lblNewLabel_10.setFont(new Font("Lucida Console", Font.BOLD, 15));
        Panel_2.add(lblNewLabel_10);

        JLabel lblMovies = new JLabel("MOVIES");
        lblMovies.setBounds(490, 268, 163, 23);
        lblMovies.setFont(new Font("Lucida Console", Font.BOLD, 15));
        Panel_2.add(lblMovies);

        JLabel lblNewLabel_11 = new JLabel("TALENT");
        lblNewLabel_11.setBounds(278, 308, 133, 40);
        lblNewLabel_11.setFont(new Font("Lucida Console", Font.BOLD, 20));
        Panel_2.add(lblNewLabel_11);

        JPanel BasicSkills_pnl_1_2 = new JPanel();
        BasicSkills_pnl_1_2.setBounds(34, 345, 179, 173);
        BasicSkills_pnl_1_2.setLayout(null);
        Panel_2.add(BasicSkills_pnl_1_2);

        JLabel lblNewLabel_15 = new JLabel("New label");
        lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\download (3).jfif"));
        lblNewLabel_15.setBounds(0, 0, 179, 173);
        BasicSkills_pnl_1_2.add(lblNewLabel_15);

        JPanel BasicSkills_pnl_1_1_2 = new JPanel();
        BasicSkills_pnl_1_1_2.setBounds(475, 345, 179, 173);
        BasicSkills_pnl_1_1_2.setLayout(null);
        Panel_2.add(BasicSkills_pnl_1_1_2);

        JLabel lblNewLabel_16 = new JLabel("New label");
        lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\download (6).jfif"));
        lblNewLabel_16.setBounds(0, 0, 179, 173);
        BasicSkills_pnl_1_1_2.add(lblNewLabel_16);

        JLabel lblNewLabel_9_1 = new JLabel("SINGING");
        lblNewLabel_9_1.setBounds(34, 529, 179, 35);
        lblNewLabel_9_1.setFont(new Font("Lucida Console", Font.BOLD, 15));
        Panel_2.add(lblNewLabel_9_1);

        JLabel lblNewLabel_9_2 = new JLabel("DRIVING");
        lblNewLabel_9_2.setBounds(475, 529, 179, 35);
        lblNewLabel_9_2.setFont(new Font("Lucida Console", Font.BOLD, 15));
        Panel_2.add(lblNewLabel_9_2);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel_1.setBackground(SystemColor.activeCaptionText);
        lblNewLabel_1.setBounds(0, 0, 717, 573);
        Panel_2.add(lblNewLabel_1);

        JLabel Talent_lbl = new JLabel("TALENT");
        Talent_lbl.setBounds(235, 288, 60, 20);
        Panel_2.add(Talent_lbl);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // dispose the current frame
            }
        });
        backButton.setBounds(621, 11, 70, 30);
        Panel_2.add(backButton);
    }
}

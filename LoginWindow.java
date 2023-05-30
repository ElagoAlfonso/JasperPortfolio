package JasperPortfolio;

import java.awt.EventQueue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginWindow extends Frame {
    private static final String SwingConstant = null;
	private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginWindow(int width, int height) {
        super(width, height);
    	setBackground(UIManager.getColor("Button.disabledForeground"));
        setTitle("Login");
        setSize(642, 357);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
    

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(128, 50, 142, 70);
        usernameLabel.setBackground(UIManager.getColor("Button.darkShadow"));
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(128, 85, 118, 106);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        usernameField = new JTextField(20);
        usernameField.setBounds(235, 67, 260, 41);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(235, 120, 260, 41);
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(291, 199, 142, 48);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (username.equals("jasper") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Username or Password.");
                
                   Homepage sp = new Homepage(1100, 430);
                    sp.setVisible(true);
                    dispose();
                    
                    
               
                
                }

                // Clear the fields after login attempt
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        panel.setLayout(null);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\neahd\\Downloads\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-03.jpg"));
        lblNewLabel.setBounds(0, 0, 626, 318);
        panel.add(lblNewLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow(1100, 430);
            }
        });
    }
}

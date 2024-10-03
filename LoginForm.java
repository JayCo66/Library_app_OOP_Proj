package Library_app_OOP_Proj;

import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout()); // Use BorderLayout for the frame
        frame.getContentPane().setBackground(new Color(20, 20, 20)); // Set background color to dark
        
        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Use GridBagLayout for centering elements
        panel.setBackground(new Color(20, 20, 20)); // Match background color
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Username Label
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(usernameLabel, gbc);
        
        // Username Field
        JTextField usernameField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(usernameField, gbc);
        
        // Password Label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(passwordLabel, gbc);
        
        // Password Field
        JPasswordField passwordField = new JPasswordField(8);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(passwordField, gbc);
        
        // Sign In Button
        JButton signInButton = new JButton("Sign In");
        signInButton.setBackground(new Color(25, 135, 84)); // Green color
        signInButton.setForeground(Color.WHITE);
        signInButton.setBorder(BorderFactory.createEmptyBorder());
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(signInButton, gbc);
        
        // Forgot Password Label
        JLabel forgotLabel = new JLabel("Forgot password?");
        forgotLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(forgotLabel, gbc);
        
        // Add the panel to the center of the frame
        frame.add(panel, BorderLayout.CENTER);
        
        // Display the frame
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("user") && password.equals("password")) {
                    messageLabel.setText("Login Successful");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid username or password");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

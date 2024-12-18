import java.awt.*;
import java.awt.event.*;

public class LoginFormBorderLayout extends Frame implements ActionListener {
    Label labelUsername, labelPassword, labelMessage;
    TextField textUsername, textPassword;
    Button loginButton;

    public LoginFormBorderLayout() {
        setLayout(new BorderLayout());

        Panel inputPanel = new Panel(new GridLayout(2, 2, 5, 5)); // Rows, Columns, Hgap, Vgap
        labelUsername = new Label("Username:");
        textUsername = new TextField(20);
        labelPassword = new Label("Password:");
        textPassword = new TextField(20);
        textPassword.setEchoChar('*');

        inputPanel.add(labelUsername);
        inputPanel.add(textUsername);
        inputPanel.add(labelPassword);
        inputPanel.add(textPassword);

        Panel buttonPanel = new Panel();
        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        buttonPanel.add(loginButton);

        labelMessage = new Label("", Label.CENTER); 

        add(inputPanel, BorderLayout.CENTER); 
        add(buttonPanel, BorderLayout.SOUTH); 
        add(labelMessage, BorderLayout.NORTH); 

        setTitle("Login Form");
        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose(); 
                System.exit(0); 
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textUsername.getText();
        String password = textPassword.getText();

        if (username.equals("admin") && password.equals("admin")) {
            labelMessage.setText("Login successful!");
            labelMessage.setForeground(Color.GREEN);
        } else {
            labelMessage.setText("Login failed. Try again.");
            labelMessage.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new LoginFormBorderLayout();
    }
}

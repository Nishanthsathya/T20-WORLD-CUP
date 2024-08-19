import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static javax.swing.JOptionPane.showMessageDialog;
public class signup extends JFrame {
    private JTextField nameText, emailText, passwordText;
    private JButton LOGINButton;
    private JPanel panel3;
    private String name, email, pass;

    public signup() {
        setContentPane(panel3);
        setTitle("SIGH UP PAGE");
        setSize(600, 750);
        setLocationRelativeTo(null);
        setVisible(true);
        LOGINButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == LOGINButton) {
                    name = nameText.getText();
                    email = emailText.getText();
                    pass = passwordText.getText();
                    if (name.equals("") || email.equals("") || pass.equals("")) {
                        showMessageDialog(panel3, "please fill all of this");
                    } else {
                        try {
                            new cwc2();
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "livewire");
                            String insertSQL = "INSERT INTO user1 (sname,email,pass) VALUES (?, ?, ?)";
                            PreparedStatement pstmt = con.prepareStatement(insertSQL);
                            pstmt.setString(1, name);
                            pstmt.setString(2, email);
                            pstmt.setString(3, pass);
                            pstmt.executeUpdate();
                            System.out.println("Data inserted successfully: ID=" + email + ", Name=" + name);
                        } catch (ClassNotFoundException | SQLException ex)
                        {throw new RuntimeException(ex);}
                    }
                }
            }
        });
    }
//    public static void main(String[] args) {
//        new signup();
//    }
}

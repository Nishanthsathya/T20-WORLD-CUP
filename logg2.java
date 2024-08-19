import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class logg2 extends JFrame implements ActionListener{
    private JButton LOGINButton;
    private JPanel panell;
    public logg2() {
        setContentPane(panell);
        setSize(600, 750);
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("T20 WORLD CUP 2024");
        LOGINButton.addActionListener(this);
    }
            public void actionPerformed(ActionEvent e)
            {
                new signup();
            }

    public static void main(String[] args)
    {
        new logg2();
    }
}

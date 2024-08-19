import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
public class table extends JFrame
{
    private JPanel panel1;
    public table()
    {
        setTitle("POINTS TABLE");
        setVisible(true);
        setContentPane(panel1);
        setSize(750,600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new table();
    }
}

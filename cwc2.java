import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cwc2 extends JFrame implements ActionListener {

    private JButton STATSButton;
    private JButton HOMEButton;
    private JButton TABLEButton;
    private JButton MATCHESButton;
    private JPanel mqpanel;

    public cwc2() {
        setTitle("World Cup");
        setSize(980, 550);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mqpanel);
        HOMEButton.addActionListener(this);
        MATCHESButton.addActionListener(this);
        TABLEButton.addActionListener(this);
        STATSButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == HOMEButton) {
        }
        if (e.getSource() == MATCHESButton) {
            new matches();
        }
        if (e.getSource() == TABLEButton) {
            new table();
        }
        if (e.getSource() == STATSButton) {
            new stat1();
        }
    }
//    public static void main(String[] args) {
//        new cwc2();
//    }
}


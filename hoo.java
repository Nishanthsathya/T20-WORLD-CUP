import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class hoo extends JFrame implements ItemListener
{
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel Mpanel;
    public hoo()
    {
        setTitle("details");
        setContentPane(Mpanel);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
        comboBox1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox1) {
            String SelectItem = comboBox1.getActionCommand();
            if (SelectItem == "A") {
                textField1.setText("Nishanth");
                textField2.setText("P229105");
                textField3.setText("Msc");
                textField4.setText("22");
            }
            if (SelectItem == "B") {
                textField1.setText("Abirami");
                textField2.setText("P229127");
                textField3.setText("Msc");
                textField4.setText("22");
            }
            if (SelectItem == "C") {
                textField1.setText("Abishek");
                textField2.setText("U229121");
                textField3.setText("Bsc");
                textField4.setText("20");
            }
            if (SelectItem == "D") {
                textField1.setText("kumar");
                textField2.setText("P228703");
                textField3.setText("MBA");
                textField4.setText("23");
            }}}
    public static void main(String[] args) {
        new hoo();
    }}


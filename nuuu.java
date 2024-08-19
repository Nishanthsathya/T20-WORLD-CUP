import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class nuuu extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JCheckBox checkBox;
    private JTextArea textArea;

    public nuuu() {
        super("Java GUI Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);


        label = new JLabel("Enter your name:");
        textField = new JTextField(20);
        button = new JButton("Submit");
        checkBox = new JCheckBox("Enable");
        textArea = new JTextArea(5, 20);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(label);
        container.add(textField);
        container.add(button);
        container.add(checkBox);
        container.add(new JScrollPane(textArea));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String message = "Hello, " + name + "!";
                textArea.append(message + "\n");
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(nuuu.this,
                            "Checkbox is selected!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new nuuu();
    }
}


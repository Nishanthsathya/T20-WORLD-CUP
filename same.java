import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class same extends Frame implements ActionListener
{
    Label nameLabel, courseLabel, depLabel, ageLabel, numLabel;
    TextField nameText, courseText, depText, ageText, numText;
    Button SubmitButton, ResetButton;
    public same() 
    {
        nameLabel = new Label("NAME:");
        courseLabel = new Label("COURSE:");
        ageLabel = new Label("AGE:");
        depLabel = new Label("DEPARTMENT:");
        numLabel = new Label("PHONE.NO:");
        nameText = new TextField(20);
        courseText = new TextField(20);
        depText = new TextField(20);
        ageText = new TextField(10);
        numText = new TextField(20);
        SubmitButton = new Button("SUBMIT");
        ResetButton = new Button("RESET");

        add(nameLabel);
        add(nameText);
        add(courseLabel);
        add(courseText);
        add(depLabel);
        add(depText);
        add(ageLabel);
        add(ageText);
        add(numLabel);
        add(numText);
        add(SubmitButton);
        add(ResetButton);
        SubmitButton.addActionListener(this);
        ResetButton.addActionListener(this);

        setVisible(true);
        setSize(500, 400);
        setTitle("FEE MANAGEMENT");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void Windowclosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == " "&& e.getSource()==SubmitButton)
        {
            System.out.println("Fill the details");
        }
       if(e.getSource() == SubmitButton)
        {
            new same1();
        }
        if (e.getSource()==ResetButton)
         {
                nameText.setText("");
                courseText.setText("");
                depText.setText("");
                ageText.setText("");
                numText.setText("");
            }
        }
    public static void main(String[] args)
    {
        new same();
    }
}

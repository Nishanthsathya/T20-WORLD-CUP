
import java.awt.*;
import java.awt.event.*;

class same1 extends Frame implements ItemListener {
    // TextArea TextArea;
    Choice Choice;
    Label totalLabel, gstLabel, disLabel, feeLabel;
    TextField totalText, gstText, disText, feeText;

    public same1() {
        // TextArea = new TextArea("welcome", 20, 20);
        totalLabel = new Label("Total Fee:");
        totalText = new TextField(20);
        gstLabel = new Label("GST:");
        gstText = new TextField(20);
        disLabel = new Label("Discount:");
        disText = new TextField(20);
        feeLabel = new Label("Final Fee");
        feeText = new TextField(20);
        Choice = new Choice();
        Choice.add("SELECT COURSE");
        Choice.add("HTML");
        Choice.add("JAVA");
        Choice.add("PYTHON");
        Choice.add("JAVA SCRIPT");
        Choice.add("FULL STACK");
        // add(TextArea);
        add(Choice);
        add(totalLabel);
        add(totalText);
        add(gstLabel);
        add(gstText);
        add(disLabel);
        add(disText);
        add(feeLabel);
        add(feeText);
        Choice.addItemListener(this);
        setLayout(new FlowLayout());
        setSize(1200, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void Windowclosing(WindowEvent e) {
                dispose();
            }
        });}

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == Choice) {
            String SelectItem = Choice.getSelectedItem();
            if (SelectItem=="SELECT COURSE");
            {
                totalText.setText("");
                gstText.setText("");
                disText.setText("");
                feeText.setText("");
            }
            if (SelectItem == "HTML") {
                totalText.setText("7,500");
                gstText.setText("1,850");
                disText.setText("2,000");
                feeText.setText("5,500");
            }
            if (SelectItem == "JAVA") {
                totalText.setText("11,415");
                gstText.setText("2,200");
                disText.setText("2,415");
                feeText.setText("9,000");
            }
            if (SelectItem == "PYTHON") {
                totalText.setText("14,000");
                gstText.setText("2,850");
                disText.setText("3,000");
                feeText.setText("11,500");
            }
            if (SelectItem == "JAVA SCRIPT") {
                totalText.setText("16,000");
                gstText.setText("3,200");
                disText.setText("3,500");
                feeText.setText("12,500");
            }
            if (SelectItem == "FULL STACK") {
                totalText.setText("32,000");
                gstText.setText("6,000");
                disText.setText("7,500");
                feeText.setText("24,500");

            }

        }
    }
}


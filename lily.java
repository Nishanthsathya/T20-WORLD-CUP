import java.awt.*;
import java.awt.event.*;
class lily
{
    public static void main(String[] args) {
        Frame f=new Frame("Operation");
        TextField tf=new TextField();
        tf.setBounds(10,30,100,30);

        TextField tf1=new TextField();
        tf1.setBounds(10,60,100,30);

        TextField tf2=new TextField();
        tf2.setBounds(10,140,100,30);

        Button b=new Button("ADD");
        b.setBounds(10,90 ,80,30);
        Button y=new Button("SUB");
        y.setBounds(90,90,80,30);
        Button r=new Button("MULTI");
        r.setBounds(170,90,80,30);
        Button l=new Button("DIV");
        l.setBounds(260,90,80,30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.out.println(tf.getText());
//                System.out.println(tf1.getText());


                int a= Integer.parseInt(tf.getText());
                int b= Integer.parseInt(tf1.getText());
                tf2.setText(String.valueOf(a+b));
            }
        });

        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.out.println(tf.getText());
//                System.out.println(tf1.getText());

                int a= Integer.parseInt(tf.getText());
                int b= Integer.parseInt(tf1.getText());
                tf2.setText(String.valueOf(a-b));
            }
        });

        r.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.out.println(tf.getText());
//                System.out.println(tf1.getText());

                int a= Integer.parseInt(tf.getText());
                int b= Integer.parseInt(tf1.getText());
                tf2.setText(String.valueOf(a*b));
            }
        });

        l.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                System.out.println(tf.getText());
//                System.out.println(tf1.getText());

                int a= Integer.parseInt(tf.getText());
                int b= Integer.parseInt(tf1.getText());
                tf2.setText(String.valueOf(a/b));
            }
        });

        f.add(b);f.add(y);f.add(r);f.add(l);f.add(tf);f.add(tf1);f.add(tf2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

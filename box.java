import java.awt.*;
import javax.swing.*;
public class box extends Frame
{
    Button buttons[];
    public box()
    {
        buttons=new Button[5];
        for(int i=0;i<5;i++)
        {
          buttons[i]=new Button("Button"+(i+1));
          add(buttons[i]);
        }
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        box b=new box();
    }

}

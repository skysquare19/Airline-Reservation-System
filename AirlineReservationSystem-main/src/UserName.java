import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Trinity

public class UserName
{
    static String personName;
    public static void userName()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JLabel name = new JLabel("Name: ");
        JTextField name2 = new JTextField();
        JButton next = new JButton("Next");

        myFrame.add(name);
        myFrame.add(name2);
        myFrame.add(next);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        next.addActionListener(e ->
        {
            if (e.getSource() == next) {
                personName = name2.getText();
                Main me = new Main();

                Book.bookFlight();
            }

        });


    }
}

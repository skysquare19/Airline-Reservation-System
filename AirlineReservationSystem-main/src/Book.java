import javax.swing.*;
import java.awt.*;
//Esther
public class Book
{
    static String caclass2;
    public static void bookFlight()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JButton round_trip = new JButton("Round Trip");
        JButton one_way = new JButton("One Way");

        myFrame.add(round_trip);
        myFrame.add(one_way);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        round_trip.addActionListener(e ->
        {
            if (e.getSource() == round_trip) {
                RoundTrip.roundTrip();
            }

        });

        one_way.addActionListener(e ->
        {
            if (e.getSource() == one_way) {
                OneWay.oneway();
            }

        });

    }
}

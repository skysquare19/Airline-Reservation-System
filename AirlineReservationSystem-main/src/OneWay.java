import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Nike
public class OneWay
{
    public static void oneway()
    {
        String [] States  = {"Abuja", "Lagos", "Benin"};
        String [] classes  = {"Economy", "Firstclass", "Business"};
        String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        JFrame myFrame = new JFrame("Zero-day Airlines");

        JLabel from = new JLabel("From: ");
        JComboBox opt1 = new JComboBox<>();

        JLabel to = new JLabel("To: ");
        JComboBox opt2 = new JComboBox<>();

        JLabel leaving = new JLabel("Leaving: ");
        JComboBox day1 = new JComboBox<>();

        JButton search = new JButton("Search");

        for( int i = 0; i < States.length; i ++)
        {
            opt1.addItem(States[i]);
            opt2.addItem(States[i]);
        }

        for( int i = 0; i < days.length; i ++)
        {
            day1.addItem(days[i]);

        }

        JLabel caClass = new JLabel("Cabin Class: ");
        JComboBox caClass1 = new JComboBox<>();

        for( int i = 0; i < classes.length; i ++)
        {
            caClass1.addItem(classes[i]);
        }


        myFrame.add(from);
        myFrame.add(opt1);

        myFrame.add(to);
        myFrame.add(opt2);

        myFrame.add(caClass);
        myFrame.add(caClass1);

        myFrame.add(leaving);
        myFrame.add(day1);

        myFrame.add(search);

        myFrame.setLayout(new GridLayout(6, 2));
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);

        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object selection = opt1.getSelectedItem();
                Object selection2 = opt2.getSelectedItem();
                for(int j = 0; j < States.length ; j ++)
                {
                    if (selection == States[j])
                    {
                        RoundTrip.location = States[j];
                    }
                    if (selection2 == States[j])
                    {
                        RoundTrip.location2 = States[j];
                    }
                }
                Object selection3 = day1.getSelectedItem();
                for(int j = 0; j < days.length ; j ++)
                {
                    if (selection3 == days[j])
                    {
                        RoundTrip.dayOfWeek = days[j];
                    }
                }
                Object selection5 = caClass1.getSelectedItem();
                for(int j = 0; j < classes.length ; j ++)
                {
                    if (selection5 == classes[j])
                    {
                        Book.caclass2 = classes[j];
                    }
                }
                if (e.getSource() == search) {
                    Search.search();

                }

            }

        });

    }
}

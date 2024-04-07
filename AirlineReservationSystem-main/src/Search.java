import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
//Ebube

public class Search
{
    static int seatNum = 0;
    static int nOfSeats = 20;

    static String timeFrame;
    public static void search()
    {
        String [] time = {"6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30",
                "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30",
                "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30",};

        JFrame myFrame = new JFrame("Zero-day Airlines");

        if(RoundTrip.location == "Abuja" && RoundTrip.location2 == "Lagos")
        {
            timeFrame =  time[0] + " to " + time[2];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + " Leaving:"
                    + RoundTrip.dayOfWeek + " " + timeFrame);
            myFrame.add(output);
        }

        else if(RoundTrip.location == "Lagos" && RoundTrip.location2 == "Abuja")
        {
            timeFrame =  time[3] + " to " + time[5];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " + timeFrame);
            myFrame.add(output);
        }

        else if(RoundTrip.location == "Abuja" && RoundTrip.location2 == "Benin")
        {
            timeFrame =  time[6] + " to " + time[8];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " + timeFrame);
            myFrame.add(output);
        }

        else if(RoundTrip.location == "Lagos" && RoundTrip.location2 == "Benin")
        {
            timeFrame =  time[0] + " to " + time[1];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " + timeFrame);
            myFrame.add(output);
        }

        else if(RoundTrip.location == "Benin" && RoundTrip.location2 == "Lagos")
        {
            timeFrame =  time[2] + " to " + time[4];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " +  timeFrame);
            myFrame.add(output);
        }

        else if(RoundTrip.location == "Benin" && RoundTrip.location2 == "Abuja")
        {
            timeFrame =  time[0] + " to " + time[2];
            JLabel output = new JLabel(RoundTrip.location + " to " + RoundTrip.location2 + ": "
                    + RoundTrip.dayOfWeek + " " + timeFrame);
            myFrame.add(output);

        }
        else if(RoundTrip.location == RoundTrip.location2)
        {
            timeFrame =  time[1] + " to " + time[3];
            JLabel output = new JLabel("Cannot go to State");
            myFrame.add(output);
        }

        JButton bookTicket = new JButton("Book Ticket");
        myFrame.add(bookTicket);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        bookTicket.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == bookTicket) {
                    nOfSeats = nOfSeats - 1;

                    try
                    {
                        Ticket.ticket();
                    } catch (IOException ex)
                    {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });


    }
}
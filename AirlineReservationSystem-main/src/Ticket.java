import javax.swing.*;
import java.awt.*;
import java.io.IOException;
//Ebube
public class Ticket
{
    static String [] your_ticket = new String[Search.nOfSeats];

    public static void ticket() throws IOException
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");
        int userId = 0;
        try
        {
            Search.seatNum = Search.seatNum + 1;
            userId = Search.seatNum + 1;

            for(int i = 0; i < Search.nOfSeats; i++)
            {
                your_ticket[i] = "USERID: ZD"+ userId;
            }

            JLabel output = new JLabel("Your Ticket Has Been Booked");
            JLabel yourTicket = new JLabel("USERNAME:"+ UserName.personName + " from " + RoundTrip.location
                    + " Seat Number" + Search.seatNum);


            myFrame.add(output);
            myFrame.add(yourTicket);
        } catch (Exception e)
        {
            JLabel output2 = new JLabel("Unable to book ticket");
            myFrame.add(output2);
        }

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(700, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);




        Disk data = new Disk("C:/zeroDayTicket.txt", true);
        data.writeToFile("Name:"+ UserName.personName + "\n From: " +
                RoundTrip.location + " To " +     RoundTrip.location2  + "\n Seat Number: "  + Search.seatNum + "\n Cabin class: " + Book.caclass2
        + "\n Time of departure: " + Search.timeFrame + "\n");


    }

    }





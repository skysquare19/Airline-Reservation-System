import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
//Trinty


public class Main
{
    public void runn()
    {
        JFrame myFrame = new JFrame("Zero-day Airlines");

        JButton book_flight = new JButton("Book Flight");

        myFrame.add(book_flight);

        myFrame.setLayout(new GridLayout(4, 2));
        myFrame.setSize(500, 400);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        book_flight.addActionListener(e ->
        {
            if (e.getSource() == book_flight)
            {
                UserName.userName();
            }

        });


    }

    public static void main(String[] args) throws IOException
    {
        Main airline = new Main();
        airline.runn();


    }
}

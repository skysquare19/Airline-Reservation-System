import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;


public class Disk
{
    static String content;
    private String path;
    private boolean append_to_file = false;


    public Disk(String file_path, boolean append_value){    //constructor
        path = file_path;
        append_to_file = append_value;
    }

    public void writeToFile( String textLine) throws IOException{

        FileWriter write = new FileWriter(path, append_to_file);    //object
        PrintWriter print_line = new PrintWriter(write);

        print_line.printf("%s" + "%n", textLine);

        print_line.close();

textLine = content;


    }
}

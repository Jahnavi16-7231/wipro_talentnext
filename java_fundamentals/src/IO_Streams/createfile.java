package IO_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileWriter writer = new FileWriter("Input.txt")) {
            writer.write("This is a sample file with several occurrences of the letter R and r.");
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

	}

}

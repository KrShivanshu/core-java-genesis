package Day4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class CopyFileToAnother {
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("FileA.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("FileB.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("Data from FileA.txt copied to FileB.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

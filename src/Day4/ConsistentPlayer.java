package Day4;
import java.util.*;
import java.io.*;

public class ConsistentPlayer {
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		ArrayList <String> players13 = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			players13.add(br.readLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		ArrayList <String> players12 = new ArrayList<String>();
		for(int i=0;i<5;i++) {
			players12.add(br.readLine());
		}
		
		players13.retainAll(players12);
		if(players13.size()>0) {
			System.out.println("Consistent Player are: ");
			for(int i=0;i<players13.size();i++) {
				System.out.println(players13.get(i));
			}
		}
		else
			System.out.println("No consistent player found.");
	}
}

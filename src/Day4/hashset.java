package Day4;
import java.util.*;
import java.io.*;

public class hashset {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> players = new HashSet<String>();
		System.out.println("Number of matches: ");
		int matches = Integer.parseInt(br.readLine());
		System.out.println("Enter the players name: ");
		for(int i=0;i<matches;i++) {
			players.add(br.readLine());
		}
		System.out.println(players);
	}
}

package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class treesetplayers {
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> players = new TreeSet<>();
		System.out.println("Number of matches: ");
		int matches = Integer.parseInt(br.readLine());
		System.out.println("Enter the players name: ");
		for(int i=0;i<matches;i++) {
			players.add(br.readLine());
		}
		
		System.out.println(players);
}
}

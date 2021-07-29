package Day4;
import java.io.*;
import java.util.*;

public class Count50and10 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int matches;
		System.out.println("Enter the numbers of matches:");
		matches = Integer.parseInt(br.readLine());
		ArrayList<Integer> score=new ArrayList<Integer>();
		System.out.println("Enter the scores");
		for(int i=0;i<matches;i++) {
			score.add(Integer.parseInt(br.readLine()));
		}
		int count50=0, count100=0;
		for(int i=0;i<matches;i++) {
			if(score.get(i)>=100) {
				count100++;
			}
			else if(score.get(i)>=50) {
				count50++;
			}
		}
		System.out.println("50s scored : "+count50 );
		System.out.println("100s scored : "+count100 );
	}
}

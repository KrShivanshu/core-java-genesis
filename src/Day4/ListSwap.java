package Day4;
import java.util.*;
import java.io.*;

public class ListSwap {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sunrisers Hyderabad");
		list.add("Delhi Capitals");
		list.add("Royal Challengers Bangalore");
		list.add("Kolkata Knight Riders");
		list.add("Mumbai Indians");
		
		System.out.println("Before Swap");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Swap Positions");
		int firstSwap = Integer.parseInt(br.readLine());		
		int secondSwap = Integer.parseInt(br.readLine());
		Collections.swap(list, firstSwap, secondSwap);
		
		System.out.println("After Swap");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}

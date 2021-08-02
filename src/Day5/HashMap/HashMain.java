package Day5.HashMap;
import java.util.*;
import java.util.Scanner;

public class HashMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name");
        String playerName = sc.nextLine();
        System.out.println("Enter wickets - seperated by \"|\" symbol");
        String wickets = sc.next();

        Map<String, List<wicket>> hashMap = new HashMap<>();

        boolean addPlayer = true;
        while (addPlayer) {
            System.out.println("Enter the player name");
            playerName = sc.nextLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            wickets = sc.next();
            String bowlerswickets[] = wickets.split("%|%");
            for (int i = 0; i < bowlerswickets.length; i++) {
                if (hashMap.containsKey(playerName)) {
                }
            }
            System.out.println("Do you want to add another player (yes/no)");
            addPlayer = sc.nextBoolean();
        }
        sc.close();
    }
}
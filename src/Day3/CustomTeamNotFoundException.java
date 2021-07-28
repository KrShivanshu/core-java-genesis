package Day3;

import java.io.*;

class TeamNotFoundException extends Exception {
    TeamNotFoundException() {

    }
}

public class CustomTeamNotFoundException {

    static int a=0;
    public static int func(String name, String[] teams) {
        try {
            int i = 0;
            for (i = 0; i < teams.length; i++) {
                if ((name.toLowerCase()).equals(teams[i].toLowerCase()))
                    break;
            }
            if (i == teams.length)
            {
                a=1;
                throw new TeamNotFoundException();
            }
        } catch (TeamNotFoundException exc) {
            System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] teams = { "Chennai Super Kings", "Sun Risers Hyderabad", "Delhi Capitals", "Kings XI Punjab",
                "Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };

        System.out.println("Enter the expected winner team of IPL Season 13");
        String winner = br.readLine();
        if(func(winner, teams)==0)
        {
        System.out.println("Enter the expected runner team of IPL Season 13");
        String runner = br.readLine();
        if(func(runner, teams)==0){
            System.out.println("Expected IPL Season 13 winner: "+winner);
            System.out.println("Expected IPL Season 13 runner: "+runner);
        }
        }
    }
}
package src.Day1;
import java.util.Scanner;

class Innings{
    private String teamname;
    private String inningsname;
    private int runs;

    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    public String getInningsname() {
        return inningsname;
    }
    public void setInningsname(String inningsname) {
        this.inningsname = inningsname;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public void displaysInningsDetails(){
        System.out.println("Name: "+teamname);
        System.out.println("Scored: "+runs);
        if(inningsname.equals("First"))
        System.out.println("Need "+(runs+1)+" to win");
        else if(inningsname.equals("Second"))
        System.out.println("Match Ended.");
    }
}

public class InningsMain extends Innings{
    public static void main(String[] args){
        InningsMain i = new InningsMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter team name:");
        i.setTeamname(sc.nextLine());
        System.out.println("Enter session:");
        i.setInningsname(sc.nextLine());
        System.out.println("Enter runs:");
        i.setRuns(sc.nextInt());

        i.displaysInningsDetails();
        sc.close();
    }
}

package Day5.Comparator;
import java.util.*;


public class TeamMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teams:");
        int noOfTeams = sc.nextInt();
        sc.nextLine();
        List<Team> teamList = new ArrayList<>();
        for (int i = 0; i < noOfTeams; i++) {
            System.out.println("Enter team " + (i + 1) + " detail\nEnter Name");
            String teamName = sc.nextLine();
            System.out.println("Enter number of matches");
            long noOfMatches = sc.nextLong();
            sc.nextLine();
            teamList.add(new Team(teamName, noOfMatches));
        }
        System.out.println("Team list after sort by number of matches");
        Collections.sort(teamList, new TeamCompartor());
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(teamList.get(i).getName() + " - " + teamList.get(i).getNoOfMatches());
        }
        sc.close();
    }
}

package Day5.Comparator;

public class Team {
    public Team(String name, long noOfMatches) {
        this.name = name;
        this.noOfMatches = noOfMatches;
    }

    private String name;
    private long noOfMatches;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(long noOfMatches) {
        this.noOfMatches = noOfMatches;
    }
}

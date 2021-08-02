package Day5.HashMap;

public class wicket {
    
    private String playerName;
    private bowler bowler;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public bowler getbowler() {
        return bowler;
    }

    public void setbowler(bowler bowler) {
        this.bowler = bowler;
    }

    public wicket() {
    }

    public wicket(String playerName, bowler bowler) {
        this.playerName = playerName;
        this.bowler = bowler;
    }
}

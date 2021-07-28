package Day3;
import java.util.Scanner;

abstract class Match{
    private int currentscore;
    private int target;
    private float currentover;
    
    public int getCurrentscore() {
        return currentscore;
    }
    public void setCurrentscore(int currentscore) {
        this.currentscore = currentscore;
    }
    public int getTarget() {
        return target;
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public float getCurrentover() {
        return currentover;
    }
    public void setCurrentover(float currentover) {
        this.currentover = currentover;
    }

    abstract float calculateRunRate();
    abstract int calculateBalls();
    abstract void display(double reqRunrate, int balls);
}

class ODIMatch extends Match{
    
    int maxBalls = 300;
    @Override
    int calculateBalls(){
        float x = getCurrentover()-(int)getCurrentover();
        int currentBalls = (int)getCurrentover()*6 + (int)(x*10);
        return maxBalls-currentBalls;
    }
    @Override
    float calculateRunRate() {
        float x = getTarget() - getCurrentscore();
        return (x/calculateBalls())*6;
    }

    @Override
    void display(double reqRunrate, int balls) {
        int x = getTarget() - getCurrentscore();
        System.out.println("Need "+x+" runs in "+balls+" balls");
        System.out.println("Required Rate: "+(double) Math.round(reqRunrate * 100) / 100);
        
    }
}

class TestMatch extends Match{
    int maxBalls = 540;
    @Override
    int calculateBalls(){
        float x = getCurrentover()-(int)getCurrentover();
        int currentBalls = (int)getCurrentover()*6 + (int)(x*10);
        return maxBalls-currentBalls;
    }
    @Override
    float calculateRunRate() {
        float x = getTarget() - getCurrentscore();
        return (x/calculateBalls())*6;
    }

    @Override
    void display(double reqRunrate, int balls) {
        int x = getTarget() - getCurrentscore();
        System.out.println("Need "+x+" runs in "+balls+" balls");
        System.out.println("Required Rate: "+(double) Math.round(reqRunrate * 100) / 100);
        
    }
}

class T20Match extends Match{
    int maxBalls = 120;
    @Override
    int calculateBalls(){
        float x = getCurrentover()-(int)getCurrentover();
        int currentBalls = (int)getCurrentover()*6 + (int)(x*10);
        return maxBalls-currentBalls;
    }
    @Override
    float calculateRunRate() {
        float x = getTarget() - getCurrentscore();
        return (x/calculateBalls())*6;
    }

    @Override
    void display(double reqRunrate, int balls) {
        int x = getTarget() - getCurrentscore();
        System.out.println("Need "+x+" runs in "+balls+" balls");
        System.out.println("Required Rate: "+ (double) Math.round(reqRunrate * 100) / 100);
        
    }
}

public class MatchMain {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        String op = sc.nextLine();
        System.out.println("Enter the Current Score");
        int cScore = sc.nextInt();
        System.out.println("Enter the Current Over");
        float cOver = sc.nextFloat();
        System.out.println("Enter the Target Score");
        int tScore = sc.nextInt();

        Match m;
        if(op.equals("1")){
            m = new ODIMatch();
        }
        else if(op.equals("2")){
            m = new T20Match();
        }
        else{
            m = new TestMatch();
        }
        m.setCurrentscore(cScore);
        m.setCurrentover(cOver);
        m.setTarget(tScore);
        System.out.println("Requirements:");
        m.display(m.calculateRunRate(),m.calculateBalls());
        sc.close();
    }
}

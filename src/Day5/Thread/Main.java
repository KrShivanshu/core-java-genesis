package Day5.Thread;

import java.util.*;

public class Main {
    static void printArray(SortScore sortScore) {
        System.out.println("Match: " + sortScore.getMatchType());
        int a[] = sortScore.getScores();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Match : ");
        String matchType1 = sc.nextLine();
        System.out.println("Enter the Scores : ");
        String scores1 = sc.nextLine();
        SortScore sortScore1 = new SortScore(matchType1, scores1);
        sortScore1.start();
        sortScore1.join();

        System.out.println("Enter the Match : ");
        String matchType2 = sc.nextLine();
        System.out.println("Enter the Scores : ");
        String scores2 = sc.nextLine();
        SortScore sortScore2 = new SortScore(matchType2, scores2);
        sortScore2.start();
        sortScore2.join();
        System.out.println("Enter the Match : ");
        String matchType3 = sc.nextLine();
        System.out.println("Enter the Scores : ");
        String scores3 = sc.nextLine();

        SortScore sortScore3 = new SortScore(matchType3, scores3);
        sortScore3.start();
        sortScore3.join();

        System.out.println("Ordered Score List ");
        printArray(sortScore1);
        printArray(sortScore3);
        printArray(sortScore2);

        sc.close();
    }
}

package Day1;
import java.util.Scanner;

class Name {
    private String fname;
    private String lname;

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}

public class FullName extends Name {
    public static void main(String[] args) {
        FullName f = new FullName();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        f.setFname(sc.nextLine());
        System.out.println("Enter the Last Name: ");
        f.setLname(sc.nextLine());

        String firstLetter = f.getFname().substring(0, 1);
        String remainingLetters = f.getFname().substring(1, f.getFname().length()).toLowerCase();

        firstLetter = firstLetter.toUpperCase();
        String lastname = f.getLname().toUpperCase();

        // join the two substrings
        String fullname = firstLetter + remainingLetters + " " + lastname;
        System.out.println(fullname);
        sc.close();
    }
}

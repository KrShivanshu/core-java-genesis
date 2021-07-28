package Day3;
import java.io.*;

class InvalidAgeRange extends Exception{  
    InvalidAgeRange(){
    }  
}

public class CustomAgeException{
    public static void main(String[] args) throws IOException, InvalidAgeRange{
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("Enter the player name");
        String name = br.readLine();
        System.out.println("Enter the player age");
        int age = Integer.parseInt(br.readLine());
        try{
            if(age<19)
            throw new InvalidAgeRange();
            
                System.out.println("Player name : "+name);
                System.out.println("Player age :"+age );
            
        }
        catch(InvalidAgeRange exc){
        System.out.println("CustomException: InvalidAgeRangeException");
        }
    }
}
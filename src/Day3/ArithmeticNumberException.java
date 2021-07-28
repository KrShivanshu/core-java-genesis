package Day3;
import java.io.*;

public class ArithmeticNumberException {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        int runs=0, overs=0;
        try{
        System.out.println("Enter the runs scored");
        runs = Integer.parseInt(br.readLine());
        System.out.println("Enter the total overs faced");        
        overs = Integer.parseInt(br.readLine());
        
        try{
            if(overs==0)
            throw new ArithmeticException();
            float runrate = (float)runs/(float)overs;
            System.out.println("Current Run Rate :"+String.format("%.2f", runrate));
        }
        catch(ArithmeticException exc){
            System.out.println(exc);
        }

        }
        catch(NumberFormatException exc){
            System.out.println(exc);
        }
        
        
    }
}
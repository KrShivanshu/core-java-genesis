package Day3;
import java.io.*;

class ArrayIndexOutOfBoundsNegativeSizeException{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        int overs=0,index=0;

        System.out.println("Enter the number of overs");
        overs = Integer.parseInt(br.readLine());
        
        try{
        if(overs < 0)
        throw new NegativeArraySizeException();
        
        System.out.println("Enter the number of runs for each over");        
        int []arr = new int[overs];
        for(int i=0;i<overs;i++){
        arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter the over number");
        index = Integer.parseInt(br.readLine());
        try{
            if(index>overs || index < 1)
            throw new ArrayIndexOutOfBoundsException();

            System.out.println("Runs scored in this over : "+ arr[index-1]);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println(exc);
        }
        }
        catch(NegativeArraySizeException exc){
            System.out.println(exc);
        }       
    }
}
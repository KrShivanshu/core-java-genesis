package Day2;
import java.util.Scanner;

class HotelRoom{
    protected String hotelName;
    protected int numberOfSqFeet;
    protected boolean hasTV;
    protected boolean hasWifi;

    public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    public int calculateTarrif(){
        return getRatePerSqFeet()*numberOfSqFeet;
    }

    public int getRatePerSqFeet(){
        return 0;
    }
}

class DeluxeRoom extends HotelRoom{
    protected int ratePerSqFeet;
    public DeluxeRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 10;
    }
    public int getRatePerSqFeet(){
        if(hasWifi){
            return ratePerSqFeet+2;
        }
        return ratePerSqFeet;
    }
}

class DeluxeACRoom extends DeluxeRoom{
    public DeluxeACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 12;
    }
}

class SuiteACRoom extends HotelRoom{
    private int ratePerSqFeet;
    public SuiteACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 15;
    }
    public int getRatePerSqFeet(){
        if(hasWifi){
            return ratePerSqFeet+2;
        }
        return ratePerSqFeet;
    }
}

public class HotelTest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hotel Tarrif Calculator");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");
        String op = sc.nextLine();
        System.out.println("Hotel Name:");
        String hName = sc.nextLine();
        System.out.println("Room Square Feet Area:");
        int sqFeet = sc.nextInt();
        sc.nextLine();
        System.out.println("Room has TV(yes/no):");
        String hasTV = sc.nextLine();
        boolean isTV = false;
        if(hasTV.equals("yes")){
            isTV = true;
        }
        System.out.println("Room has Wifi(yes/no):");
        String hasWifi = sc.nextLine();
        boolean isWifi = false;
        if(hasWifi.equals("yes")){
            isWifi = true;
        }
        HotelRoom room;
        if(op.equals("1")){
            room = new DeluxeRoom(hName,sqFeet,isTV,isWifi);
        }
        else if(op.equals("2")){
            room = new DeluxeACRoom(hName,sqFeet,isTV,isWifi);
        }
        else{
            room = new SuiteACRoom(hName,sqFeet,isTV,isWifi);
        }
        System.out.println("Room Tarrif Per Day is: "+room.calculateTarrif());
        sc.close();
    }
}

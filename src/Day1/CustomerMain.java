package src.Day1;
import java.util.Scanner;

class Customer{
    private String name;
    private String address;
    private String mobile;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
public class CustomerMain extends Customer {
    public static void main(String[] args){
        CustomerMain c = new CustomerMain();
        System.out.println("Enter the details:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrOfStr = str.split(",");
        c.setName(arrOfStr[0]);
        c.setAddress(arrOfStr[1]);
        c.setMobile(arrOfStr[2]);
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Mobile: "+c.getMobile());
    sc.close();
    }
}

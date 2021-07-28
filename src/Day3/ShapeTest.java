package Day3;
import java.util.Scanner;

abstract class Shape{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    abstract double calculateArea(int value);
}

class Circle extends Shape{
    double calculateArea(int value){
        double PI = 3.14;
        return PI*(value*value);
    }
}

class Sqaure extends Shape{
    double calculateArea(int value){
        return value*value;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;
        System.out.println("Circle"); 
        System.out.println("Sqaure"); 
        System.out.println("Enter the shape");
        String op = sc.nextLine();
        System.out.println("Enter the side");
        int value = sc.nextInt();
        if(op.equals("Circle")){
            s = new Circle();
            System.out.println("Area of circle is: "+s.calculateArea(value));
        }
        else if(op.equals("Sqaure")){
            s = new Sqaure(); 
            System.out.println("Area of Sqaure is: "+s.calculateArea(value));
        }
        sc.close();
    }
}

package Day1;
import java.util.Scanner;

public class primesum {
    public static int sumPrimeArray(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
        int count =0;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if(arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
            if(count==0 && arr[i]!=1)
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int count = s.nextInt();
        s.nextLine();
        int[] numbers = new int[count];

        if (count < 1) {
            System.out.println("Invalid array size!");
            s.close();
            return;
        } else {
        System.out.println("Enter the array elements : ");
            Scanner numScanner = new Scanner(s.nextLine());
            for (int i = 0; i < count; i++) {
                numbers[i] = numScanner.nextInt();
                if (numbers[i] < 0) {
                    System.out.println("Invalid input!");
                    return;
                }
            }
        }
        System.out.println("Sum of prime numbers = " + sumPrimeArray(numbers, count));
        s.close();
    }
}

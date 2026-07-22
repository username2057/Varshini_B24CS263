import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt(); 
        
        int originalNum = num; 
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;         
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;              
        }

        System.out.println("The reverse of " + originalNum + " is: " + reversedNum);

        scanner.close();
    }
}
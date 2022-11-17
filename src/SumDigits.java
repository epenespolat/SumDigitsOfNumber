import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = input.nextInt();
        int digitValue,digitSum=0;

        while(number != 0){
            digitValue = number % 10;
            digitSum += digitValue;
            number /= 10;
        }
        System.out.println("Summation of digits of the number is " +digitSum);
    }
}

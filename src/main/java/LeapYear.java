import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isDv4 = year%4 ==0;
        boolean isDv400= year%400 ==0;
        boolean isDv100= year%100 ==0;
        boolean isLeapYear= false;
        if (isDv4) {
            if (isDv100) {
                if (isDv400) {
                    isLeapYear= true;
                }
            }
        } else {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year" , year);
        }
    }
}

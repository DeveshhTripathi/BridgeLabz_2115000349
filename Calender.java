import java.util.Scanner;
public class Calendar{
    public static String getMonthName(int month){
        String[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    public static int getDaysInMonth(int month, int year){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2){
            if (isLeapYear(year)){
                return 29;
            }
            return daysInMonth[month - 1];
        }
        return daysInMonth[month - 1];
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        displayCalendar(month, year);
    }
}

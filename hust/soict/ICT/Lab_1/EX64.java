import java.util.Scanner;

public class EX64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap thang: ");
            String monthInput = scanner.nextLine().trim().toLowerCase();

            int month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Thang khong hop le");
                continue;
            }

            System.out.print("Nhap nam: ");
            int year = scanner.nextInt();

            if (year <= 0) {
                System.out.println("Nam khong hop le");
                continue;
            }

            int daysInMonth = getDaysInMonth(month, year);
            if (daysInMonth == -1) {
                System.out.println("Thang va nam khong hop le");
                continue;
            }

            System.out.println("So ngay trong " + getMonthName(month) + " " + year + " la " + daysInMonth);
            break;
        }

        scanner.close();
    }

    public static int getMonth(String monthInput) {
        switch (monthInput) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12)
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        else
            return false;
    }
}
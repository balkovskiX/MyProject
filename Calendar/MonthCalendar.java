package month;

public class MonthCalendar {
    public static void main(String[] args) {
        int month = 1; // Type the month number here. The program will show which season
        if (month == 12 || month == 1 || month == 2) {
            System.out.println(("Winter"));
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }else  {
            System.out.println("Autumn");
        }
    }
}
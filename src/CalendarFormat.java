//demo
public class CalendarFormat {
    public static void main(String[] args) {
        String day = "Monday";
        int date = 2;
        String month = "September";
        int year = 2019;
        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}
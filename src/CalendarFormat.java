public class CalendarFormat {
    public static void main(String[] args) {
        String day = "Monday";  // Day of the week
        int date = 2;           // Day of the month
        String month = "September";  // Month
        int year = 2019;        // Year
        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("\nAmerican format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}
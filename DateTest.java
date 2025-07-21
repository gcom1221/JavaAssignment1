public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(7, 21, 2025);

        System.out.print("The date is: ");
        myDate.displayDate();

        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2026);

        System.out.print("Updated date is: ");
        myDate.displayDate();
    }
}

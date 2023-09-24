public class MyDate {
    int year;
    int month;
    int date;

    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return date + "-" + month + "-" + year;
    }
}

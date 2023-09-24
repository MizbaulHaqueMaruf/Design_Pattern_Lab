// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2023, 8, 17);

        PartTime partTimeStaff = new PartTime("abc", "Gazipur", "01213456789", "abc@iut-dhaka.edu", "AB-2", 123, hireDate, "8", "Dining Manager", 9, 12);
        double ans = partTimeStaff.calculateSalary();
        System.out.println("Salary is: " + ans);
    }
}

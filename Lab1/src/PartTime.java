public class PartTime extends Staff{
    double workedHour;
    double hourlyRate;

    public PartTime(String name, String address, String phone_no, String email, String office, double salary, MyDate dateHired, String officeHour, String title, double workedHour, double hourlyRate) {
        super(name, address, phone_no, email, office, salary, dateHired, officeHour, title);
        this.workedHour = workedHour;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hourlyRate * workedHour;
    }

    @Override
    public String toString(){
        return "PartTime: " + name;
    }
}

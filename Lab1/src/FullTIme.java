public class FullTIme extends Staff{
    public FullTIme(String name, String address, String phone_no, String email, String office, double salary, MyDate dateHired, String officeHour, String title, double fixedSalary) {
        super(name, address, phone_no, email, office, salary, dateHired, officeHour, title);
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "FullTime: " + name;
    }
}

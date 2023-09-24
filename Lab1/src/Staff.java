public class Staff extends Employee{
    String officeHour;
    String title;

    public Staff(String name, String address, String phone_no, String email, String office, double salary, MyDate dateHired, String officeHour, String title) {
        super(name, address, phone_no, email, office, salary, dateHired);
        this.officeHour = officeHour;
        this.title = title;
    }

    @Override
    public String toString(){
        return "Staff: " + name;
    }
}

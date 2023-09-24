public class Faculty extends Employee{
    String officeHours;
    String rank;

    public Faculty(String name, String address, String phone_no, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phone_no, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty: " + name;
    }
}

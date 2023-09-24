import java.time.LocalDate;

public class Employee extends Person{
    String office;
    double salary;
    MyDate dateHired;

    public Employee(String name, String address, String phone_no, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phone_no, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        return "Employee: " + name;
    }
}

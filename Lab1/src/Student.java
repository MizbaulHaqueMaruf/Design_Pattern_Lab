public class Student extends Person{
    String status;

    public Student(String name, String address, String phone_no, String email, String status) {
        super(name, address, phone_no, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

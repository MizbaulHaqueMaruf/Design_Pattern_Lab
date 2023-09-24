public class Person {
    String name;
    String address;
    String phone_no;
    String email;

    public  Person(){

    }
    public Person(String name, String address, String phone_no, String email) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

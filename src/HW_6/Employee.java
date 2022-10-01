package HW_6;

public class Employee {

    private final String FULL_NAME;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String name, String surname, String position, String email, int phoneNumber, int age) {
        this.FULL_NAME = name + " " + surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFULL_NAME() {
        return FULL_NAME;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//  F2018065101
//  Raja Faizan Nazir
public abstract class Person {
    protected String name, address;
    protected int CNIC, phone;
    protected DateOfBirth dateOfBirth;

    public Person() {
        this("", "", 0, 0, null);
    }

    public Person(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth) {
        this.name = name;
        this.address = address;
        this.CNIC = CNIC;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCNIC() {
        return CNIC;
    }

    public void setCNIC(int CNIC) {
        this.CNIC = CNIC;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return 2021 - dateOfBirth.getYear();
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name='" + name + "\', address='" + address + "\', CNIC=" + CNIC +
                ", phone=" + phone +
                ", dateOfBirth=" + dateOfBirth;
    }
}

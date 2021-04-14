//  F2018065101
//  Raja Faizan Nazir
public abstract class Student extends Person {
    protected int studentID, totalCreditHours;
    protected String department;

    public Student() {
        this("", "", 0, 0, null, 0, 0, "");
    }

    public Student(int studentID, int totalCreditHours, String department) {
        this.studentID = studentID;
        this.totalCreditHours = totalCreditHours;
        this.department = department;
    }

    public Student(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth, int studentID, int totalCreditHours, String department) {
        super(name, address, CNIC, phone, dateOfBirth);
        this.studentID = studentID;
        this.totalCreditHours = totalCreditHours;
        this.department = department;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getTotalCreditHours() {
        return totalCreditHours;
    }

    public void setTotalCreditHours(int totalCreditHours) {
        this.totalCreditHours = totalCreditHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", studentID=" + studentID +
                ", totalCreditHours=" + totalCreditHours +
                ", department='" + department + '\'';
    }
}

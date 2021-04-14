//  F2018065101
//  Raja Faizan Nazir
public abstract class Employee extends Person {
    protected int employeeID;
    protected String employeeDesignation;

    public Employee() {
        super();
        employeeID = 0;
        employeeDesignation = "";
    }

    public Employee(int employeeID, String employeeDesignation) {
        this.employeeID = employeeID;
        this.employeeDesignation = employeeDesignation;
    }

    public Employee(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth, int employeeID, String employeeDesignation) {
        super(name, address, CNIC, phone, dateOfBirth);
        this.employeeID = employeeID;
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return super.toString() + " ,employeeID=" + employeeID +
                ", employeeDesignation='" + employeeDesignation + '\'';
    }
}

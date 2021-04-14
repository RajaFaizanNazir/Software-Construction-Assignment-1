//  F2018065101
//  Raja Faizan Nazir
public class BS_Student extends Student implements ResearchWork {
    private int noOfCourse;
    private String choosenwork;

    public BS_Student() {
        this("", "", 0, 0, null, 0, 0, "", 0);
    }

    public BS_Student(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }

    public BS_Student(int studentID, int totalCreditHours, String department, int noOfCourse) {
        super(studentID, totalCreditHours, department);
        this.noOfCourse = noOfCourse;
    }

    public BS_Student(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth, int studentID, int totalCreditHours, String department, int noOfCourse) {
        super(name, address, CNIC, phone, dateOfBirth, studentID, totalCreditHours, department);
        this.noOfCourse = noOfCourse;
    }

    public int getNoOfCourse() {
        return noOfCourse;
    }

    public void setNoOfCourse(int noOfCourse) {
        this.noOfCourse = noOfCourse;
    }

    @Override
    public void doResearchWork() {
        if (choosenwork == "") {
            System.out.println("Bs Student \'" + name + "\' is doing research work");
            choosenwork = "research";
        } else {
            System.out.println("Bs Student \'" + name + "\' is already doing " + choosenwork);
        }
    }

    @Override
    public void doProject() {
        if (choosenwork == "") {
            System.out.println("Bs Student \'" + name + "\' is doing project");
            choosenwork = "project";
        } else {
            System.out.println("Bs Student \'" + name + "\' is already doing " + choosenwork);
        }
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BS Student: "+super.toString() + ", noOfCourse=" + noOfCourse;
    }


}

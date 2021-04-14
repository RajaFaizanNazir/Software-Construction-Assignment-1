//  F2018065101
//  Raja Faizan Nazir
import java.util.Scanner;

public class MS_Student extends Student implements ResearchWork {
    protected String researchTopic;

    public MS_Student() {
        this("", "", 0, 0, null, 0, 0, "", "");
    }

    public MS_Student(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public MS_Student(int studentID, int totalCreditHours, String department, String researchTopic) {
        super(studentID, totalCreditHours, department);
        this.researchTopic = researchTopic;
    }

    public MS_Student(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth, int studentID, int totalCreditHours, String department, String researchTopic) {
        super(name, address, CNIC, phone, dateOfBirth, studentID, totalCreditHours, department);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public void doResearchWork() {
        if (researchTopic == "") {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the topic of your research work");
            researchTopic = in.nextLine();
            System.out.println("Bs Student \'" + name + "\' is doing research work at topic='" + researchTopic + "\'");
        } else {
            System.out.println("Bs Student \'" + name + "\' is already doing research work at topic='" + researchTopic + "\'");
        }
    }

    @Override
    public void doProject() {
        System.out.println("Bs Student \'" + name + "\' can not do project");
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MS Student: "+super.toString() + ", researchTopic=" + researchTopic;
    }
}

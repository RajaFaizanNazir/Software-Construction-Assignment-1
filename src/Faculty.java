//  F2018065101
//  Raja Faizan Nazir
public class Faculty extends Employee implements ResearchWork {
    private String areaOfSpecialization;
    private int noOfCoursesTeaching;

    public Faculty() {
        this("", "", 0, 0, null, 0, "", "", 0);
    }

    public Faculty(String areaOfSpecialization, int noOfCoursesTeaching) {
        this.areaOfSpecialization = areaOfSpecialization;
        this.noOfCoursesTeaching = noOfCoursesTeaching;
    }

    public Faculty(int employeeID, String employeeDesignation, String areaOfSpecialization, int noOfCoursesTeaching) {
        super(employeeID, employeeDesignation);
        this.areaOfSpecialization = areaOfSpecialization;
        this.noOfCoursesTeaching = noOfCoursesTeaching;
    }

    public Faculty(String name, String address, int CNIC, int phone, DateOfBirth dateOfBirth, int employeeID, String employeeDesignation, String areaOfSpecialization, int noOfCoursesTeaching) {
        super(name, address, CNIC, phone, dateOfBirth, employeeID, employeeDesignation);
        this.areaOfSpecialization = areaOfSpecialization;
        this.noOfCoursesTeaching = noOfCoursesTeaching;
    }

    @Override
    public void doResearchWork() {
        System.out.println("Faculty \'"+name+"\' is doing research work");
    }

    @Override
    public void doProject() {
        System.out.println("Faculty \'"+name+"\' is doing project");
    }
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Faculty: "+super.toString() + ", areaOfSpecialization='" + areaOfSpecialization + '\'' +
                ", noOfCoursesTeaching=" + noOfCoursesTeaching;
    }
}

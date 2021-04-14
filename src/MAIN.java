//  F2018065101
//  Raja Faizan Nazir
import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();

        arrayList.add(new Faculty("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, "Software Engineer", "AI", 3));
        arrayList.add(new Faculty("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, "Software Engineer", "AI", 3));
        arrayList.add(new MS_Student("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, 123, "Software Engineer", "AI"));
        arrayList.add(new MS_Student("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, 123, "Software Engineer", "AI"));
        arrayList.add(new BS_Student("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, 123, "Software Engineer", 6));
        arrayList.add(new BS_Student("Faizan", "Cavalry", 123, 123, new DateOfBirth(2, 2, 1999), 123, 123, "Software Engineer", 6));

        for (Person i : arrayList) {
            i.display();
            System.out.println("\tAge = " + i.getAge());
        }
    }

}

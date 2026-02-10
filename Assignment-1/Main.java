public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Shree");
        s1.setMarks(88.5);

        Student s2 = new Student(102, "Eengar", 92.0);

        s1.displayInfo();
        s2.displayInfo();
    }
}

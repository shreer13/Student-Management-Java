public class Main {
    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee("Amit", 40000);
        InternEmployee emp2 = new InternEmployee("Neha", 20000);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}


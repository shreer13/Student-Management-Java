class InternEmployee extends Employee {

    InternEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public void calculateSalary() {
        double finalSalary = baseSalary + (0.25 * baseSalary);
        displaySalary(finalSalary);
    }
}

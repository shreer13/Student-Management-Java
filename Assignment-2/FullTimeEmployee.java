class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public void calculateSalary() {
        double finalSalary = baseSalary + (0.50 * baseSalary);
        displaySalary(finalSalary);
    }
}

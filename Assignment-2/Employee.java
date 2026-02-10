class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displaySalary(double finalSalary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary before hike: " + baseSalary);
        System.out.println("Salary after hike: " + finalSalary);
    }
}


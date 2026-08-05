class PermanentEmployee extends Employee {
    protected int hourlyIncome;

    public PermanentEmployee(int hourlyIncome) {
        this.hourlyIncome = hourlyIncome;
    }

    public PermanentEmployee(String name, int empID, int hourlyIncome) {
        super(name, empID);
        this.hourlyIncome = hourlyIncome;
    }

    int calculate_income() {
        int salary = hourlyIncome * 180;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "This month salary @" + hourlyIncome + " PKR/Hour= " + calculate_income();
    }
}

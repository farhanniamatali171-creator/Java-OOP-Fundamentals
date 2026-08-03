class Employee {
    protected String name;
    protected int empID;

    public Employee() {
        this.name = "Ali";
        this.empID = 786;
    }

    public Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee :" + name + "(ID:" + empID + ")";
    }
}

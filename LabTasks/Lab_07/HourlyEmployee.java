import java.util.Scanner;

class HourlyEmployee extends Employee {
    protected int hourlyIncome;
    protected int totalHours;
    Scanner sc = new Scanner(System.in);

    public HourlyEmployee() {
        this.hourlyIncome = 0;
        this.totalHours = 0;
    }

    public HourlyEmployee(String name, int empID, int hourlyIncome) {
        super(name, empID);
        this.hourlyIncome = hourlyIncome;
        System.out.println("Enter total hours: ");
        totalHours = sc.nextInt();
    }

    int calculate_hourly_income() {
        int salary = hourlyIncome * totalHours;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis month salary= " + hourlyIncome + " * " + totalHours + " = " + calculate_hourly_income();
    }
}

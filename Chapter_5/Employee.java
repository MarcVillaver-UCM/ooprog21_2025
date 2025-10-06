class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_NUMBER_EMPLOYEE = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_NUMBER_EMPLOYEE)
            this.employeeNumber = MAX_NUMBER_EMPLOYEE;
        else
            this.employeeNumber = employeeNumber;

        if (payRate > MAX_RATE)
            this.payRate = MAX_RATE;
        else
            this.payRate = payRate;
    }

    public double getRegularPay(int hoursWorked) {
        int regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(int hoursWorked) {
        int overtimeHours = Math.max(hoursWorked - 40, 0);
        return overtimeHours * payRate * OVERTIME;
    }
}

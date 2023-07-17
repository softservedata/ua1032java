package homeworkTaskOne;

class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return getAvgMonSal();
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    private double getAvgMonSal() {
        return fixedMonthlyPayment;
    }
}

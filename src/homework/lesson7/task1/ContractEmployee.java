package homework.lesson7.task1;

public class ContractEmployee extends Employee {
    private float fixedMonthlyPayment;
    private String federalTaxIdNumber;

    public ContractEmployee(String employeeId, String name, float fixedMonthlyPayment, String federalTaxIdNumber) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public float calculatePay() {
        this.monthlyWage = fixedMonthlyPayment;
        return monthlyWage;
    }

    @Override
    public String toString() {
        return "\nContractEmployee { " +
                "name = " + name +
                ", federalTaxIdNumber = " + federalTaxIdNumber +
                ", monthlyWage = $" + monthlyWage +
                ", employeeId = " + employeeId +
                " }";
    }
}

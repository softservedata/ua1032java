package homeWork_7_OOP_Part_2.task1;

public class ContractEmployee extends Employee implements Payment{
    private String name;
    private double paymentForOneHour;
    private int numberOfHoursWorked;
    private String federalTaxIdmember;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public ContractEmployee(String employeeID, String name, double paymentForOneHour, int numberOfHoursWorked) {
        this.federalTaxIdmember=employeeID;
        this.name = name;
        this.paymentForOneHour = paymentForOneHour;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.salary = calculatePay();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +", federalTaxIdMember= "+federalTaxIdmember+"\n";
    }

    @Override
    public double calculatePay() {
        salary = paymentForOneHour*numberOfHoursWorked;
        return salary ;
    }


}

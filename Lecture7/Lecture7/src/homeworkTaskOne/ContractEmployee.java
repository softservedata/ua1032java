package homeworkTaskOne;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdMember;
    private double hourlyRate;
    private double numberOfHours;


    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, double numberOfHours) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return getAvgMonSal();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

     private double getAvgMonSal() {
        return hourlyRate * numberOfHours; // the average monthly salary = hourly rate * number of hours worked
    }
}

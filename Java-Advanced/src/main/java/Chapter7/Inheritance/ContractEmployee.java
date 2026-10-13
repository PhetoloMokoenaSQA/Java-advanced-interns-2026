package Chapter7.Inheritance;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class ContractEmployee extends Employee{
    private double rate;
    private int hoursWorked;

    public ContractEmployee(String empNumber, String name, int hours, double rate){
        super(empNumber,name,"");
        setRate(rate);
        setHoursWorked(hoursWorked);

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("rate: " + getRate());
        System.out.println("Hours: " + getHoursWorked());
        System.out.println("==============================================");
    }
}

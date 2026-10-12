package Chapter7.Inheritance;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class PermanentEmployee extends Employee{

    private double salary;

    public PermanentEmployee(String empNumber, String name, String email, double sal){
        super(empNumber,name,email);
        this.salary = sal;
        //this.email = email;
        //this.empNumber = empNumber;
        //this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void output(){
        System.out.println("yes");
    }
    @Override
    public void display(){
        System.out.println("Employee: " + getEmpNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("salary: " + getSalary());
        System.out.println("------------------------------------");
    }
}

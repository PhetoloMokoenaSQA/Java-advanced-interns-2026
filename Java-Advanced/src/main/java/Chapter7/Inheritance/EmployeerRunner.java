package Chapter7.Inheritance;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class EmployeerRunner {
    static void main(String[] args) {
        //Employee emp = new Employee();
        PermanentEmployee objPEmp = new PermanentEmployee("123456", "Jessica Smith", "Phete@lap.com", 15500);
        ContractEmployee objCEmp = new ContractEmployee("845698", "vusi five", 48, 250.75);

        objPEmp.display();
        objCEmp.display();
    }
}

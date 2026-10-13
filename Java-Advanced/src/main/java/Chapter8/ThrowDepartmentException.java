package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 */
public class ThrowDepartmentException{
    static void main(String[] args) throws DepartmentException {

        Department dp = new Department("Hr", 200,7);
       Department[] departments = new Department[5];

        try {
            departments[0] = new Department("IT", 101, 5);
            System.out.println("Department object succefully created");
        }catch (DepartmentException ex){
            System.err.println(ex.getMessage());
        }
        try {
            departments[1] = new Department("HR", 448, 4);
            System.out.println("Department object succefully created");
        }catch (DepartmentException ex){
            System.err.println(ex.getMessage());
        }try {
            departments[2] = new Department("Finance", 148, 6);
            System.out.println("Department object IS NOT succefully created");
        }catch (DepartmentException ex){
            System.err.println("Department has more than 2 Letters");
        }try {
            departments[3] = new Department("PR", 48, 6);
            System.out.println("Department object IS NOT succefully created");
        }catch (DepartmentException ex){
            System.err.println("DepartmentId is not in Range of 100 and 499");
        }try {
            departments[4] = new Department("PR", 48, 11);
            System.out.println("Department object IS NOT succefully created");
        }catch (DepartmentException ex){
            System.err.println("Employees is not in Range of 4 and 10");
        }try {
            departments[5] = new Department("Sales", 799, 1);
            System.out.println("Department object IS NOT succefully created");
        }catch (DepartmentException ex){
            System.err.println("Employees is not in Range of 4 and 10 \n" +
                                "DepartmentId is not in Range of 100 and 499\n" +
                                "Department has more than 2 Letters");
        }

    }
}

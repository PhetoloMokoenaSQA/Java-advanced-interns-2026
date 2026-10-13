package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 */
public class Department {
    private String department;
    private int  departmentId;
    private  int employees;

    public Department(String department, int departmentId, int employees) throws DepartmentException {
        setDepartment(department);
        setDepartmentId(departmentId);
        setEmployees(employees);
        this.department = department;
        this.departmentId = departmentId;
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    /**
     * Sets the Employees
     * @param employees Employees
     * @throws DepartmentException When the employees are less than 4 and greater than 10
     */
    public void setEmployees(int employees) throws DepartmentException {
        if (employees > 10 ){
            if(employees < 4){
                throw new DepartmentException("Number of Employess is less than 4 and greater than 10" + employees);
            }
        }
        this.employees = employees;
    }

    public String getDepartment() {
        return department;
    }

    /**
     * Set the Department
     * @param department Department
     * @throws DepartmentException When the department is not of 2 letters
     */
    public void setDepartment(String department) throws DepartmentException {
        if(department.length() != 2){
            throw new  DepartmentException("Department name should be of 2 letters");
        }
        this.department = department;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the departmentID
     * @param departmentId department id
     * @throws DepartmentException When the department id is not in the range of 100 and 499
     */
    public void setDepartmentId(int departmentId) throws DepartmentException {
       if(departmentId >= 499){
           if(departmentId <=100){
               throw new DepartmentException("DepartmentID out of bounds");
           }
       }

        this.departmentId = departmentId;
    }

}

package Chapter7;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class StudentRunner {
    static void main(String[] args) {

        Student objStudent = new Student();
        Student objThabo = new Student("112245", "Thabo", "smith" , "phete@email.com");
       objThabo.setAssesments(95,74,73);


        System.out.println("===========Default constructor======");
        objStudent.display();
        System.out.println("=========Overloaded Constructor============");
        objThabo.display();
    }
}

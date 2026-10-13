package Chapter7;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class Student {
    private String studentNum;
    private String firstname;
    private String lastname;
    private String email;
    private int testMark, assignment1, assignment2 ;


    /**
     * Construct on object of student with attributes
     * @param studentNum Student Number
     * @param firstname FirstName
     * @param lastname LastName
     * @param email Email
     */
    public Student(String studentNum, String firstname, String lastname, String email) {
        setStudentNum(studentNum);
        setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
        //this.studentNum = studentNum;
        //this.firstname = firstname;
        //this.lastname = lastname;
        //this.email = email;
    }

    /**
     * Constructor with Default Values
     */
    public Student() {
        studentNum = "00000000";
        firstname = "No name";
        lastname = "No Lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;

    }

    /**
     * Set Student Number with ST- Prefix
     * @param stNum
     */
    public void setStudentNum(String stNum){
        this.studentNum = "ST_26" + stNum ;
    }

    /**
     * Set LastName
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Set Email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Set FirstName
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Set All Test
     * @param test Tes
     * @param assignment1 Assignment1
     * @param assignment2 Assignment2
     */
    public void setAssesments(int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1 ;
        this.assignment2 = assignment2 ;
    }

    /**
     * Get current value of Student number
     * @return
     */
    public String getStudentNum(){
        return  studentNum ;
    }

    /**
     * Get Current Name and Surname
     * @return
     */
    public String getName(){
        return  firstname + " " + lastname ;
    }

    /**
     * Get Current Email
     * @return
     */
    public String getEmail(){
        return email ;
    }

    /**
     * Get the Semester Mark
     * @return
     */
    public double getSemesteerMark(){
        //Test * 40%, Assignment1 * 35%, Assignment2 * 25
        return  (this.testMark * 0.4) + (this.assignment1 * 0.35) + (this.assignment2 * 0.25) ;
    }

    /**
     * Display all the Fields And marks of Student
     */
    public void display(){
        System.out.println("StudentNo: " + getStudentNum() );
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Semester Mark: " + getSemesteerMark());
    }

}

package Chapter7.Abstraction;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public abstract class Student {
    /**
     * Calculate and return the semester mark
     * @param test Test Mark As Integer
     * @param assignment1 Assignment1 Mark As Integer
     * @param assignment2 Assignment2 Mark As Integer
     * @return Semester Mark
     */
    public abstract double calculateSemesterMark(int test, int assignment1, int assignment2);

    /**
     * Calculate and return Semester Mark
     * @param semesterMark semester mark
     * @return final mark
     */
    public abstract double calculateFinalMark(double semesterMark);

    /**
     * Display Student Details
     */
    public abstract void display();

}

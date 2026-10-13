package Chapter7.Abstraction;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class FullTimeStudent extends Student{

    private double examMark;

    public double getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    /**
     * Calculate and return the semester mark
     *
     * @param test        Test Mark As Integer
     * @param assignment1 Assignment1 Mark As Integer
     * @param assignment2 Assignment2 Mark As Integer
     * @return Semester Mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return (test * 0.34) + (assignment1 * 0.33) + (assignment2 *0.33);
    }

    /**
     * Calculate and return Semester Mark
     *
     * @param semesterMark semester mark
     * @return final mark
     */
    @Override
    public double calculateFinalMark(double semesterMark) {
        return semesterMark + getExamMark();
    }

    /**
     * Display Student Details
     */
    @Override
    public void display() {

    }
}

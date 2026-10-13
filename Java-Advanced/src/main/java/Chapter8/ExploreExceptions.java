package Chapter8;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 */
public class ExploreExceptions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int numerator, denominator;
        double quotient;

        try {

            System.out.println("Enter your name..");
            name = sc.next();
            System.out.println("Enter numerator: ");
            numerator = sc.nextInt();
            System.out.println("Enter denominator: ");
            denominator = sc.nextInt();



            quotient = numerator / denominator;

            System.out.format("""
                Name        :   %s
                The Last letter of your name(%s) is: %s
                Numerator   :   %d
                Denominator :   %d
                Quotient    :   %.2f
                """, name,name,name.substring(4),quotient);

        }catch (InputMismatchException ex){
            System.err.println("Incorrect input. " + ex.getCause());
        }catch (ArithmeticException ex){
            System.err.println("Cannot devide by zero");
        }catch (StringIndexOutOfBoundsException ex){
            System.err.println("The last letter of your name ");
        }

    }
}

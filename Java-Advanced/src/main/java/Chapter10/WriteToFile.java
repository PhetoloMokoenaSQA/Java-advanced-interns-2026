package Chapter10;

import java.io.*;

/**
 * Project: Java-Advanced
 * Date  : 10/15/2026
 *
 * @author: Phetolo Mokoena
 */
public class WriteToFile {
    static void main(String[] args) {
        //Path
        String filePath = "src/main/resources/Hobbies.txt";
        //Create a file resource
        File hobbiesFile = new File(filePath);
        try {

            PrintStream pen = new PrintStream(new FileOutputStream(hobbiesFile,true));
            if (hobbiesFile.exists()){
                pen.println("Maphete");
            }else {
                hobbiesFile.createNewFile();
                pen.println("Formula1");
                pen.println("Football");
                pen.println("Cricket");
            }
            pen.close();
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println("Cannot write to the file" + ex.getMessage());
        }

        System.out.println("Abs Path: "+ hobbiesFile.getAbsolutePath());
        System.out.println("Path: "+ hobbiesFile.getPath());
        System.out.println("Parent: "+ hobbiesFile.getParent());
        System.out.println("Last Modified: "+ hobbiesFile.lastModified());

    }
}

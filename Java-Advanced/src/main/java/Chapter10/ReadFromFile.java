package Chapter10;

import java.io.*;


/**
 * Project: Java-Advanced
 * Date  : 10/15/2026
 *
 * @author: Phetolo Mokoena
 */
public class ReadFromFile {
    static void main(String[] args) {
        String filePath = "src/main/resources/Modules.txt";
        File moduleFile = new File(filePath);
        String text;
        try {
            FileReader fileReader = new FileReader(moduleFile);//Opens/prepares the file for reading
            BufferedReader reader = new BufferedReader(fileReader);//Do actual reading
//            String text = reader.readLine();
            //System.out.println(text);

            while ((text = reader.readLine()) != null){
                System.out.println(text);
            }

            reader.close();
            fileReader.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());;
        }

        //BufferedReader br = new BufferedReader();

    }
}

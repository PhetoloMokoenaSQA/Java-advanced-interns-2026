package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Project: Java-Advanced
 * Date  : 10/15/2026
 *
 * @author: Phetolo Mokoena
 */
public class ReadFromExcel {
    static void main(String[] args) {
        String filePath = "src/main/resources/Rusults.xlsx";

        try {
            FileInputStream fileInput = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet ){
                for (Cell cell: row){
                    switch (cell.getCellType()){
                        case STRING -> System.out.println(cell.getNumericCellValue()+ "\t");
                        case NUMERIC -> System.out.println(cell.getNumericCellValue()+ "\t");
                        default -> System.out.println("Type not needed (" + cell.getCellType() + ")");
                    }
                    System.out.println(cell.getNumericCellValue());
                }
                System.out.println();
            }
            fileInput.close();
            workbook.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

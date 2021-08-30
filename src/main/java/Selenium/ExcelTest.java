package Selenium;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.common.usermodel.*;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

    public static void main(String args[]) throws IOException {

        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Pinaki Kundu\\Desktop\\TestSheet.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        Map<String,String> map = new HashMap<>();
        String key = "";
        String value = "";
        DataFormatter formatter = new DataFormatter();

        for (int i = 1; i <= sheet.getLastRowNum() ; i++) {
            String col1 = formatter.formatCellValue( sheet.getRow(i).getCell(0));
            String col2 = formatter.formatCellValue( sheet.getRow(i).getCell(1));
                map.put(col1,col2);

        }


        for (Map.Entry<String,String> m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
            if (m.getKey().equals("2")){
                System.out.println(m.getValue());
            }
        }


    }




}

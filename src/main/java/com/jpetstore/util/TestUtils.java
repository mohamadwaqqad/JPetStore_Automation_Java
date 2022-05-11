package com.jpetstore.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtils {

    public static Object[][] getDataFromExcel(String sheetName) throws Exception {
        File file = new File(
                System.getProperty("user.dir") + "\\src\\main\\java\\com\\jpetstore\\config\\JPetStoreTestData.xlsx");
        FileInputStream fis = new FileInputStream(file);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet(sheetName);

        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(0).getLastCellNum();

        Object data[][] = new Object[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        return data;
    }
}

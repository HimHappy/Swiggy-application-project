package com.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataClass {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\hrajak\\JAVA SELENIUM WS\\sheet\\Book1.xlsx");
			Workbook factory = WorkbookFactory.create(fileInputStream);
			Sheet sheet = factory.getSheet("SwiggyData");
			for(Row rows : sheet) {
				if(rows.getRowNum()!=0) {
				ArrayList<String> list = new ArrayList<String>(2);
				for (Cell cell3 : rows) {
					if (cell3.getCellType() == Cell.CELL_TYPE_STRING) {
						System.out.print(cell3.getStringCellValue()+" ");
						list.add(cell3.getStringCellValue());
					}
				}
				list.clear();
				}
			}
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

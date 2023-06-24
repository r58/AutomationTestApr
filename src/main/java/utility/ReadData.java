package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	
	//We need to add tool/dependencies under POM.xml 
	//Read excel file with the help of FileInputStream 
	//Workbook > sheets > rows and columns > cells.
	static XSSFWorkbook  workbook;
	public static String[][] testData() {
		
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\AutomationTestingApril23\\TestData\\ContactData.xlsx");
		//MS EXCEL FILE
		
		workbook = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//Need to move into sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		
		String data[][] = new String[rows][col];
		
		for(int i=0;i<rows;i++) {	//outer for loop will handle rows
			
			for(int j=0;j<col;j++) {	//inner for loop will handle column/cell data
			
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				//System.out.print(data+"    ");
			}
			System.out.println();
		}
		return data;
		
	}
}

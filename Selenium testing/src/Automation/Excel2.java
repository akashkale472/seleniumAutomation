package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		String path="C:\\Users\\Dell\\Desktop\\Book1.xlsx"	;
		
		FileInputStream file =new FileInputStream(path);

		
	//	String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	//	System.out.println(value);
		
	//	double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(10).getCell(0).getNumericCellValue();
	//	System.out.println(data);
		
		Date d=WorkbookFactory.create(file).getSheet("Sheet1").getRow(11).getCell(0).getDateCellValue();
		System.out.println(d);
		
}
}
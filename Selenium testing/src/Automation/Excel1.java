package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		String path="C:\\Users\\Dell\\Desktop\\Book1.xlsx"	;
		FileInputStream file =new FileInputStream(path);
		
		Workbook book=WorkbookFactory.create(file);
		
		String value=book.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		
		String value1=book.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value1);
		
		String value3=book.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value3);
		
		
		String value4=book.getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value4);
		
		
		
		String value5=book.getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
		System.out.println(value5);
		
		
		
	//	String value3=book.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
	//	System.out.println(value3);
		
		
		
	//	String value3=book.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
	//	System.out.println(value3);
		
		
		
		
		
}
}
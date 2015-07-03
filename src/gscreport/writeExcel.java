/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gscreport;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class writeExcel {
	
	/**
	 * @author Aaron Whittle
	 * @param args
	 * @throws IOException
	 * @throws WriteException
	 * @throws RowsExceededException
	 */
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		
		// Give file path
		File fExcel = new File("C:\\users\\Aaron\\desktop\\createExcel.xls");
		
		// Create Workbook
		WritableWorkbook writableBook = Workbook.createWorkbook(fExcel);
		
		// Create Sheet
		writableBook.createSheet("Data", 0);
		
		// Get sheet to write the content
		WritableSheet writableSheet = writableBook.getSheet(0);
		
		// Add cell data
		Label data1 = new Label(0,0,"testdata1@gmail.com");
		writableSheet.addCell(data1);
		
		Label data2 = new Label(0,1,"testdata2@gmail.com");
		writableSheet.addCell(data2);
		
		// Write workbook
		writableBook.write();
		
		// Close workbook
		writableBook.close();		
		
	}
}

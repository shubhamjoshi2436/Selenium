package Default;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
			//FileInputStream fis=new FileInputStream("‪.\\data\\data.xlsx");
			File f=new File(".\\data\\data.xlsx");
		Workbook w=WorkbookFactory.create(f);
			Sheet sh = w.getSheet("Sheet1");
			Row firstrow = sh.getRow(0);
			int rowcount = sh.getPhysicalNumberOfRows();
			for (int i = 0; i < rowcount; i++) 
			{
				for (int j = 0; j <firstrow.getLastCellNum() ; j++) 
				{
					Cell cl = sh.getRow(i).getCell(j);
					System.out.print(cl+ "  ");
				}
				System.out.println();

			}
			
	}

}

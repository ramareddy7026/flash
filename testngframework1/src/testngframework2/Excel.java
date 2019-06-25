package testngframework2;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getdata(String p,String s,int r,int c)
	{
		String v="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(p));
			v=wb.getSheet(s).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}

}

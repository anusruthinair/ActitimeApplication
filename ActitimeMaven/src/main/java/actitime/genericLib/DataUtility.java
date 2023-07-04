package actitime.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	  String url;
	  String un;
	  String pwd;
		
	 public String getDatafromProperties(String key)throws IOException {
		 //to conveting external file to java format
			FileInputStream fis = new FileInputStream("C:\\Users\\LUKESH NAYAK\\Dropbox\\PC\\Documents\\OCSM20\\TestDATA\\commondata.properties");
			Properties pobj = new Properties();
			//load the file inside the properties file
			pobj.load(fis);
			//fetch data
			/*this.url = pobj.getProperty("Url"); //key value url
			this.un = pobj.getProperty("Username"); //key value username
		    this.pwd = pobj.getProperty("Password");
		    */
		    String value = pobj.getProperty(key);
		 return value;
	  }
	 public String getDataFromExcelsheet(String sheetname, int rownum, int cellnum) throws IOException{
		 FileInputStream fis = new FileInputStream("C:\\Users\\LUKESH NAYAK\\Dropbox\\PC\\Documents\\OCSM20\\TestDATA\\Book1.xlsx");
		  Workbook book = WorkbookFactory.create(fis);
		  Sheet sh = book.getSheet(sheetname);
		  DataFormatter format = new DataFormatter();
		  String value= format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		  return value;

 }
}

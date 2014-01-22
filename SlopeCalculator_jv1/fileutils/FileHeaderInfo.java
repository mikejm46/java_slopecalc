package fileutils;

import java.text.DateFormat;
import java.util.Date;

public class FileHeaderInfo 
{
	static String modelNumber;
	static String serialNumber;
	static String idNumber;
	static String specification;
	static String section;
	static String category;
	static String notes;
	static String divider;
	static String dateNow;
	static int charCount = 35;
	

	public FileHeaderInfo()
	{
	}
	
	//print a row of *'s
	public static String printDivider()
	{
		divider = "*";
		
		for (int i = 0; i <charCount; i++)
		{
			divider = divider + "*";
		}
		return divider + "\n";
	}
	
	public static String getModelNumber()
	{
		return "Model: " + modelNumber;
	}
	
	public static String setModelNumber(String modelNum)
	{
		modelNumber = modelNum;
		return modelNumber;
	}
	public static String getSerialNumber()
	{
		return "Serial: " + serialNumber;
	}
	
	public static String setSerialNumber(String serialNum)
	{
		serialNumber = serialNum;
		return serialNumber;
	}
	
	public static String getIDNumber()
	{
		return "I.D. : " + idNumber;
	}
	
	public static String setIDNumber(String idNum)
	{
		idNumber = idNum;
		return idNumber;
	}
	
	public static String getSpecification()
	{
		return "Specification: " + specification;
	}
	
	public static String setSpecification(String spec)
	{
		specification = spec;
		return specification;
	}
	
	public static String getSection()
	{
		return "Section: " + section;
	}
	
	public static String setSection(String sect)
	{
		section = sect;
		return section;
	}
	
	public static String getCategory()
	{
		return "Category: " + category;
	}
	
	public static String setCategory(String catg)
	{
		category = catg;
		return category;
	}
	
	public static String getNotes()
	{
		return "NOTES: " + notes;
	}
	
	public static String setNotes(String note)
	{
		notes = note;
		return notes;
	}
	
	public static String getDate()
	{
		Date datetime = new Date();
		return dateNow = "Date: " + datetime.toString();
		
	}

	
}

package framework.DataDriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Read_propertyFile 
{
	
	static FileInputStream fi;
	static String ifilepath="src\\framework\\DataDriven\\PropertyFiles\\input.properties";
	static String ofilepath="src\\framework\\DataDriven\\PropertyFiles\\input.properties";
	static Properties prop;
	
	public static void Load_PropertyFile()
	{
		try {
			fi=new FileInputStream(ifilepath);
			prop=new Properties();
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Store_PropertyFile()
	{
		try {
			prop.store(new FileOutputStream(ofilepath), "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String  getProperty(String Keyname)
	{
		Load_PropertyFile();
		return prop.getProperty(Keyname);
	}
	
	public static void setProperty(String keyname,String value)
	{
		prop.setProperty(keyname, value);
	}

}

package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public String getPropertyData(String Key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(Key);
		
	}

}

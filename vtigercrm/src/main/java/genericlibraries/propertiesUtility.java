package genericlibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;

public class propertiesUtility {
public String readingDataFromProprtyFile(String Key)throws IOException {
	FileInputStream file=new FileInputStream(IAutoContantes.PROPERTYFILE);
	Properties property=new Properties();
	property.load(file);
	return property.getProperty(Key);
	
	
}
}

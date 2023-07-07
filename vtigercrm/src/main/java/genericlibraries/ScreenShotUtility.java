package genericlibraries;

import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShotUtility  extends baseClass {
public static String takingScreenshot(String screenshotName)throws IOException {
TakesScreenshot screenshot=(TakesScreenshot)driver;
File photo=screenshot.getScreenshotAs(OutputType.FILE);
String idt=LocalDateTime.now().toString().replace(":","_");
String path=System.getProperty("user.dir")+IAutoContantes.SSPATH+screenshotName+" "+". png";
File destination=new File(path);
FileUtils.copyFile(photo, destination);
return path;
}
}
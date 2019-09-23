package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * @author nisha
 *
 */
public class Utility {
    public static WebDriver driver = null;
    
    /*public static void main(String args[]) {
    	try {
			//formattedDate();
			compareDates("2019-09-26", "Thu, 26 Sep");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/

    public static WebDriver OpenBrowser() throws Exception{
        String sBrowserName;
        try{
            //System.setProperty("webdriver.chrome.driver","chromedriver");
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(Constants.URL);
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println("--Exception in Utility class--"+e.getMessage());
        }
        return driver;
    }

    public static String formattedDate() throws ParseException {
        String departureDate = "2019-09-26";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date d1 = df.parse(departureDate);
        String expectedDate = new SimpleDateFormat("EEE, dd MMM").format(d1);

        System.out.println("--expectedResult"+expectedDate.replaceAll("\\.", "")+"--");
        String temp1= expectedDate.replaceAll("\\.", "");
        //d1.compareTo(anotherDate)
        return expectedDate;
    }
    
    
}

package testcases;

import moduleActions.PlanTripsActions;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pageObjects.PlanTripObjects;
import utils.Utility;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class FlightTests {

    WebDriver driver;

    @BeforeTest
    public void setUp(){

    try{
        driver = Utility.OpenBrowser();
        new BaseClass(driver);
    }catch(Exception ex){
        System.out.println("--exception in setup method--"+ex.getMessage());
    }

    }

    @Test
    public void test() throws InterruptedException{
        try {

            PlanTripsActions.selectOneWay();//select one way
            PlanTripsActions.selectOrigin();//selecting the origin
            PlanTripsActions.selectDestination();//selecting the destination
            PlanTripsActions.selectDate();//selecting the date
            PlanTripsActions.selectDoneObject();// hit Done
            
            PlanTripsActions.selectNonStop();

            Thread.sleep(5000);
           
            String originInResult = PlanTripsActions.getOriginInResult();//get IATA code for origin from result
            System.out.println("--originInResult--"+originInResult+"--");
            String destinationInResult = PlanTripsActions.getDestinationInResult();//get IATA code for destination from result
            String actualDate = PlanTripsActions.getDateInResult();//get date  from result
            System.out.println("--dateInResult "+actualDate+"--");
            String expectedDate = Utility.formattedDate(Utility.formattedDate_Nu());

            Assert.assertTrue("YYZ".equalsIgnoreCase(originInResult),"Origin is not YYZ");
            Assert.assertTrue("YYC".equalsIgnoreCase(destinationInResult),"Origin is not YYC");
            Assert.assertTrue(expectedDate.equalsIgnoreCase(actualDate), "Date did not match");

            PlanTripsActions.expandResult();

            Assert.assertTrue(driver.findElement(By.xpath("(//hairline-button[text()='Select flight'])[1]")).isDisplayed());
            Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='gws-flights-results__expanded-itinerary gws-flights-results__itinerary']/*[@class='gws-flights-results__itinerary-price'])[1]")).isDisplayed());

        }catch(ParseException ex) {
            System.out.println("---ParseException from Utility Class--"+ex.getMessage());
        }catch (Exception ex){
            System.out.println("--Exception in Testcase class--"+ex.getMessage());
        }
    }

    @AfterTest
    public void tearDown(){
        //driver.close();
        driver.quit();
    }
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import utils.Constants;
import utils.Utility;

import java.time.Duration;
import java.util.function.Function;

public class PlanTripObjects extends BaseClass{

    private WebElement element = null;
    public Wait<WebDriver> wait;

    public PlanTripObjects(WebDriver driver, Wait wait){
        super(driver);
        /*this.wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(8))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(ElementClickInterceptedException.class);*/
    }

    public static String ONE_WAY_OBJECT = "//*[@role='button'][@data-flt-ve='ticket_type_selector']";
    public static String ONE_WAY_ELEMENT = "//*[@role='menuitemradio']//span[text()='One-way']";

    public static String INITIAL_ORIGIN_XPATH = "//*[@class='gws-flights__flex-box gws-flights__align-center']//div[@data-flt-ve='origin_airport']";
    public static String ORIGIN_AFTER_CLICK = "//*[@placeholder='Where from?']";
    public static String SELECT_ORIGIN = "//*[@class='fsapp-option-city-name'][text()='Toronto Pearson International Airport']";

    public static String INITIAL_DESTINATION_XPATH = "//*[@class='gws-flights__flex-box gws-flights__align-center']//div[@data-flt-ve='destination_airport']";
    public static String DESTINATION_AFTER_CLICK = "//*[@placeholder='Where to?']";
    public static String SELECT_DESTINATION = "//*[@class='fsapp-option-city-name'][text()='Calgary, Alberta']";

    public static String DATE_ELEMENT = "(//*[@class='gws-flights__flex-filler gws-flights__ellipsize gws-flights-form__input-target'])[1]";
    public static String SELECT_DATE = "//calendar-day[@data-day='"+ Utility.formattedDate_Nu() +"']";
    public static String DONE_ELEMENT = "//g-raised-button[@data-flt-ve='done']/div[text()='Done']";

    public static String STOPS_ELEMENT = "//*[@role='button'][@data-flt-ve='stops']";
    public static String NONSTOP_ELEMENT = "//*[@role='radio'][@data-flt-ve='stops_option']/*[text()='Non-stop only']/..";
    public static String NONSTOP_CLOSE = "//*[@class='gws-flights-filter__filter-dialog-close']/span";
    
    public static String EXPAND_ELEMENT = "//*[@class='gws-flights-results__expand'])[1]";

    public static String ORIGIN_IN_RESULT = "(//*[@class='gws-flights-results__result-list']/li)[1]//*[@class='gws-flights-results__leg-departure gws-flights__flex-box flt-subhead1Normal']//span[@class='gws-flights-results__iata-code']";
    public static String DESTINATION_IN_RESULT = "(//*[@class='gws-flights-results__result-list']/li)[1]//*[@class='gws-flights-results__leg-arrival gws-flights__flex-box flt-subhead1Normal']//*[@class='gws-flights-results__iata-code']";

    public static String DATE_IN_RESULT = "(//*[@class='gws-flights__flex-filler gws-flights-results__itinerary-details-heading-text'])[1]/span[3]";



    public static WebElement getInitialOriginElement()throws Exception{
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(INITIAL_ORIGIN_XPATH));
            }*/
       // });
        sleepForSometime();
        return driver.findElement(By.xpath(INITIAL_ORIGIN_XPATH));
    }

    public static WebElement getOriginElementAfterClick(){
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(ORIGIN_AFTER_CLICK));
            }
        });*/
        sleepForSometime();
        return driver.findElement(By.xpath(ORIGIN_AFTER_CLICK));
    }

    public static WebElement selectOriginElementAfterClick(){
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(SELECT_ORIGIN));
            }
        });*/
        sleepForSometime();
        return driver.findElement(By.xpath(SELECT_ORIGIN));
    }

    public static WebElement getInitialDestinationElement(){
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(INITIAL_DESTINATION_XPATH));
            }
        });*/
        sleepForSometime();
        return driver.findElement(By.xpath(INITIAL_DESTINATION_XPATH));
    }

    public static WebElement getDestinationElementAfterClick(){
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(DESTINATION_AFTER_CLICK));
            }
        });*/
        sleepForSometime();
        return driver.findElement(By.xpath(DESTINATION_AFTER_CLICK));
    }

    public static WebElement selectDestinationElementAfterClick(){
        /*return wait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath(SELECT_DESTINATION));
            }
        });*/
        sleepForSometime();
        return driver.findElement(By.xpath(SELECT_DESTINATION));
    }

    public static WebElement getDateObject(){
        sleepForSometime();
        return driver.findElement(By.xpath(DATE_ELEMENT));
    }

    public static WebElement getSpecificDateElement(){
        sleepForSometime();
        return driver.findElement(By.xpath(SELECT_DATE));
    }

    public static WebElement getDoneElement(){
        sleepForSometime();
        return driver.findElement(By.xpath(DONE_ELEMENT));
    }

    public static WebElement getStopsObject(){
        sleepForSometime();
        return driver.findElement(By.xpath(STOPS_ELEMENT));
    }

    public static WebElement getNonStopElement(){
        sleepForSometime();
        return driver.findElement(By.xpath(NONSTOP_ELEMENT));
    }
    
    public static WebElement getNonStopCloseElement() {
    	sleepForSometime();
    	return driver.findElement(By.xpath(NONSTOP_CLOSE));
    }

    public static WebElement getOneWayElement(){
        sleepForSometime();
        return driver.findElement(By.xpath(ONE_WAY_ELEMENT));
    }

    public static WebElement getOneWayObject(){
        sleepForSometime();
        return driver.findElement(By.xpath(ONE_WAY_OBJECT));
    }

    public static WebElement getExpandResultElement(){
        sleepForSometime();
        return driver.findElement(By.xpath(EXPAND_ELEMENT));
    }

    public static WebElement getOriginInResult(){
        sleepForSometime();
        return driver.findElement(By.xpath(ORIGIN_IN_RESULT));
    }

    public static WebElement getDestinationInResult(){
        sleepForSometime();
        return driver.findElement(By.xpath(DESTINATION_IN_RESULT));
    }

    public static WebElement getDateInResult(){
        sleepForSometime();
        return driver.findElement(By.xpath(DATE_IN_RESULT));
    }

    public static void sleepForSometime(){
        try{
            Thread.sleep(2000);
        }catch(Exception ex){
            System.out.println("--exception in PlanTripObjectClass--"+ex.getMessage());
        }
    }

}



package moduleActions;

//import pageObjects.FligthActions;

import pageObjects.PlanTripObjects;

public class PlanTripsActions {

    public static void selectOneWay(){
        PlanTripObjects.getOneWayObject().click();
        PlanTripObjects.getOneWayElement().click();
    }

    public static void selectOrigin()throws Exception{

        System.out.println("--in PlanTripsActions--");
        PlanTripObjects.getInitialOriginElement().click();
        PlanTripObjects.getOriginElementAfterClick().click();
        PlanTripObjects.getOriginElementAfterClick().clear();

        PlanTripObjects.getOriginElementAfterClick().sendKeys("Toronto");

        PlanTripObjects.selectOriginElementAfterClick().click();
    }

    public static void selectDestination()throws Exception{

        PlanTripObjects.getInitialDestinationElement().click();
        PlanTripObjects.getDestinationElementAfterClick().click();
        PlanTripObjects.getDestinationElementAfterClick().clear();

        PlanTripObjects.getDestinationElementAfterClick().sendKeys("Calgary");

        PlanTripObjects.selectDestinationElementAfterClick().click();
    }

    public static void selectDate(){

        PlanTripObjects.getDateObject().click();
        PlanTripObjects.getSpecificDateElement().click();

    }

    public static void selectNonStop(){
System.out.println("--2--");
        PlanTripObjects.getStopsObject().click();
        System.out.println("--3--");
        PlanTripObjects.getNonStopElement().click();
        System.out.println("--4--");
        PlanTripObjects.getNonStopCloseElement().click();
    }

    public static void selectDoneObject(){
System.out.println("--1--");
        PlanTripObjects.getDoneElement().click();
    }

    public static void expandResult(){
        PlanTripObjects.getExpandResultElement().click();
    }

    public static String getOriginInResult(){
        return PlanTripObjects.getOriginInResult().getAttribute("innerText");
    }

    public static String getDestinationInResult(){
        return PlanTripObjects.getDestinationInResult().getAttribute("innerText");
    }

    public static String getDateInResult(){
        return PlanTripObjects.getDateInResult().getAttribute("innerText");
    }
}

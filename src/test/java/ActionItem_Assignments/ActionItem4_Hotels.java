package ActionItem_Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ActionItem4_Hotels {
    public static void main(String[] args) throws InterruptedException {

        //setting up for Chrome web driver
        WebDriverManager.chromedriver().setup();

        //setting up Chrome options
        ChromeOptions options = new ChromeOptions();

        //options to maximize chrome meeting screen
        options.addArguments("start-maximized", "incognito");

        //create new chromedriver and pass options
        WebDriver driver = new ChromeDriver(options);

        //create array list of states
        ArrayList<String> destination = new ArrayList<>();
        destination.add("Virginia");
        destination.add("Michigan");
        destination.add("New York");

        //array list of adult passengers
        ArrayList<Integer> adults = new ArrayList<>();
        adults.add(1);
        adults.add(2);
        adults.add(3);

        for (int i = 0; i < destination.size(); i++) ;
        {

            //navigate to hotels.com website
            driver.navigate().to("https://hotels.com");
            //wait two seconds
            Thread.sleep(2000);

            try {
                //click on the location search bar
                driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']")).click();
                //enter state name
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(destination.get (1));
                //wait two seconds
                Thread.sleep(2000);
                //click on drop down
                //driver.findElement(By.xpath("//*[@id ='destination_form_field']")).sendKeys(Keys.ENTER);
                //ArrayList
                ArrayList<WebElement> destinations = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='destination_form_field-result-item-button']")));
                destinations.get(0).click();
            } catch (Exception e) {
                System.out.println("Destination error" + e);
            }//end of try catch
            //wait one second
            Thread.sleep(1000);

            try {
                driver.findElement(By.xpath("//*[@class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']")).click();
                Thread.sleep(2000);
                ArrayList<WebElement> minusButton = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-step-input-button']")));
                minusButton.get(0).click();
                //wait two seconds
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("Traveler error" + e);
            }//end of try catch

            for (int j = 1; j < adults.get(1); j++) {
                //click on plus sign button
                driver.findElement(By.xpath("//*[@aria-label='Increase the number of adults in room 4']")).click();
                // wait two seconds
                Thread.sleep(2000);
            }// end of nested loop

            try {
                // clicking on done button
                driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']")).click();
                //clicking on search button
                driver.findElement(By.xpath("//*[@id= 'submit_button']")).click();
                // wait two seconds
                Thread.sleep(2000);
            } catch (Exception e){
                System.out.println("Submission error" + e);
            }// end of try catch

            // arrayList for tabs
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1+1));
            //wait two seconds
            Thread.sleep(2000);
            //string variable for hotel name
            String resortName = driver.findElement(By.xpath("//*[@class='uitk-heading uitk-heading-3']")).getText();
            System.out.println(resortName);
            //wait two seconds
            Thread.sleep(2000);

            try {
                //clicking on reserve button
                driver.findElement(By.xpath("//*[@data-stid='sticky-button']")).click();
                //click on the third option from the list
                String HotelPrice = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                //print the price
                System.out.println(HotelPrice);
                //click on reserve button
                //wait two seconds
                Thread.sleep(2000);
                driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
                //wait two seconds
                Thread.sleep(2000);

            }catch(Exception e){
                System.out.println("error" + e);
            }//End of try catch

            driver.switchTo().window(tabs.get(0));
            // wait two seconds
            Thread.sleep(2000);


        }//end of for loop
        //end of main
        driver.quit();
    }// end of main
}// end of java class
// }

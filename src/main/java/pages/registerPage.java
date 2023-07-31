package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerPage {
    WebDriver driver;

    public registerPage(WebDriver driver){
        this.driver=driver;
    }

    //locator dari register button
    By FirstnameField=By.id("customer.firstName");
    By LastNameField=By.name("customer.lastName");

    //metode click register button
    public void inputNameData(String firstname, String lastname){
        driver.findElement(FirstnameField).sendKeys(firstname);
        driver.findElement(LastNameField).sendKeys(lastname);
    }

}

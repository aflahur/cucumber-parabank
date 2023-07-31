package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver=driver;
    }

    //locator dari register button
    By RegisterButton=By.xpath("//a[contains(@href,'register')]");

    //metode click register button
    public void clickRegister(){
        driver.findElement(RegisterButton).click();
    }

}

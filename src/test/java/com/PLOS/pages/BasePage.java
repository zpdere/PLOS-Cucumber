package com.PLOS.pages;

import com.PLOS.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public boolean navigatorModule(String module){
        String xpath = "(//a[.='"+module+"'])[1]";

  return Driver.getDriver().findElement(By.xpath(xpath)).isDisplayed();
}
}
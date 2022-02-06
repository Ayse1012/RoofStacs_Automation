package com.roofStacs.page;

import com.roofStacs.utilities.BrowserUtils;
import com.roofStacs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.List;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[4]")
    public WebElement career2;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
    public List<WebElement> menuList;

    @FindBy(css = "#myModalClose")
     public WebElement xButton;

    @FindBy(xpath = "//h4[text()='Product']")
    public WebElement careerMenu;

    @FindBy(xpath = "//h4[text()='Lead Product Tester']")
    public WebElement leadProduc;

    @FindBy(xpath = "//h3[contains(text(),' Make an application')]")
    public WebElement sendCv;

    @FindBy(css = "#btn_upload")
    public WebElement uploadFile;

    @FindBy(css = "#file")
    public WebElement addFile;

    @FindBy(css = "#email")
    public WebElement inputEmail;

    public void navigateMenu(int number){
       WebElement menuWithNumber= Driver.get().findElement(By.xpath("//ul[@class='nav navbar-nav']/li["+number+"]"));
       menuWithNumber.click();
    }
    public void navigateCareerMenu(String menu){
        WebElement careers=Driver.get().findElement(By.xpath("//h4[text()='"+menu+"']"));
        BrowserUtils.clickWithJS(careers);
        //careers.click();
    }
    public void navigateLeadProducMenu(String menu){

        WebElement leadProduc=Driver.get().findElement(By.xpath("//h4[text()='"+menu+"']"));
        BrowserUtils.clickWithJS(leadProduc);

    }
    public void setAddFile(String filePath){
        addFile.sendKeys(filePath);
        BrowserUtils.waitFor(2);
        uploadFile.click();
    }





}

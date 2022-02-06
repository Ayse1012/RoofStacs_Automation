package com.roofStacs.stepDefinitions;

import com.roofStacs.page.BasePage;
import com.roofStacs.utilities.BrowserUtils;
import com.roofStacs.utilities.ConfigurationReader;
import com.roofStacs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class testStepDefn {
        BasePage basePage=new BasePage();

    @Given("the user must go to home page")
    public void the_user_must_go_to_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        //BrowserUtils.waitForClickablility(basePage.xButton,15);
        basePage.xButton.click();
        BrowserUtils.waitFor(4);
    }

    @When("the user goes to {string} page")
    public void the_user_goes_to_page(String product) {
        basePage.navigateCareerMenu(product);

    }

    @When("the user goes to career page")
    public void theUserGoesToCareerPage() {

        basePage.career2.click();
    }

    @And("the user click to {string}")
    public void theUserClickTo(String products) {

        BrowserUtils.waitFor(3);
        basePage.navigateLeadProducMenu(products);

    }

    @And("The user verify {string}")
    public void theUserVerify(String expectedTitle) {
       String actualTitle= Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @And("the user click to sendcv")
    public void theUserClickToSendcv() {
        BrowserUtils.waitFor(2);
        basePage.sendCv.click();

    }

    @And("user enter file {string}")
    public void userEnterFile(String fullPath) {
        //dosya ekleme 1. yol(sytem ve resources a eklenen path den bulma)
        //String projectPath = System.getProperty("user.dir");
        //String filePath= "src/test/resources/file2.txt";
        //String fullPath1=projectPath+"/"+filePath;

        //dosya ekleme 2.yol(masa üstünden path i copyalama)
        fullPath="C:\\Users\\ayse1\\Desktop";
        System.out.println("fullPath = " + fullPath);
        basePage.setAddFile(fullPath);


    }

    @And("user enter {string}")
    public void userEnter(String email) {

       // basePage.inputEmail.click();
        BrowserUtils.waitFor(2);
        basePage.inputEmail.sendKeys(email);

    }
}

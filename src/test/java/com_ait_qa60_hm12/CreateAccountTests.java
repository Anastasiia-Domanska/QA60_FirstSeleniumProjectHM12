package com_ait_qa60_hm12;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        click(By.cssSelector("[href='/register']"));
        //click(By.cssSelector("//input[@value='Register']"));
        click(By.id("gender-female"));
        type(By.id("FirstName"), "Anastasiia");
        type(By.id("LastName"), "Do");
        type(By.id("Email"), "anastasiia23@gmail.com");
        type(By.name("Password"), "Aa12345!");
        type(By.id("ConfirmPassword"), "Aa12345!");
        click(By.id("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".result")));
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Log Out']")));
    }
}

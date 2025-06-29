package com_ait_qa60_hm12;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        click(By.cssSelector("[href='/login']"));

        type(By.name("Email"), "anastasiia23@gmail.com");

        type(By.name("Password"), "Aa12345!");

        click(By.cssSelector("input[value='Log in']"));

        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Log Out']"))); //  //button[.='Sign Out']
    }
}

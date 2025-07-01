package com_ait_qa60_hm12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{

    @Test
    public void addSecondItemToCartTest(){
        click(By.cssSelector("[href='/login']"));
        type(By.name("Email"), "anastasiia23@gmail.com");
        type(By.name("Password"), "Aa12345!");
        click(By.cssSelector("input[value='Log in']"));

        click(By.xpath("(//input[@value='Add to cart'])[2]"));

        WebElement successBar = driver.findElement(By.cssSelector(".content"));
        String successText = successBar.getText().toLowerCase();

        assertElementPresent(By.xpath("//a[@class='product-name' and normalize-space()='14.1-inch Laptop']"),
                "14.1-inch Laptop' is not displayed");
    }

    public void assertElementPresent(By locator, String message) {
        Assert.assertTrue(isElementPresent(locator), message);
    }
}

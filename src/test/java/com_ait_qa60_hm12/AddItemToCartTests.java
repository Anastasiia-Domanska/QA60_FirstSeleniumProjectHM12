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

        Assert.assertTrue(successText.contains("The product has been added to your shopping cart".toLowerCase()),
                "Товар не был добавлен в корзину");
    }
}

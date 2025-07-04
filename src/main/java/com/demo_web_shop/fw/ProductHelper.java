package com.demo_web_shop.fw;

import com.demo_web_shop.models.Product;
import com.demo_web_shop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductHelper extends BaseHelper{

    public ProductHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        click(By.cssSelector("[id='add-to-cart-button-31']"));
    }

    public void enterQuantityOfItem(Product product) {
        click(By.cssSelector("[id='addtocart_31_EnteredQuantity']"));
        type(By.cssSelector("[id='addtocart_31_EnteredQuantity']"), product.getQuantity());
    }

    public void clickOnSecondItemLink() {
        click(By.linkText("14.1-inch Laptop"));
    }

    public boolean isSecondItemInShoppingCart() {
        return isElementPresent(By.xpath("//a[@class='product-name' and text()='14.1-inch Laptop']"));
    }

    public void clickOnShoppingCartLink() {
        click(By.xpath("//a[@class='ico-cart']"));
    }

}

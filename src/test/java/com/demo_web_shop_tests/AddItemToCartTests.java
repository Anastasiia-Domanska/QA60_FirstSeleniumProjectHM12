package com.demo_web_shop_tests;

import com.demo_web_shop.data.ProductData;
import com.demo_web_shop.data.UserData;
import com.demo_web_shop.models.Product;
import com.demo_web_shop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail(UserData.LOGIN)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLoginButton();

    }
    @Test
    public void addSecondItemToCartTest(){
        app.getProduct().clickOnSecondItemLink();
        app.getProduct().enterQuantityOfItem(new Product().setQuantity(ProductData.QUANTITY));
        app.getProduct().clickOnAddToCartButton();
        app.getProduct().clickOnShoppingCartLink();

        Assert.assertTrue(app.getProduct().isSecondItemInShoppingCart());
    }

}

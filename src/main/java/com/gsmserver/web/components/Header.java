package com.gsmserver.web.components;

import com.gsmserver.web.dto.ProductInfoDto;
import com.gsmserver.web.pages.CartPage;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    public void searchForProductAndPressEnter(ProductInfoDto targetProduct) {
        $("[name=searchword]").setValue(targetProduct.getName()).pressEnter();
    }

    public CartPage openCart() {
        $("header [href*=cart]").click();
        return new CartPage();
    }

}

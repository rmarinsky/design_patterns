package com.gsmserver.web.pages;

import com.gsmserver.web.common.Loadable;
import com.gsmserver.web.components.Header;
import com.gsmserver.web.dto.ProductInfoDto;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage implements Loadable {

    public Header header = new Header();

    public ProductPage hasTitle(ProductInfoDto targetProduct) {
        $("h1").shouldHave(text(targetProduct.getName()));
        return this;
    }

    public ProductPage addProductToCart() {
        $("[space*='all-about-product'] .btn--add-to-cart").click();
        $("[space*='all-about-product'] [name=quantity]").shouldBe(visible);
        return this;
    }

    @Override
    public ProductPage isLoaded() {
        $("[name=\"product-page\"]").shouldBe(visible);
        return this;
    }

}

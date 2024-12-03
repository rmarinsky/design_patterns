package com.gsmserver.web.pages;

import com.gsmserver.web.common.Loadable;
import com.gsmserver.web.components.Header;
import com.gsmserver.web.dto.ProductDataEnum;
import com.gsmserver.web.dto.ProductInfoDto;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage implements Loadable {

    public Header header = new Header();

    public CartPage cartTableHasProductTitle(ProductInfoDto targetProduct) {
        $("[name=title]").shouldHave(exactText(targetProduct.getName()));
        return this;
    }

    public CartPage cartTableHasProductTitle(ProductDataEnum productDataEnum) {
        $("[name=title]").shouldHave(exactText(productDataEnum.getName()));
        return this;
    }

    @Override
    public CartPage isLoaded() {
        $("[space=\"page/cart/container\"] h1").shouldHave(text("Cart"));
        return this;
    }

}

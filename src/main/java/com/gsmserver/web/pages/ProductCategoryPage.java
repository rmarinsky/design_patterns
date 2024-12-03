package com.gsmserver.web.pages;

import com.gsmserver.web.components.Header;
import com.gsmserver.web.components.ProductList;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductCategoryPage extends ProductList {

    public Header header = new Header();

    public void productCategoryPageHasTitle(String categoryName) {
        $("h1").shouldHave(text(categoryName));
    }

    public void bradCrumpsIsVisible() {
        $("[space=\"page/breadcrumbs\"]").shouldBe(visible);
    }

}

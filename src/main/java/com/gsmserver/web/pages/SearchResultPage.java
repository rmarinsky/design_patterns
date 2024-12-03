package com.gsmserver.web.pages;

import com.gsmserver.web.components.Header;
import com.gsmserver.web.components.ProductList;
import com.gsmserver.web.dto.ProductInfoDto;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends ProductList {

    public Header header = new Header();

    public SearchResultPage hasTitle(ProductInfoDto targetProduct) {
        $("h1").shouldHave(text(String.format("Search \"%s\"", targetProduct.getName())));
        return this;
    }


}

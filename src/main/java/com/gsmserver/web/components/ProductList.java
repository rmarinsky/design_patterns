package com.gsmserver.web.components;

import com.codeborne.selenide.Condition;
import com.gsmserver.web.common.Loadable;
import com.gsmserver.web.dto.ProductInfoDto;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductList implements Loadable {

    public static final String COMPONENT_PRODUCT_LIST = "[space=\"component/product-list/grid\"] div";

    public void productListHasItems(int expectedItemsCount) {
        $$(COMPONENT_PRODUCT_LIST).shouldHave(size(expectedItemsCount));
    }

    public ProductItem withProduct(ProductInfoDto product) {
        return new ProductItem(product);
    }

    @Override
    public ProductList isLoaded() {
        $(COMPONENT_PRODUCT_LIST).shouldBe(Condition.visible);
        return this;
    }

}

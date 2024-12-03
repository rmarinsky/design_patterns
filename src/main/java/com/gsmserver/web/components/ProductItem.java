package com.gsmserver.web.components;

import com.gsmserver.web.common.Loadable;
import com.gsmserver.web.dto.ProductInfoDto;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductItem implements Loadable {

    private final ProductInfoDto targetProduct;

    public ProductItem(ProductInfoDto productInfo) {
        this.targetProduct = productInfo;
    }

    private String productItem() {
        return String.format("[key='%s']", targetProduct.getId());
    }

    public ProductItem isLoaded() {
        $(productItem()).shouldBe(visible);
        //deliveryMethodsAreLoaded();
        return this;
    }

    public ProductItem addToCart() {
        $(productItem() + " .btn--add-to-cart").click();
        $(productItem() + " [name=quantity]").shouldBe(visible);
        return this;
    }

    public void openProductPage() {
        $(String.format("[title='%s']", targetProduct.getName())).click();
    }

    public ProductItem productNameHasExactTitle() {
        $(productItem() + " h3").shouldBe(visible);
        return this;
    }

}

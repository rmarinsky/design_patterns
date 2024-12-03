package com.gsmserver;

import com.codeborne.selenide.Configuration;
import com.gsmserver.data.ProductData;
import com.gsmserver.web.dto.ProductInfoDto;
import com.gsmserver.web.pages.CartPage;
import com.gsmserver.web.pages.HomePage;
import com.gsmserver.web.pages.ProductPage;
import com.gsmserver.web.pages.SearchResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.gsmserver.web.dto.ProductDataEnum.SIGMA_PLUS_BOX;

public class SearchTests {

    static {
        Configuration.pollingInterval = 1000;
    }


    private final HomePage homePage = new HomePage();
    private final SearchResultPage searchResultPage = new SearchResultPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();

    private final ProductInfoDto targetProduct = ProductData.getTargetProduct();


    @BeforeEach
    void beforeEach() {
        open("https://gsmserver.com");
    }

    @Test
    @DisplayName("Should be possible to add product to the cart from product page")
    void shouldBePossibleToAddProductToTheCart() {
        homePage.header.searchForProductAndPressEnter(targetProduct);

        searchResultPage.hasTitle(targetProduct);
        searchResultPage.withProduct(targetProduct)
                .productNameHasExactTitle()
                .openProductPage();

        productPage
                .isLoaded()
                .hasTitle(targetProduct)
                .addProductToCart();

        homePage.header.openCart();
        cartPage.isLoaded()
                .cartTableHasProductTitle(targetProduct);
    }


    @Test
    @DisplayName("Should be possible to add product to the cart from search result page")
    void shouldBePossibleToAddProductToTheCartFromResultPage() {
        homePage.header.searchForProductAndPressEnter(targetProduct);
        searchResultPage.hasTitle(targetProduct)
                .withProduct(targetProduct)
                .addToCart();

        homePage.header.openCart();
        cartPage.isLoaded()
                .cartTableHasProductTitle(SIGMA_PLUS_BOX);
    }


}

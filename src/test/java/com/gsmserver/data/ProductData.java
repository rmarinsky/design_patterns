package com.gsmserver.data;

import com.gsmserver.web.dto.ProductInfoDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductData {

    public ProductInfoDto getTargetProduct() {
        return ProductInfoDto.builder()
                .name("Sigma Plus Box")
                .id("899996")
                .build();
    }

}

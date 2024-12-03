package com.gsmserver.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductInfoDto {

    private String id;
    private String name;

}

package com.gsmserver.web.dto;

import lombok.Getter;

@Getter
public enum ProductDataEnum {
    SIGMA_PLUS_BOX("Sigma Plus Box", "899996"),
    SIGMA_BOX("Sigma Box", "899997"),
    SIGMA_BOX_WITH_CABLES("Sigma Box with cables", "899998"),
    SIGMA_BOX_WITH_CABLES_AND_ACTIVATIONS("Sigma Box with cables and activations", "899999");

    private final String name;
    private final String id;

    ProductDataEnum(String name, String id) {
        this.name = name;
        this.id = id;
    }

}

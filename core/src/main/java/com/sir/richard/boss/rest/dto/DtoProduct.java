package com.sir.richard.boss.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DtoProduct {
    private Long id;
    private String name;
    private String sku;
}

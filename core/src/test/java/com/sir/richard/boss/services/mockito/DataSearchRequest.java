package com.sir.richard.boss.services.mockito;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
class DataSearchRequest {

    String id;

    Date updatedBefore;

    int length;
}

package com.sir.richard.boss.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ErrorResponse {

    private String errorCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    private String info;

    public ErrorResponse(final String errorCode, final String info) {
        this.errorCode = errorCode;
        this.description = null;
        this.info = info;
    }

    public ErrorResponse(final String errorCode, final String description, final String info) {
        this.errorCode = errorCode;
        this.description = description;
        this.info = info;
    }

    public String toString() {
        return "ErrorResponse(errorCode=" + this.getErrorCode() + ", description=" + this.getDescription() + ", info=" + this.getInfo() + ")";
    }
}

package com.josepontocruz.haru.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@AllArgsConstructor
public class BaseException extends Exception {
    private static final long sVersionID = 1L;

    private String errorMsg;
    private Integer statusCode;
    private Object data;

    public BaseException(Integer statusCode, String errorMsg, Throwable cause){
        super(errorMsg, cause);
        this.statusCode = statusCode;
        this.errorMsg = errorMsg;
    }

    public BaseException(Integer statusCode, String errorMsg, Object data, Throwable cause){
        super(errorMsg, cause);
        this.statusCode = statusCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }


}

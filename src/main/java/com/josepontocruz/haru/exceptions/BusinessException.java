package com.josepontocruz.haru.exceptions;

public class BusinessException extends BaseException {
    private static final long sVersionID = 1L;

    public BusinessException(Integer statusCode, String errorMsg, Throwable cause) {
        super(statusCode, errorMsg, cause);
    }

    public BusinessException(Integer statusCode, String errorMsg, Object data, Throwable cause) {
        super(statusCode, errorMsg, data, cause);
    }
}

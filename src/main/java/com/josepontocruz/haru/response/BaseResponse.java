package com.josepontocruz.haru.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    private static final long sVersionID = 1L;

    private String status;
    private Integer code;
    private String msg;
    private Object data;

    public BaseResponse(String status, Integer code) {
        super();
        this.status = status;
        this.code = code;
    }

    public BaseResponse() {
    }
}

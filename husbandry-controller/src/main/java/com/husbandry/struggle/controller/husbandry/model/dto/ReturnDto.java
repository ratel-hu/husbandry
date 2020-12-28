package com.husbandry.struggle.controller.husbandry.model.dto;


import lombok.Data;

/**
 * @Author ratelhu
 * @Date 2020/12/28 19:52
 * @Version 1.0
 */

@Data
public class ReturnDto<T> {

    private String code;
    private String message;
    private T data;
    public ReturnDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ReturnDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ReturnDto(ReturnStatusEnum statusEnum, T data) {
        this.code = statusEnum.getCode();
        this.message = statusEnum.getMessage();
        this.data = data;
    }

    public ReturnDto(ReturnStatusEnum statusEnum) {
        this.code = statusEnum.getCode();
        this.message = statusEnum.getMessage();
    }

    public ReturnDto() {
    }


}

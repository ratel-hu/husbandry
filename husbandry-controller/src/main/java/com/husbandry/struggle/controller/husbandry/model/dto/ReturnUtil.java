package com.husbandry.struggle.controller.husbandry.model.dto;



/**
 * 响应结果类方法
 */
public class ReturnUtil {
	public ReturnUtil() {
	}

	public static ReturnDto success() {
		return new ReturnDto(ReturnStatusEnum.SUCCESS.getCode(), ReturnStatusEnum.SUCCESS.getMessage());
	}

	public static ReturnDto success(Object data) {
		return new ReturnDto(ReturnStatusEnum.SUCCESS.getCode(), ReturnStatusEnum.SUCCESS.getMessage(), data);
	}

	public static ReturnDto failed() {
		return new ReturnDto(ReturnStatusEnum.FAILED.getCode(), ReturnStatusEnum.FAILED.getMessage());
	}

	public static ReturnDto failed(String code, String message) {
		return new ReturnDto(code, message);
	}

	public static ReturnDto failed(ReturnStatusEnum rs) {
		return new ReturnDto(rs.getCode(), rs.getMessage());
	}

	public static ReturnDto failed(String message) {
		return new ReturnDto(ReturnStatusEnum.PARAMTER_ERROR.getCode(), message);
	}

}

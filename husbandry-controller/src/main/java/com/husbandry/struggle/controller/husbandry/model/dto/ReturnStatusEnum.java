package com.husbandry.struggle.controller.husbandry.model.dto;

/**
 * 返回code
 */
public enum ReturnStatusEnum {

	/**
	 * 返回状态码
	 */
	SUCCESS("0000", "处理成功"),

	FAILED("E0001", "处理失败"),
	/**
	 * http方法不支持
	 */
	METHOD_NOT_SUPPORTED("E0002", "HTTP method not supported"),
	/**
	 * 必要参数没传入
	 */
	INVALID_PARAMETERS("E0003", "Required  parameter '%s' is not present"),


	INVALID_SIGN("E0004", "签名校验失败"),

	PARAMTER_ERROR("E0005", "参数错误"),

	CHANNEL_ID_EXITS("E1001", "channel id 已存在"),

	CHANNEL_INFO_NOT_EXITS("E1002", "渠道信息不存在"),

	APP_ID_EXITS("E1003", "app id 已存在"),

	APP_INFO_NOT_EXITS("E1004", "应用信息不存在"),

	APP_VERSION_EXITS("E1005", "app version 已存在"),

	APP_VERSION_NOT_EXITS("E1005", "app version 不存在"),

	CHANNEL_ID_INVALID("E1006", "channel id 至少勾选一个"),

	APP_EN_NAME_EXITS("E1003", "app english name 已存在"),

	COMPONENT_NAME_NULL("E1004", "component_name 为空"),

	/**
	 * 小程序管理
	 */

    INVALID_WTID_OR_TOKEN("E0006", "wtId或token校验失败"),

	FAILED_APP_MANAGER_APPCODE_ISNULL("E2001", "appCode不能为null"),

	FAILED_APP_MANAGER_ID_ISNULL("E2002", "id不能为null"),

	/**
	 * 发送短信
	 */
	FAILED_SMS_CONFIG_IS_NULL("E160015", "没有查询到对应的配置"),

	FAILED_SMS_MESSAGE_SHORT("E160013", "30秒内只能发送一次短信噢"),

	FAILED_SMS_REDIS_MESSAGE("E160003", "redis存储短信验证码失败"),

	FAILED_SMS_VERYCODE_FAILED("E160016", "验证码校验失败"),

	FAILED_SMS_VERYCODE_OVERDUE("E160017", "验证码过期"),

	FAILED_SMS_MESSAGE_LIMIT_FAIL("E160014", "已到短信日限制上限，请明日再次登录"),

	;

	private String code;
	private String message;

	private ReturnStatusEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}


	public String getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}
}

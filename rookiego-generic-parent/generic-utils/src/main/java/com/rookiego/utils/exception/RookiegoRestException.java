package com.rookiego.utils.exception;

/**
 * 菜鸟快跑通用REST服务异常类
 *
 * @author zhh
 * @date 2017年7月19日-下午10:31:05
 * @jdk jdk1.8
 */
public class RookiegoRestException extends Exception {

	private static final long serialVersionUID = 5563981910717803185L;

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public RookiegoRestException(String errorMsg) {
		super(errorMsg);
	}

	public RookiegoRestException(Throwable e) {
		super(e);
	}

	public RookiegoRestException(String errorMsg, Throwable e) {
		super(errorMsg, e);
	}

}

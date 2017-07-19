package com.rookiego.utils.exception;

/**
 * 菜鸟快跑通用异常类
 *
 * @author zhh
 * @date 2017年7月19日-下午10:21:54
 * @jdk jdk1.7
 */
public class RookiegoException extends Exception {

	private static final long serialVersionUID = -5986935232603124058L;

	private String errorCode;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public RookiegoException(String errorMsg) {
		super(errorMsg);
	}

	public RookiegoException(Throwable e) {
		super(e);
	}

	public RookiegoException(String errorMsg, Throwable e) {
		super(errorMsg, e);
	}
}

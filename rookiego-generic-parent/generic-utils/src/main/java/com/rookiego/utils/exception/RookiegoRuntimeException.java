package com.rookiego.utils.exception;

/**
 * 菜鸟快跑通用运行时异常类
 *
 * @author zhh
 * @date 2017年7月19日-下午10:23:37
 * @jdk jdk1.8
 */
public class RookiegoRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 771869248504948013L;
	
	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public RookiegoRuntimeException(String errorMsg) {
		super(errorMsg);
	}
	
	public RookiegoRuntimeException(Throwable e) {
		super(e);
	}
	
	public RookiegoRuntimeException(String errorMsg, Throwable e) {
		super(errorMsg, e);
	}

}

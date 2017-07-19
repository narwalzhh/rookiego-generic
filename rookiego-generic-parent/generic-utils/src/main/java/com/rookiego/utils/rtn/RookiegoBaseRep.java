package com.rookiego.utils.rtn;

import java.io.Serializable;

import com.rookiego.utils.anno.FieldDsc;

/**
 * 菜鸟快跑通用返回值对象类
 *
 * @author zhh
 * @date 2017年7月19日-下午10:25:44
 * @jdk jdk1.8
 */
public class RookiegoBaseRep implements Serializable {

	private static final long serialVersionUID = 2839161483227402731L;

	/**
	 * 请求响应成功 {@code 1}
	 */
	public static final int STATUS_SUCCESS = 1;

	/**
	 * 请求响应失败 {@code 0}
	 */
	public static final int STATUS_FAILURE = 0;

	@FieldDsc(value = "接口请求状态", remark = "1为成功响应请求，0请求失败")
	private int status;

	@FieldDsc(value = "接口请求信息")
	private String msg;

	@FieldDsc(value = "接口请求返回数据")
	private Object data;

	@FieldDsc(value = "错误码", remark = "请求成功状态下，此属性值为空")
	private ErrorCode errorCode;

	public RookiegoBaseRep() {

	}

	public RookiegoBaseRep success(String msg) {
		setStatus(STATUS_SUCCESS);
		setMsg(msg);

		return this;
	}

	public RookiegoBaseRep success(String msg, Object data) {
		setStatus(STATUS_SUCCESS);
		setMsg(msg);
		setData(data);

		return this;
	}

	public RookiegoBaseRep failure(String msg) {
		setStatus(STATUS_FAILURE);
		setMsg(msg);

		return this;
	}

	public RookiegoBaseRep failure(String msg, Object data) {
		setStatus(RookiegoBaseRep.STATUS_FAILURE);
		setMsg(msg);
		setData(data);

		return this;
	}

	/**
	 * 使用错误码时，返回值无对象信息
	 * 
	 * @param msg
	 *            普通错误信息
	 * @param errorCode
	 *            错误码对象
	 * @param errorMsg
	 *            错误信息
	 * @return
	 */
	public RookiegoBaseRep failure(String msg, ErrorCode errorCode, String errorMsg) {
		setStatus(STATUS_FAILURE);
		setMsg(msg);
		setErrorCode(errorCode);

		return this;
	}

	/**
	 * 使用错误码时，返回值带有对象信息
	 * 
	 * @param msg
	 *            普通错误信息
	 * @param data
	 *            返回数据
	 * @param errorCode
	 *            错误码对象
	 * @param errorMsg
	 *            错误信息
	 * @return
	 */
	public RookiegoBaseRep failure(String msg, Object data, ErrorCode errorCode, String errorMsg) {
		setStatus(STATUS_FAILURE);
		setMsg(msg);
		setData(data);
		setErrorCode(errorCode);

		return this;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

}

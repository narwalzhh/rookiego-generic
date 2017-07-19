package com.rookiego.utils.rtn;

import java.io.Serializable;

import com.rookiego.utils.anno.FieldDsc;

/**
 * 程序异常返回时，使用此对象包装错误吗和错误信息
 *
 * @author zhh
 * @date 2017年7月19日-下午10:32:54
 * @jdk jdk1.8
 */
public class ErrorCode implements Serializable {

	private static final long serialVersionUID = 3012114392558543656L;

	@FieldDsc(value = "错误码")
	private String code;

	@FieldDsc(value = "错误信息")
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

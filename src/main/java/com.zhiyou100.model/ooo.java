package com.zhiyou100.model;
/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月18日 下午7:18:28 

* 类说明 

*/
public class ooo {
	private String code;
	private String msg;
	private String obj;
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
	public String getObj() {
		return obj;
	}
	public void setObj(String obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "object [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
	}
	public ooo(String code, String msg, String obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}
	public ooo() {
		super();
	}
	public ooo(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
}

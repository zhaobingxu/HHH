package com.zhiyou100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.model.ooo;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月18日 下午7:26:46 

* 类说明 

*/
@Controller
public class use {
	@RequestMapping("/user.do")
	@ResponseBody
	public ooo users(String username) {
		ooo oo = new ooo();
		if (username != null && username != "" && username.equals("heihei")) {
			oo.setCode("404");
			oo.setMsg("用户名存在");
		}else {
			oo.setCode("200");
			oo.setMsg("允许注册");
		}
		return oo;
		
		
	}
}

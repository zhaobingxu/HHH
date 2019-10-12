package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.User;
import com.zhiyou100.service.serice_user;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 上午10:47:53 

* 类说明 

*/
@Controller
public class user_controller {
	@Autowired
	private serice_user ser;
	@RequestMapping("/user_list.do")
	public String usre_list(String na,Model model,@RequestParam(defaultValue="1")int pageNo) {
		model.addAttribute("us", na);	
		PageHelper.startPage(pageNo, 3);
	List<User> user1=	ser.list(na);
	PageInfo<User> pageInfo = new PageInfo<>(user1);
	model.addAttribute("user",pageInfo.getList());
	System.out.println(pageInfo.getList());
	model.addAttribute("page", pageInfo);
	model.addAttribute("total",pageInfo.getTotal());
	return "User/index";
		
	}
	@RequestMapping("/user_edit.do")
	public String edit(String username,Model model) {
		User user=ser.edit(username);
		model.addAttribute("u", user);
		return "User/editUser";
		
	}
	@RequestMapping("/editt_user.do")
	public String editt(User user) {
		System.out.println(user.getUserName());
		ser.editt(user);
		int a=ser.editt3(user);
		String sss = Integer.toString(a);
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", sss);
		map.put("ro", user.getRo());
		ser.editt2(map);
		return "forward:/user_list.do";
		
	}
	@RequestMapping("/user_delete.do")
	public String delete(String username) {
		ser.delete(username);
		return "forward:/user_list.do";
		
	}
	@RequestMapping("/user_add.do")
	public String add(User user) {
		ser.add(user);
		return "forward:/user_list.do";
		
		
	}
}

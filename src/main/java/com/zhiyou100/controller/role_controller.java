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
import com.zhiyou100.model.Role;
import com.zhiyou100.model.User;
import com.zhiyou100.service.role_serive;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 下午4:43:15 

* 类说明 

*/
@Controller
public class role_controller {
	@Autowired
	private role_serive ser;
	@RequestMapping("/role_list.do")
	public String list(String rolename,Model model,@RequestParam(defaultValue="1")int pageNo) {
		model.addAttribute("us", rolename);	
		PageHelper.startPage(pageNo, 3);
	List<Role> user1=	ser.list(rolename);
	PageInfo<Role> pageInfo = new PageInfo<>(user1);
	model.addAttribute("user",pageInfo.getList());
	System.out.println(pageInfo.getList());
	model.addAttribute("page", pageInfo);
	model.addAttribute("total",pageInfo.getTotal());
		return "Role/index";
		
	}
	@RequestMapping("/role_delete.do")
	public String delete(int id) {
		System.out.println(id);
		ser.delete(id);
		return "forward:/role_list.do";
		
	}
	@RequestMapping("/role_add.do")
	public String add(String title,int status,Integer [] group) {
		Map<String, String> map = new HashMap<String, String>();
		String sss = Integer.toString(status);
		map.put("title", title);
		map.put("status", sss);
		ser.add(map);
		int a = ser.add1(title);
		String aa = Integer.toString(a);
		for (Integer integer : group) {
			String i = Integer.toString(integer);
			map.put("r_id", aa);			
			map.put("id", i);
			ser.add2(map);
			
		}
		return "forward:/role_list.do";
	}
	@RequestMapping("/edit_role.do")
	public String edit(int id,Model model) {
		List<Role>list= ser.edit(id);
		model.addAttribute("list", list);
		return "Role/editRole";
		
	}
}

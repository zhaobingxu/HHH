package com.zhiyou100.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.User;
import com.zhiyou100.model.fintime;
import com.zhiyou100.service.Servicee;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月3日 下午2:42:52 

* 类说明 

*/
@Controller
public class controller {
	@Autowired
	private Servicee  sercicee;
	@RequestMapping("/destory.do")
	public String destory(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
		
	}
	
	
	
	@RequestMapping("/login.do")
	public String index(String userName,String password,Model model,HttpServletRequest request) {
		User user=  sercicee.finUserByname(userName,password);	
		String string = sercicee.finJurisdiction(userName);	 		
		HttpSession session = request.getSession();		
		if (user !=null) {			
		session.setAttribute("str",string );				
		session.setAttribute("user", user);			
			return "index";	
		}
		model.addAttribute("erreo", "账号货密码错误");
		return "login";	
	}
	@RequestMapping("/list.do")
	public String list(Model model,@RequestParam(defaultValue="1")int pageNo,
		RegistrationInfor registrationInfor,fintime fintime) {	
		model.addAttribute("u", fintime);			
		int total = sercicee.count(fintime);	
		PageHelper.startPage(pageNo, 3);
		List<RegistrationInfor> user =  sercicee.list(fintime);
		PageInfo<RegistrationInfor> pageInfo = new PageInfo<>(user);
		model.addAttribute("user",pageInfo.getList());
		System.out.println(pageInfo.getList());
		model.addAttribute("page", pageInfo);
		model.addAttribute("total", total);
		return "registration/index";
		
		
	}
	@RequestMapping("/detalis.do")
	public String datalis(Model model,String medical_record) {
		System.out.println(medical_record);
		RegistrationInfor user=sercicee.datalis(medical_record);
		model.addAttribute("ud",user );
		return "registration/look";
		
	}
	@RequestMapping("/update.do")
	public String update(Model model,String medical_record) {
		RegistrationInfor user=sercicee.update(medical_record);
		model.addAttribute("ud",user );
		return "registration/edit";
		
	}
	@RequestMapping("/up.do")
	public String up(RegistrationInfor registrationInfor) {
	
		sercicee.up(registrationInfor);
		return "forward:/list.do";
		
	}
	@RequestMapping("/delete.do")
	public String daelete(String medical_record) {
		sercicee.delete(medical_record);
		return "forward:/list.do";
		
	}
	@RequestMapping("/add.do")
	public String add(RegistrationInfor registrationInfor) {
		
		sercicee.add(registrationInfor);
		return "forward:/list.do";
		
	}
	@RequestMapping("/deall.do")
	public String deall(String [] medical_record) {
		System.out.println(medical_record);
		for (String string : medical_record) {
			sercicee.deall(string);
		}
		
		return "forward:/list.do";
		
	}
	@RequestMapping("/users_up.do")
	public String uppppp(String p1,String p2,String p3,String p4,String pp,Model model,HttpServletRequest request) {
		if (p1 == null || p1 == "" || p2 == null || p2 == "" || p3 == null || p3 == "") {
			return "Resource/index2";
		}else {
		if (p1.equals(p2)) {
			if (p3.equals(p4)) {
				Map<String, String> map = new HashMap<>();
				map.put("username", pp);
				map.put("password",p3);
				sercicee.uppppp(map);
			}
			else {
				model.addAttribute("uu", "两次密码输入不一致,请重新输入");
				return "Resource/index2";
			}
		}else {
			model.addAttribute("u", "原密码输入错误,请重新输入");
			return "Resource/index2";
		}
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:login.jsp"; 
		
	}}
}

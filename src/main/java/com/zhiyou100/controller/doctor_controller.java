package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.service.serive_doctor;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午4:58:41 

* 类说明 

*/
@Controller
public class doctor_controller {
	@Autowired
	private serive_doctor serice ;
	@RequestMapping("/list_doctor.do")
	public String list(Model model,@RequestParam(defaultValue="1")int pageNo,Doctor doctor) {
		model.addAttribute("us", doctor);
		int total = serice.count(doctor);	
		PageHelper.startPage(pageNo, 3);
	List<Doctor> user=	serice.list(doctor);
	PageInfo<Doctor> pageInfo = new PageInfo<>(user);
	model.addAttribute("user",pageInfo.getList());
	System.out.println(pageInfo.getList());
	model.addAttribute("page", pageInfo);
	model.addAttribute("total", total);
	
	return "doctor/index";
		
	}
	@RequestMapping("/look_doctor.do")
	public String look(int id,Model model) {
		Doctor user=serice.look(id);
		model.addAttribute("u", user);
		return "doctor/look";
		
	}
	@RequestMapping("/edit_doctor.do")
	public String edit(int id,Model model) {
		Doctor doctor=serice.edit(id);
		model.addAttribute("u", doctor);
		return "doctor/edit";
		
	}
	@RequestMapping("/editt_doctor.do")
	public String editt(Doctor doctor) {
		serice.editt(doctor);
		return "forward:/list_doctor.do";
		
	}
	@RequestMapping("/add_doctor.do")
	public String add(Doctor doctor) {
		serice.add(doctor);
		return "forward:/list_doctor.do";
		
	}
	
}

package com.zhiyou100.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.zhiyou100.model.PayItems;
import com.zhiyou100.service.secive_payitems;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月10日 下午4:48:23 

* 类说明 

*/
@Controller
public class payitems_controller {
	@Autowired
	private secive_payitems ser;
	@RequestMapping("/list_payitems.do")
	public String list(Model model,@RequestParam(defaultValue="1")int pageNo,String medical_record,String name) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("medical_record", medical_record);
		map.put("name", name);
		model.addAttribute("us", map);
		int total = ser.count(map);	
		PageHelper.startPage(pageNo, 3);
	List<PayItems> user=	ser.list(map);
	PageInfo<PayItems> pageInfo = new PageInfo<>(user);
	model.addAttribute("user",pageInfo.getList());
	System.out.println(pageInfo.getList());
	model.addAttribute("page", pageInfo);
	model.addAttribute("total", total);
	
	return "hospital/charge";
		
	}
	@RequestMapping("ad_pay.do")
	public String ad(int idd ,Model model) {
		PayItems user=ser.ad(idd);
		model.addAttribute("u", user);
		return "hospital/charge-new";
		
	}
	@RequestMapping("/add_pay.do")
	public String add(PayItems payItems) {
		ser.add(payItems);
		Date date = new Date();
		SimpleDateFormat ddd= new SimpleDateFormat("yyyy-MM-dd");
		String format = ddd.format(date);
		Map<String, String> map = new HashMap<>();
		map.put("format", format);
		map.put("name", payItems.getIdd());
		ser.addd(map);
		return "forward:/list_payitems.do";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

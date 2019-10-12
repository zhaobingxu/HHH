package com.zhiyou100.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.tools.corba.se.idl.constExpr.And;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Drug;
import com.zhiyou100.service.serice_drug;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午9:25:53 

* 类说明 

*/
@Controller
public class drug_controller {
	@Autowired
	private serice_drug sss;
	@RequestMapping("/list_drug.do")
	public String list(Model model,@RequestParam(defaultValue="1")int pageNo,Drug drug) {
	System.out.println("跳转了--------------------------------------------------");
	model.addAttribute("us", drug);
	int total = sss.count(drug);	
	PageHelper.startPage(pageNo, 2);
	List<Drug> user=sss.list(drug);
	PageInfo<Drug> pageInfo = new PageInfo<>(user);
	model.addAttribute("user",pageInfo.getList());
	System.out.println(pageInfo.getList());
	model.addAttribute("page", pageInfo);
	model.addAttribute("total", total);
	
	return "medicine/index";
	}
	@RequestMapping("/look_drug.do")
	public String look(String drug_num,Model model) {
		Drug drug=sss.look(drug_num);
		model.addAttribute("u",drug);
		return "medicine/look";
		
	}
	@RequestMapping("/edit_drug.do")
	public String edit(String drug_num,Model model) {
		Drug drug=sss.edit(drug_num);
		model.addAttribute("u",drug );
		return "medicine/edit";
		
	}
	@RequestMapping("/editt_drug.do")
	public String editt(Drug drug_num,@RequestParam("img")MultipartFile img,HttpServletRequest request) throws IOException {
			if (img != null && !img.isEmpty()) {
				//获得上传的对象
				
				//获得最终上传的目的的路径(上传到服务器当前项目下)
				String realPath = request.getServletContext().getRealPath("/upload");
				System.out.println(realPath);
				//将最终目的的文件夹创建出来
				File file = new File(realPath);
				if (file.exists()) {
					file.mkdir();
				}
				//获得文件名
				//文件名重复时不能重复上传文件
				String fileName = img.getOriginalFilename();
				System.out.println(fileName);
				//获得文件后缀名
				//因为正则表达式原因,通过这种方式转义
			
				String[] split = fileName.split("\\.");
				System.out.println(Arrays.toString(split));
				String suffix = split[1];
				//以毫秒值为文件名
				long prefix = new Date().getTime();
				//组装文件名
				String newFileName=prefix+"."+suffix;
				System.out.println("新的文件名:"+ newFileName);
				System.out.println("文件名:" + fileName);
				//确定上传路径
				File newFile = new File(file, newFileName);
				//上传
				FileUtils.writeByteArrayToFile(newFile, img.getBytes());
				request.setAttribute("path", "/upload/"+newFileName);
				System.out.println("/upload/"+newFileName);
				String str="/upload/"+newFileName;
				String st=drug_num.getDrug_num();
				Map< String, String> map = new HashMap<String, String>();
				map.put("drug_num",st );
				map.put("str", str);
				sss.edi(map);
			}	
		
		sss.editt(drug_num);
		return "forward:/list_drug.do";
		
	}
	@RequestMapping("/add_drug.do")
	public String add( Drug drug_num,@RequestParam("im")MultipartFile im,HttpServletRequest request) throws IOException {
		sss.add(drug_num);
		if (im != null && !im.isEmpty()) {
			//获得上传的对象
			
			//获得最终上传的目的的路径(上传到服务器当前项目下)
			String realPath = request.getServletContext().getRealPath("/upload");
			System.out.println(realPath);
			//将最终目的的文件夹创建出来
			File file = new File(realPath);
			if (file.exists()) {
				file.mkdir();
			}
			//获得文件名
			//文件名重复时不能重复上传文件
			String fileName = im.getOriginalFilename();
			System.out.println(fileName);
			//获得文件后缀名
			//因为正则表达式原因,通过这种方式转义
		
			String[] split = fileName.split("\\.");
			System.out.println(Arrays.toString(split));
			String suffix = split[1];
			//以毫秒值为文件名
			long prefix = new Date().getTime();
			//组装文件名
			String newFileName=prefix+"."+suffix;
			System.out.println("新的文件名:"+ newFileName);
			System.out.println("文件名:" + fileName);
			//确定上传路径
			File newFile = new File(file, newFileName);
			//上传
			FileUtils.writeByteArrayToFile(newFile, im.getBytes());
			request.setAttribute("path", "/upload/"+newFileName);
			System.out.println("/upload/"+newFileName);
			String str="/upload/"+newFileName;
			String st=drug_num.getDrug_num();
			Map< String, String> map = new HashMap<String, String>();
			map.put("drug_num",st );
			map.put("str", str);
			sss.ad(map);
		}	
	
	
	return "forward:/list_drug.do";
	}
}

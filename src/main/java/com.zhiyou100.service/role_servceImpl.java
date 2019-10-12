package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.role_dao;
import com.zhiyou100.model.Role;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 下午4:48:20 

* 类说明 

*/
@Service
public class role_servceImpl implements role_serive{
	@Autowired
	private role_dao dao;
	@Override
	public List<Role> list(String rolename) {
		List<Role > list=dao.list(rolename);
		return list;
	}
	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}
	@Override
	public void add(Map<String, String> map) {
		dao.add(map);
		
	}
	@Override
	public int add1(String title) {
		int a=dao.add1(title);
		return a;
	}
	
	@Override
	public void add2(Map<String, String> map) {
		dao.add2(map);
		
	}
	@Override
	public List<Role> edit(int id) {
		List<Role> list=  dao.edit(id);
		return list;
	}

}

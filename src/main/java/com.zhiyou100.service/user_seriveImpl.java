package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.user_dao;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.User;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 上午10:57:27 

* 类说明 

*/
@Service
public class user_seriveImpl implements serice_user{
	@Autowired
	private user_dao dao;
	@Override
	public List<User> list(String na) {
		List< User> list= dao.list(na);
		return list;
	}
	
	@Override
	public User edit(String username) {
		User user=dao.edit(username);
		return user;
	}

	@Override
	public void editt(User user) {
		dao.editt(user);
		
	}

	@Override
	public void editt2(Map<String, String> map) {
		dao.editt2(map);
		
	}

	@Override
	public int editt3(User user) {
		int a = dao.editt3(user);
		return a;
	}

	@Override
	public void delete(String username) {
		dao.delete(username);
		
	}

	@Override
	public void add(User user) {
		dao.add(user);
		
	}

	

}

package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.User;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 上午10:54:41 

* 类说明 

*/
public interface serice_user {

	List<User> list(String na);

	User edit(String username);

	void editt(User user);

	void editt2(Map<String, String> map);

	int editt3(User user);

	void delete(String username);

	void add(User user);

}

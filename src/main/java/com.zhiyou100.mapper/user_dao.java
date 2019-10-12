package com.zhiyou100.mapper;

import com.zhiyou100.model.User;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 上午11:00:39 

* 类说明 

*/
public interface user_dao {

	List<User> list(String na);

	User edit(String username);

	void editt(User user);

	void editt2(Map<String, String> map);

	int editt3(User user);

	void delete(String username);

	void add(User user);

}

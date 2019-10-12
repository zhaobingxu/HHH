package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Role;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 下午4:47:54 

* 类说明 

*/
public interface role_serive {

	List<Role> list(String rolename);

	void delete(int id);

	void add(Map<String, String> map);

	int add1(String title);

	void add2(Map<String, String> map);

	List<Role> edit(int id);

}

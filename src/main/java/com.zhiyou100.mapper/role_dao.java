package com.zhiyou100.mapper;

import com.zhiyou100.model.Role;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月11日 下午4:49:43 

* 类说明 

*/
public interface role_dao {

	List<Role> list(String rolename);

	void delete(int id);

	void add(Map<String, String> map);

	int add1(String title);

	void add2(Map<String, String> map);

	List<Role> edit(int id);

}

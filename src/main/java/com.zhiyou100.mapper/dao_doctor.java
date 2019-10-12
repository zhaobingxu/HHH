package com.zhiyou100.mapper;

import com.zhiyou100.model.Doctor;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午5:17:32 

* 类说明 

*/
public interface dao_doctor {

	List<Doctor> list(Map<String, String> map);

	int count(Map<String, String> map);

	Doctor look(int id);

	Doctor edit(int id);

	void editt(Doctor doctor);

	void add(Doctor doctor);

}

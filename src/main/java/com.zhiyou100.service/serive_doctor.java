package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Doctor;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午5:09:28 

* 类说明 

*/
public interface serive_doctor {

	List<Doctor> list(Doctor doctor);

	int count(Doctor doctor);

	

	Doctor look(int id);

	Doctor edit(int id);

	void editt(Doctor doctor);

	void add(Doctor doctor);

}

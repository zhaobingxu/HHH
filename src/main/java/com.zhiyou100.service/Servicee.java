package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.User;
import com.zhiyou100.model.fintime;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月3日 下午2:57:18 

* 类说明 

*/
public interface Servicee {

	User finUserByname(String userName, String password);

	List<RegistrationInfor> list(fintime fintime);

	int count(fintime fintime);

	RegistrationInfor datalis(String medical_record);

	RegistrationInfor update(String medical_record);

	void up(RegistrationInfor registrationInfor);

	void delete(String medical_record);

	void add(RegistrationInfor registrationInfor);

	void deall(String string);

	String finJurisdiction(String userName);

	void uppppp(Map<String, String> map);


}

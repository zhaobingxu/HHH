package com.zhiyou100.mapper;

import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.User;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月3日 下午3:02:41 

* 类说明 

*/
public interface Dao {

	User finUserBy(Map<String, String> map);

	List<User> finList(Map<String, String> map);

	

	List<RegistrationInfor> list(Map<String, String> map);

	int count(Map<String, String> map);

	RegistrationInfor datalis(String medical_record);

	RegistrationInfor update(String medical_record);

	void up(RegistrationInfor registrationInfor);

	void delete(String medical_record);

	void add(RegistrationInfor registrationInfor);

	void deall(String string);

	String finJurisdiction(String userName);

	void uppp(Map<String, String> map);

}

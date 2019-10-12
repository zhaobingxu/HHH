package com.zhiyou100.service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.corba.se.idl.constExpr.And;
import com.zhiyou100.mapper.Dao;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.User;
import com.zhiyou100.model.fintime;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月3日 下午2:57:56 

* 类说明 

*/
@Service
public class serviceeImpl implements Servicee{
	@Autowired
	private Dao dao;
	public User finUserByname(String userName, String password) {
		Map< String, String> map = new HashMap<String, String>();
		map.put("userName", userName);
		map.put("password", password);
			User user=dao.finUserBy(map);
		return user;
	}
	@Override
	public List<RegistrationInfor> list(fintime fintime) {				
		Map<String, String> map = new HashMap<>();
		map.put("time",fintime.getS3() );
		map.put("time1", fintime.getS4() );
		map.put("medical_record", fintime.getS());
		map.put("doctor", fintime.getS1() );
		map.put("section", fintime.getS2() );					
		List<RegistrationInfor> user= dao.list(map);
		return user;
	}
	@Override
	public int count(fintime fintime) {		
		Map<String, String> map = new HashMap<>();
		map.put("time",fintime.getS3() );
		map.put("time1", fintime.getS4() );
		map.put("medical_record", fintime.getS());
		map.put("doctor", fintime.getS1() );
		map.put("section", fintime.getS2() );		
		int total= dao.count(map);
		return total;
	}
	@Override
	public RegistrationInfor datalis(String medical_record) {
		RegistrationInfor user=dao.datalis(medical_record);
		return user;
	}
	@Override
	public RegistrationInfor update(String medical_record) {
		RegistrationInfor user=dao.update(medical_record);
		return user;
	}
	@Override
	public void up(RegistrationInfor registrationInfor) {
		dao.up(registrationInfor);
		
	}
	@Override
	public void delete(String medical_record) {
	dao.delete(medical_record);
		
	}
	@Override
	public void add(RegistrationInfor registrationInfor) {
		dao.add(registrationInfor);
		
	}
	@Override
	public void deall(String string) {
		dao.deall(string);
		
	}
	@Override
	public String finJurisdiction(String userName) {
		 String uString= dao.finJurisdiction(userName);
		return uString;
	}
	@Override
	public void uppppp(Map<String, String> map) {
		dao.uppp(map);

	
	
	}
}

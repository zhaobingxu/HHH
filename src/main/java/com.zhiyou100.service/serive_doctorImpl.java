package com.zhiyou100.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.dao_doctor;
import com.zhiyou100.model.Doctor;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午5:15:13 

* 类说明 

*/
@Service
public class serive_doctorImpl implements serive_doctor{
	@Autowired
	private dao_doctor dao;
	@Override
	public List<Doctor> list(Doctor doctor) {
		Map<String , String> map = new HashMap<String, String>();
		map.put("ID_num", doctor.getID_num());
		map.put("Name", doctor.getName());
		map.put("Section", doctor.getSection());
		List<Doctor> user=dao.list(map);
		return user;
	}

	@Override
	public int count(Doctor doctor) {
		Map<String , String> map = new HashMap<String, String>();
		map.put("ID_num", doctor.getID_num());
		map.put("Name", doctor.getName());
		map.put("Section", doctor.getSection());
		List<Doctor> user=dao.list(map);
		return dao.count(map);
	}

	

	@Override
	public Doctor look(int id) {
		Doctor doctor=dao.look(id);
		return doctor;
	}

	@Override
	public Doctor edit(int id) {
		Doctor doctor=dao.edit(id);
		return doctor;
	}

	@Override
	public void editt(Doctor doctor) {
		dao.editt(doctor);
		
	}

	@Override
	public void add(Doctor doctor) {
		dao.add(doctor);
		
	}

	

}

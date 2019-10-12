package com.zhiyou100.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.dao_durg;
import com.zhiyou100.model.Drug;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午9:30:52 

* 类说明 

*/
@Service
public class serive_durg implements serice_drug{
	@Autowired
	private dao_durg dao;
	@Override
	public int count(Drug drug) {
		Map<String , String> map = new HashMap<String, String>();
		
		map.put("drug_name", drug.getDrug_name());
		if (drug.getDrug_type() != null) {
			String s = Integer.toString(drug.getDrug_type());
			map.put("drug_type",s );
		}
		
		int ddd=dao.count(map);
		return ddd;
	}

	@Override
	public List<Drug> list(Drug drug) {
		Map<String , String> map = new HashMap<String, String>();
		
		map.put("drug_name", drug.getDrug_name());
		if (drug.getDrug_type() != null) {
			String s = Integer.toString(drug.getDrug_type());
			map.put("drug_type",s );
		}
		List<Drug> list=dao.list(map);
		return list;
	}

	@Override
	public Drug look(String drug_num) {
		Drug drug=dao.look(drug_num);
		return drug;
	}

	@Override
	public Drug edit(String drug_num) {
		Drug drug=dao.edit(drug_num);
		return drug;
	}

	@Override
	public void editt(Drug drug_num) {
		dao.editt(drug_num);
		
	}

	

	@Override
	public void add(Drug drug_num) {
		dao.add(drug_num);
		
	}

	@Override
	public void edi(Map<String, String> map) {
		dao.edi(map);
		
	}

	@Override
	public void ad(Map<String, String> map) {
		dao.ad(map);
		
	}

}

package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.dao_pay;
import com.zhiyou100.model.PayItems;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月10日 下午4:54:59 

* 类说明 

*/
@Service
public class secive_payitemsImpl implements secive_payitems{
	@Autowired
	private dao_pay dao;
	@Override
	public int count(Map<String, String> map) {
		int ddd=dao.count(map);
		return ddd;
	}

	@Override
	public List<PayItems> list(Map<String, String> map) {
		List<PayItems> list=dao.list(map);
		return list;
	}

	@Override
	public PayItems ad(int idd) {
		PayItems user=  dao.ad(idd);
		return user;
	}

	@Override
	public void add(PayItems payItems) {
		dao.add(payItems);
		
	}

	@Override
	public void addd(Map<String, String> map) {
		dao.addd(map);
		
	}


	

}

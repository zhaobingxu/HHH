package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.PayItems;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月10日 下午4:53:41 

* 类说明 

*/
public interface secive_payitems {

	int count(Map<String, String> map);

	List<PayItems> list(Map<String, String> map);

	PayItems ad(int idd);

	void add(PayItems payItems);

	void addd(Map<String, String> map);

}

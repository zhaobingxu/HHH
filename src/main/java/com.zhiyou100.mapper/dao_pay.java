package com.zhiyou100.mapper;

import com.zhiyou100.model.PayItems;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月10日 下午4:57:02 

* 类说明 

*/
public interface dao_pay {

	int count(Map<String, String> map);

	List<PayItems> list(Map<String, String> map);

	PayItems ad(int idd);

	void add(PayItems payItems);

	void addd(Map<String, String> map);

}

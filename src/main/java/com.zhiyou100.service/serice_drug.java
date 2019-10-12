package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Drug;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午9:30:18 

* 类说明 

*/
public interface serice_drug {

	int count(Drug drug);

	List<Drug> list(Drug drug);

	Drug look(String drug_num);

	Drug edit(String drug_num);

	void editt(Drug drug_num);

	void edi(Map<String, String> map);

	void ad(Map<String, String> map);

	void add(Drug drug_num);

}

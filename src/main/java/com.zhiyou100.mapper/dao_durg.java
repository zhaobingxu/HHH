package com.zhiyou100.mapper;

import com.zhiyou100.model.Drug;

import java.util.List;
import java.util.Map;

/** 

* @author 作者 : 赵柄旭

* @version 创建时间：2019年9月9日 下午10:09:59 

* 类说明 

*/
public interface dao_durg {

	int count(Map<String, String> map);

	List<Drug> list(Map<String, String> map);

	Drug look(String drug_num);

	Drug edit(String drug_num);

	void editt(Drug drug_num);

	void edi(Map<String, String> map);

	void ad(Map<String, String> map);

	void add(Drug drug_num);

}

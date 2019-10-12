package com.zhiyou100.mapper;

import com.zhiyou100.model.HospitalClear;

import java.util.List;
import java.util.Map;

public interface AccountMapper {

	List<HospitalClear> findAllAccount(Map<String, String> map);

	HospitalClear detailAccount(int id);

	void updateHospitalClear(Map<String, Object> map);

	int count(int id);

}

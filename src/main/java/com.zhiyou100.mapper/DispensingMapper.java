package com.zhiyou100.mapper;

import com.zhiyou100.model.Dispensing;

import java.util.List;
import java.util.Map;

public interface DispensingMapper {

	List<Dispensing> findAllDispensing(Map<String, String> map);

	Dispensing dispensingGive(String medical_record);

	void updateDispensing(Map<String, Object> map);

	Dispensing dispensingDetail(String medical_record);

	void updateNum(Dispensing dispensing);

	void updateOne(Dispensing dispensing);

	void updateFive(Dispensing dispensing);

	void updateDelive(Dispensing dispensing);

}

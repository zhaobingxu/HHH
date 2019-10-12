package com.zhiyou100.mapper;

import com.zhiyou100.model.HospitalInfor;

import java.util.List;
import java.util.Map;

public interface HospitalMapper {

	List<HospitalInfor> findAllHospital(Map<String, String> map);

	HospitalInfor findHospitalById(String medical_record);

	void insertHospital(HospitalInfor hospitalInfor);

	HospitalInfor findHospitalOneById(String medical_record);

	void updateHospitalById(HospitalInfor hospitalInfor);

	void dischargeHospitalByid(Map<String, String> map);

	void leaveHospitalByid(Map<String, String> map);

}

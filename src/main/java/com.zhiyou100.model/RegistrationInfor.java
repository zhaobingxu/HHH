package com.zhiyou100.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RegistrationInfor implements Serializable{
	private String doctor;
	private String section;
	private Section section2;
	@Override
	public String toString() {
		return "RegistrationInfor [doctor=" + doctor + ", section=" + section + ", section2=" + section2 + ", doctor2="
				+ doctor2 + ", certificateType=" + certificateType + ", medical_record=" + medical_record + ", name="
				+ name + ", certificate_type=" + certificate_type + ", ID_num=" + ID_num + ", social_safe_num="
				+ social_safe_num + ", phone=" + phone + ", self_paying=" + self_paying + ", sex=" + sex + ", career="
				+ career + ", early_appointment=" + early_appointment + ", doctor_id=" + doctor_id + ", status="
				+ status + ", noted=" + noted + ", time=" + time + ", time1=" + time1 + ", section_id=" + section_id
				+ ", age=" + age + ", registration_fee=" + registration_fee + "]";
	}



	public Section getSection2() {
		return section2;
	}



	public void setSection2(Section section2) {
		this.section2 = section2;
	}



	public Doctor getDoctor2() {
		return doctor2;
	}



	public void setDoctor2(Doctor doctor2) {
		this.doctor2 = doctor2;
	}



	public CertificateType getCertificateType() {
		return certificateType;
	}



	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	private Doctor doctor2;
	private CertificateType certificateType;
    public String getDoctor() {
		return doctor;
	}

	

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	private String medical_record;

    private String name;

    private String certificate_type;

    private String ID_num;

    private String social_safe_num;

    private String phone;

    private Integer self_paying;

    private Integer sex;

    private String career;

    private String early_appointment;

    private Integer doctor_id;

    private String status;

    private String noted;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time1;
    public Date getTime1() {
		return time1;
	}
	public void setTime1(Date time1) {
		this.time1 = time1;
	}

	private Integer section_id;

    private Integer age;

    private Double registration_fee;

	public String getMedical_record() {
		return medical_record;
	}

	public void setMedical_record(String medical_record) {
		this.medical_record = medical_record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificate_type() {
		return certificate_type;
	}

	public void setCertificate_type(String certificate_type) {
		this.certificate_type = certificate_type;
	}

	public String getID_num() {
		return ID_num;
	}

	public void setID_num(String iD_num) {
		ID_num = iD_num;
	}

	public String getSocial_safe_num() {
		return social_safe_num;
	}

	public void setSocial_safe_num(String social_safe_num) {
		this.social_safe_num = social_safe_num;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSelf_paying() {
		return self_paying;
	}

	public void setSelf_paying(Integer self_paying) {
		this.self_paying = self_paying;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getEarly_appointment() {
		return early_appointment;
	}

	public void setEarly_appointment(String early_appointment) {
		this.early_appointment = early_appointment;
	}

	public Integer getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNoted() {
		return noted;
	}

	public void setNoted(String noted) {
		this.noted = noted;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getSection_id() {
		return section_id;
	}

	public void setSection_id(Integer section_id) {
		this.section_id = section_id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getRegistration_fee() {
		return registration_fee;
	}

	public void setRegistration_fee(Double registration_fee) {
		this.registration_fee = registration_fee;
	}

	
   
}
package com.zhiyou100.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{
	
	private String ro;
    public String getRo() {
		return ro;
	}

	public void setRo(String ro) {
		this.ro = ro;
	}

	private Integer id;

    private String userName;

    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date update_time;

    private Integer status;

    @Override
	public String toString() {
		return "User [ro=" + ro + ", id=" + id + ", userName=" + userName + ", password=" + password + ", update_time="
				+ update_time + ", status=" + status + ", real_name=" + real_name + ", email=" + email + "]";
	}

	private String real_name;

    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



    
}
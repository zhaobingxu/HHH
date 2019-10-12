package com.zhiyou100.model;

import java.io.Serializable;

public class CertificateType implements Serializable{
    private Integer id;

    private String name;

    @Override
	public String toString() {
		return "CertificateType [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
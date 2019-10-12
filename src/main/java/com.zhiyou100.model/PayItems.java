package com.zhiyou100.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PayItems implements Serializable{
	private String  idd;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date time;
    private Integer id;

    private String charge_item_name;

    private Double receivable_money;

	public Integer getId() {
		return id;
	}

	

	@Override
	public String toString() {
		return "PayItems [idd=" + idd + ", name=" + name + ", time=" + time + ", id=" + id + ", charge_item_name="
				+ charge_item_name + ", receivable_money=" + receivable_money + "]";
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public String getCharge_item_name() {
		return charge_item_name;
	}

	public void setCharge_item_name(String charge_item_name) {
		this.charge_item_name = charge_item_name;
	}

	public Double getReceivable_money() {
		return receivable_money;
	}

	public void setReceivable_money(Double receivable_money) {
		this.receivable_money = receivable_money;
	}



	public String getIdd() {
		return idd;
	}



	public void setIdd(String idd) {
		this.idd = idd;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getTime() {
		return time;
	}



	public void setTime(Date time) {
		this.time = time;
	}

	
	

   
}
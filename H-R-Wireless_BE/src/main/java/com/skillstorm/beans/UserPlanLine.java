package com.skillstorm.beans;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Userplanline")
public class UserPlanLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int line_Id;
	
	@Column(unique=true, name="phonenumber") 
	//@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long phonenumber;
	
	
	@Column(name = "userplan_Id")
	private int userplan_Id;
	
	@Column(name = "device_Id")
	private int device_Id;
	
	public UserPlanLine() {
		super();
	}

	public UserPlanLine(@NotNull long phonenumber, int userplan_Id, int device_Id) {
	
		this.phonenumber = phonenumber;
		this.userplan_Id = userplan_Id;
		this.device_Id = device_Id;
	}
	
	public UserPlanLine(int line_Id, @NotNull long phonenumber, int userplan_Id, int device_Id) {
		
		this.line_Id = line_Id;
		this.phonenumber = phonenumber;
		this.userplan_Id = userplan_Id;
		this.device_Id = device_Id;
	}
	
	public int getLine_Id() {
		return line_Id;
	}

	public void setLine_Id(int line_Id) {
		this.line_Id = line_Id;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getUserplan_Id() {
		return userplan_Id;
	}

	public void setUserplan_Id(int userplan_Id) {
		this.userplan_Id = userplan_Id;
	}

	public int getDevice_Id() {
		return device_Id;
	}

	public void setDevice_Id(int device_Id) {
		this.device_Id = device_Id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(device_Id, line_Id, phonenumber, userplan_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPlanLine other = (UserPlanLine) obj;
		return device_Id == other.device_Id && line_Id == other.line_Id && phonenumber == other.phonenumber
				&& userplan_Id == other.userplan_Id;
	}

	@Override
	public String toString() {
		return "UserPlanLine [line_Id=" + line_Id + ", phonenumber=" + phonenumber + ", userplan_Id=" + userplan_Id
				+ ", device_Id=" + device_Id + "]";
	}

	
}

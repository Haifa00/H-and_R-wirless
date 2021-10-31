package com.skillstorm.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Userplanline")
public class UserPlanLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int line_Id;
	
	@Column(unique=true) 
	//@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int phonenumber;
	
	@Column
	private int userplan_Id;
	
	
	
	@Column
	private int device_Id;
		
		
	public UserPlanLine() {
		super();
	}

		
	public UserPlanLine(int userPlan_Id, int device_Id) {
		
		this.userplan_Id = userPlan_Id;
		this.device_Id = device_Id;
	}



	public UserPlanLine(@NotNull int phoneNumber, int userPlan_Id, int device_Id) {
	
		this.phonenumber = phoneNumber;
		this.userplan_Id = userPlan_Id;
		this.device_Id = device_Id;
	}
	
	public UserPlanLine(int line_Id, @NotNull int phoneNumber, int userPlan_Id, int device_Id) {
		
		this.line_Id = line_Id;
		this.phonenumber = phoneNumber;
		this.userplan_Id = userPlan_Id;
		this.device_Id = device_Id;
	}
	
	public int getLine_Id() {
		return line_Id;
	}

	public void setLine_Id(int line_Id) {
		this.line_Id = line_Id;
	}

	public int getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phonenumber = phoneNumber;
	}

	public int getUserPlan_Id() {
		return userplan_Id;
	}

	public void setUserPlan_Id(int userPlan_Id) {
		this.userplan_Id = userPlan_Id;
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
		return "UserPlanLine [line_Id=" + line_Id + ", phoneNumber=" + phonenumber + ", userPlan_Id=" + userplan_Id
				+ ", device_Id=" + device_Id + "]";
	}

	
}

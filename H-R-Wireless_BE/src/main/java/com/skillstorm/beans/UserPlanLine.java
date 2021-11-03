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
	
	@Column(unique=true, name="phoneNumber") 
	//@Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long phoneNumber;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userPlan_Id")
	private UserPlan userPlan;
	
	@Column(name = "device_Id")
	private int device_Id;
	
	public UserPlanLine() {
		super();
	}

	public UserPlanLine(@NotNull long phoneNumber, UserPlan userPlan, int device_Id) {
	
		this.phoneNumber = phoneNumber;
		this.userPlan = userPlan;
		this.device_Id = device_Id;
	}
	
	public UserPlanLine(int line_Id, @NotNull long phoneNumber, UserPlan userPlan, int device_Id) {
		
		this.line_Id = line_Id;
		this.phoneNumber = phoneNumber;
		this.userPlan = userPlan;
		this.device_Id = device_Id;
	}
	
	public int getLine_Id() {
		return line_Id;
	}

	public void setLine_Id(int line_Id) {
		this.line_Id = line_Id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserPlan getUserPlan() {
		return userPlan;
	}

	public void setUserPlan(UserPlan userPlan) {
		this.userPlan = userPlan;
	}

	public int getDevice_Id() {
		return device_Id;
	}

	public void setDevice_Id(int device_Id) {
		this.device_Id = device_Id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(device_Id, line_Id, phoneNumber, userPlan);
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
		return device_Id == other.device_Id && line_Id == other.line_Id && phoneNumber == other.phoneNumber
				&& userPlan == other.userPlan;
	}

	@Override
	public String toString() {
		return "UserPlanLine [line_Id=" + line_Id + ", phoneNumber=" + phoneNumber + ", userPlan=" + userPlan
				+ ", device_Id=" + device_Id + "]";
	}

	
}

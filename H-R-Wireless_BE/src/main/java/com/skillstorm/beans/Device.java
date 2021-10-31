//package com.skillstorm.beans;
//
//import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name="Devices")
//public class Device {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int deviceId;
//
//	@Column
//	@NotBlank
//	@NotNull
//	private String deviceName;
//
//
//	@Column
//	@NotBlank
//	@NotNull
//	private String specialFeature;
//
//
//	public Device(int deviceId, @NotBlank @NotNull String deviceName, @NotBlank @NotNull String specialFeature,
//			String phoneNumber) {
//
//		this.deviceId = deviceId;
//		this.deviceName = deviceName;
//		this.specialFeature = specialFeature;
//
//	}
//
//	public Device(@NotBlank @NotNull String deviceName, @NotBlank @NotNull String specialFeature, String phoneNumber) {
//
//		this.deviceName = deviceName;
//		this.specialFeature = specialFeature;
//
//	}
//
//	public Device(@NotBlank @NotNull String deviceName, @NotBlank @NotNull String specialFeature) {
//
//		this.deviceName = deviceName;
//		this.specialFeature = specialFeature;
//	}
//
//	@Override
//	public String toString() {
//		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName + ", specialFeature=" + specialFeature
//				+ "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(deviceId, deviceName, specialFeature);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Device other = (Device) obj;
//		return deviceId == other.deviceId && Objects.equals(deviceName, other.deviceName)
//				&& Objects.equals(specialFeature, other.specialFeature);
//	}
//}

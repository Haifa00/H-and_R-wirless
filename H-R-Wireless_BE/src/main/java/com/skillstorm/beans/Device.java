package com.skillstorm.beans;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Devices")
public class Device {
	
	@Id
	private int device_id;
	
	@Column(name = "model")
	@NotBlank
	@NotNull
	private String model;
	
	
	@Column(name = "price")
	@NotBlank
	@NotNull
	private int price;

	@Column(name = "image")
	@NotNull
	private String image;

	public int getDevice_id() {
		return device_id;
	}


	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getDeviceId() {
		return device_id;
	}


	public void setDeviceId(int deviceId) {
		this.device_id = deviceId;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Device(int deviceId, @NotBlank @NotNull String model, @NotBlank @NotNull int price, @NotNull String image) {
		
		this.device_id = deviceId;
		this.model = model;
		this.price = price;
		this.image = image;
	}


	@Override
	public String toString() {
		return "Device [deviceId=" + device_id + ", model=" + model + ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(device_id, model, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return device_id == other.device_id && Objects.equals(model, other.model) && price == other.price;
	}


	public Device() {
		super();
	}
	

	
}

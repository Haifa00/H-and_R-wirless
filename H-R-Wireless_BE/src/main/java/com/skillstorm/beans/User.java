package com.skillstorm.beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="USERS")
public class User {
	
	@Id
	private String userName;
	
	@Column
	@NotBlank
	@NotNull
	private String firstName;

	@Column
	@NotBlank
	@NotNull
	private String lastName;

	@Column
	private String email;
	
	@Column
	private int Idbill;

	public User(String userName, @NotBlank String firstName, @NotBlank String lastName, String email, int idbill) {
		
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Idbill = idbill;
	}

	public User(String userName, @NotBlank String firstName, @NotBlank String lastName, int idbill) {
		
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		Idbill = idbill;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdbill() {
		return Idbill;
	}

	public void setIdbill(int idbill) {
		Idbill = idbill;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", Idbill=" + Idbill + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Idbill, email, firstName, lastName, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Idbill == other.Idbill && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(userName, other.userName);
	}
	
	
}

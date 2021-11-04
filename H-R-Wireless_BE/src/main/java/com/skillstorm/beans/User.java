package com.skillstorm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private Integer userId; // for join the type must be object name of the class

	@Column(name="firstname")
	@NotNull
	private String firstname;

	@Column(name="lastname")
	@NotNull
	private String lastname;

	@NotBlank
	@NotNull
	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;


	@JsonIgnoreProperties("user")
	@OneToMany(mappedBy = "user")
	private Set<UserPlan> userPlans= new HashSet<>();

	public User() {
	}

	public User( String firstname, String lastname, String username, String password, Set<UserPlan> userPlans) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.userPlans= userPlans;
	}
	public Set<UserPlan> getUserPlans() {
		return userPlans;
	}

	public void setUserPlans(Set<UserPlan> userPlan) {
		this.userPlans = userPlans;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", userPlan=" + userPlans +
				'}';
	}
}

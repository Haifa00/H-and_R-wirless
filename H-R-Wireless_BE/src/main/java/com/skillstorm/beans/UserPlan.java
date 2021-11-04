package com.skillstorm.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="userplan")
public class UserPlan {
    @Id
    @Column(name="userplan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="plan_id")
    @NotNull
    private Plans plan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="nickname")
    private String nickname;
    
  
	public UserPlan() {
    }

    public UserPlan(Plans plan,User user, String nickname) {
        this.plan = plan;
        this.user=user;
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Plans getPlan() {
        return plan;
    }

    public void setPlan(Plans plan) {
        this.plan = plan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, plan, nickname);
    }

    @Override
    public String toString() {
        return "UserPlan{" +
                "id=" + id +
                ", plan=" + plan +
                ", user=" + user +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}

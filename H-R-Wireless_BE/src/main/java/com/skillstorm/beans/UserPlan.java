package com.skillstorm.beans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="userplan")
public class UserPlan {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="planid")
    @NotNull
    private Plans plan;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid")
    @NotNull
    private User user;

    @Column(name="nickname")
    private String nickname;

    
    @OneToMany(mappedBy = "userPlan")
	private Set<UserPlanLine> userPlanLines;
    
  
	public UserPlan() {
    }

    public UserPlan(Plans plan, User user, String nickname) {
        this.plan = plan;
        this.user = user;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPlan userPlan = (UserPlan) o;
        return Objects.equals(id, userPlan.id) && Objects.equals(plan, userPlan.plan) && Objects.equals(user, userPlan.user) && Objects.equals(nickname, userPlan.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plan, user, nickname);
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
    
    
    
    
    public Set<UserPlanLine> getUserPlanLines() {
  		return userPlanLines;
  	}

  	public void setUserPlanLines(Set<UserPlanLine> userPlanLines) {
  		this.userPlanLines = userPlanLines;
  	}

}

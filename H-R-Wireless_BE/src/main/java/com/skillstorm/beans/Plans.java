package com.skillstorm.beans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="plans")
public class Plans {
    @Id
    @Column(name="planid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planId;

    @Column(name="name")
    @NotNull
    private String name;

    @Column(name="numberoflines")
    @NotNull
    private int numberOfLines;

    @Column(name="description")
    @NotNull
    private String description;

    @Column(name="priceperline")
    @NotNull
    private int pricePerLine;


    public Plans() {
    }

    public Plans( String name, int numberOfLines, String description, int pricePerLine) {
        this.name = name;
        this.numberOfLines = numberOfLines;
        this.description = description;
        this.pricePerLine = pricePerLine;
    }


    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPricePerLine() {
        return pricePerLine;
    }

    public void setPricePerLine(int pricePerLine) {
        this.pricePerLine = pricePerLine;
    }

//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plans plans = (Plans) o;
        return planId == plans.planId && numberOfLines == plans.numberOfLines && pricePerLine == plans.pricePerLine && Objects.equals(name, plans.name) && Objects.equals(description, plans.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, name, numberOfLines, description, pricePerLine);
    }

    @Override
    public String toString() {
        return "Plans{" +
                "planId=" + planId +
                ", name='" + name + '\'' +
                ", numberOfLines=" + numberOfLines +
                ", description='" + description + '\'' +
                ", pricePerLine=" + pricePerLine +
                '}';
    }

}

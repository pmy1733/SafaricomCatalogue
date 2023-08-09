package com.meroka.java.catalogue;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.math3.analysis.function.Identity;

Identity @Table(name="safaricom_catalogue")

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int itemId;

    private String name;

    private String description;

    private String link;
    private String division;
    private String team;

    public Product() {
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkString() {
        return link;
    }

    public void setTeam(String team) {
        this.team = link;
    }
     public String getTeamString() {
        return team;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    public String getDescriptioString() {
        return division;
    }

    @Override
    public String toString() {
        return "Product [itemId=" + itemId + ", name=" + name + "link=" + "description" + description + " team" + team
                + " division" + division + " link=" + link + "]";
    }
}
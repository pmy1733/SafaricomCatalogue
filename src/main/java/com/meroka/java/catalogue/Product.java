package com.meroka.java.catalogue;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int itemId;

    private String name;

    private String description;

    private String link;
    private String division;
    private String team;

    public Product(int id, String name, String link, String description) {
        this.itemId = id;
        this.name = name;
        this.link = link;
        this.description = description;
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
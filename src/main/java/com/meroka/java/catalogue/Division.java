package com.meroka.java.catalogue;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "division")

public class Division implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int divisionId;

    private String name;

    public Division(int id, String name) {
        this.divisionId = id;
        this.name = name;
    }

    public int getTeamID() {
        return divisionId;
    }

    public void setTeamId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [dision Id=" + divisionId + ", name=" + name + "]";
    }
}
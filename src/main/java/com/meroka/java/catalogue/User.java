package com.meroka.java.catalogue;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int userId;

    private String name;

    private String password;

    public User(int id, String name, String password) {
        this.userId = id;
        this.name = name;
        this.password = password;
    }

    public int getTeamID() {
        return userId;
    }

    public void setTeamId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Product [Team Id=" + userId + ", name=" + name + "]";
    }
}
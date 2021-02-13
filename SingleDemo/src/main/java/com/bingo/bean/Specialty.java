package com.bingo.bean;

import java.util.Objects;

//特长
public class Specialty {
    private int id;
    private int userId;
    private String name;
    private String description;
    private Specialty next;

    public Specialty getNext() {
        return next;
    }

    public void setNext(Specialty next) {
        this.next = next;
    }

    public Specialty() {}

    public Specialty(int userId, String name, String description) {
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    public Specialty(int id, int userId, String name, String description) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialty specialty = (Specialty) o;
        return id == specialty.id &&
                userId == specialty.userId &&
                Objects.equals(name, specialty.name) &&
                Objects.equals(description, specialty.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, name, description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
}

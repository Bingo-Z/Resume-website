package com.bingo.bean;

import javax.print.DocFlavor;
import java.util.Objects;

public class Edu {
    private int id;
    private int userId;
    private String start;
    private String end;
    private String school;
    private String study;
    private String description;
    private Edu next;

    public Edu(int userId, String start, String end, String school, String study, String description, Edu next) {
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
        this.next = next;
    }

    public Edu getNext() {
        return next;
    }

    public void setNext(Edu next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Edu{" +
                "id=" + id +
                ", userId=" + userId +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", school='" + school + '\'' +
                ", study='" + study + '\'' +
                ", description='" + description + '\'' +
                ", next=" + next +
                '}';
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edu edu = (Edu) o;
        return id == edu.id &&
                userId == edu.userId &&
                Objects.equals(start, edu.start) &&
                Objects.equals(end, edu.end) &&
                Objects.equals(school, edu.school) &&
                Objects.equals(study, edu.study) &&
                Objects.equals(description, edu.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, start, end, school, study, description);
    }

    public Edu() {
    }

    public Edu(int userId, String start, String end, String school, String study, String description) {
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
    }

    public Edu(int id, int userId, String start, String end, String school, String study, String description) {
        this.id = id;
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
    }
}

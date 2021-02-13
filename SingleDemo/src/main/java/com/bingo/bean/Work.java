package com.bingo.bean;

import java.util.Objects;

//工作
public class Work {
    private int id;
    private int userId;
    private String start;
    private String end;
    private String company;
    private String job;
    private String description;
    private Work next;

    public Work getNext() {
        return next;
    }

    public void setNext(Work next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", userId=" + userId +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
        Work work = (Work) o;
        return id == work.id &&
                userId == work.userId &&
                Objects.equals(start, work.start) &&
                Objects.equals(end, work.end) &&
                Objects.equals(company, work.company) &&
                Objects.equals(job, work.job) &&
                Objects.equals(description, work.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, start, end, company, job, description);
    }

    public Work(int id, int userId, String start, String end, String company, String job, String description) {
        this.id = id;
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.company = company;
        this.job = job;
        this.description = description;
    }

    public Work(int userId, String start, String end, String company, String job, String description) {
        this.userId = userId;
        this.start = start;
        this.end = end;
        this.company = company;
        this.job = job;
        this.description = description;
    }

    public Work() {

    }
}

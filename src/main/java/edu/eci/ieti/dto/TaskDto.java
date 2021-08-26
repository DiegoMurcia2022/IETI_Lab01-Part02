package edu.eci.ieti.dto;

import java.util.Date;

import edu.eci.ieti.util.Status;

public class TaskDto {
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date duDate;
    private boolean created;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return this.assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getDuDate() {
        return this.duDate;
    }

    public void setDuDate(Date duDate) {
        this.duDate = duDate;
    }

    public boolean isCreated() {
        return this.created;
    }

    public boolean getCreated() {
        return this.created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }
}

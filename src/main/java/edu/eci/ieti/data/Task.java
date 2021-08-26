package edu.eci.ieti.data;

import java.util.Date;

import edu.eci.ieti.dto.TaskDto;
import edu.eci.ieti.util.Status;

public class Task {
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private boolean created;

    public Task(TaskDto taskDto) {
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.assignedTo = taskDto.getAssignedTo();
        this.created = taskDto.getCreated();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

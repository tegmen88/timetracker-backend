package org.timeTracker.models;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import java.util.Date;

public class Task extends PanacheMongoEntity {
    public String name;
    public String duration;
    public String description;
    public Date startTime;
    public Date endTime;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    } 
}

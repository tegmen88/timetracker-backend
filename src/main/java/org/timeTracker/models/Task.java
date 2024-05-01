package org.timeTracker.models;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import java.util.Date;

public class Task extends PanacheMongoEntity {
    public String name;
    public String duration;
    public String description;
    public Date startTime;
    public Date endTime;
}

package com.phodal.okr.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Objective {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String name;
    private String progress;

    public Objective() {
    }

    public Objective(String id, String name, String progress, String description, String type) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.description = description;
        this.type = type;
    }

    public Objective(String id, String name, String progress, String description, String type, String parentObjectiveId) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.description = description;
        this.type = type;
        this.parentObjectiveId = parentObjectiveId;
    }

    private String description;
    private String type;
    private String parentObjectiveId;

    public Objective(String objectiveId, String objective, String description, String type) {
        this.id = objectiveId;
        this.name = objective;
        this.description = description;
        this.type = type;
    }

    public String getParentObjectiveId() {
        return parentObjectiveId;
    }

    public void setParentObjectiveId(String parentObjectiveId) {
        this.parentObjectiveId = parentObjectiveId;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) { this.type = type; }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgress() {
        return progress;
    }

    public void setId(String id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setProgress(String progress) { this.progress = progress; }
}


package com.phodal.okr.controller.dto;

//ObjectiveResponse: { "id": string, "name": string, "description": string, "type": string }
public class ObjectiveResponse {
    private String id;
    private String name;
    private String description;
    private String type;

    public ObjectiveResponse() {
    }

    public ObjectiveResponse(String id, String name, String description, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package org.sefglobal.giraffe.api.beans;

public class Score {
    private int id;
    private int entityId;
    private String description;
    private int points;
    private String status;

    public Score() {
    }

    public Score(int id, int entityId, String description, int points, String status) {
        this.id = id;
        this.entityId = entityId;
        this.description = description;
        this.points = points;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

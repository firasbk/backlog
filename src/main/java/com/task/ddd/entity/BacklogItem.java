package com.task.ddd.entity;

public class BacklogItem extends ConcurrencySafeEntity{
    String id ;
    String status;
    String story;
    Integer storyPoints;
    String summary;
    String type;
    TenantId tenantId;
    TeamMemberId teamId;

    public TenantId tenantId() {
        return this.tenantId;
    }
    public TeamMemberId teamId() {
        return this.teamId;
    }
    public void assignTeamMemberToTask(TeamMemberId teamMemberId, Team ofTeam, TaskId
            taskId) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Integer getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(Integer storyPoints) {
        this.storyPoints = storyPoints;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TenantId getTenantId() {
        return tenantId;
    }

    public void setTenantId(TenantId tenantId) {
        this.tenantId = tenantId;
    }

    public TeamMemberId getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamMemberId teamId) {
        this.teamId = teamId;
    }
}

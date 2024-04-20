package com.task.ddd.entity;

public class Team extends ConcurrencySafeEntity{
    TeamMemberId teamId;
    public TeamMemberId getTeamId() {
        return this.teamId;
    }
}
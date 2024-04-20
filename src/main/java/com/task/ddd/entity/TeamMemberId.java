package com.task.ddd.entity;

public class TeamMemberId extends ConcurrencySafeEntity{
    String id;
    public TeamMemberId(String teamMemberId) {
        this.id = teamMemberId;
    }
}

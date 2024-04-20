package com.task.ddd.entity;

public class BacklogItemId extends ConcurrencySafeEntity{
    String id ;
    public BacklogItemId(String backlogItemId) {
        this.id = backlogItemId;
    }
}
